package com.zoeyoung.codetask.injection.module;

import android.app.Application;
import android.content.Context;

import com.zoeyoung.codetask.injection.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zoeyoung on 07/04/2017.
 * Provid application-level dependencies.
 */
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }


}
