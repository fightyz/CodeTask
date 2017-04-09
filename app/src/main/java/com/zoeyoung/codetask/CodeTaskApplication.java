package com.zoeyoung.codetask;

import android.app.Application;
import android.content.Context;

import com.zoeyoung.codetask.injection.component.ApplicationComponent;
import com.zoeyoung.codetask.injection.component.DaggerApplicationComponent;
import com.zoeyoung.codetask.injection.module.ApplicationModule;

import timber.log.Timber;

/**
 * Created by zoeyoung on 07/04/2017.
 */

public class CodeTaskApplication extends Application {

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static CodeTaskApplication get(Context context) {
        return (CodeTaskApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }


}
