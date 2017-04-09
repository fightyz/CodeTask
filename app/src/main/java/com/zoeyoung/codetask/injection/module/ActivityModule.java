package com.zoeyoung.codetask.injection.module;

import android.app.Activity;
import android.content.Context;

import com.zoeyoung.codetask.injection.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zoeyoung on 07/04/2017.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }
}
