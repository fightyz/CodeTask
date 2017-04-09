package com.zoeyoung.codetask.injection.component;

import android.content.Context;

import com.zoeyoung.codetask.injection.ApplicationContext;
import com.zoeyoung.codetask.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zoeyoung on 07/04/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject();

    @ApplicationContext
    Context context();

}
