package com.zoeyoung.codetask.injection.component;

import com.zoeyoung.codetask.ui.home.HomeActivity;
import com.zoeyoung.codetask.injection.PerActivity;
import com.zoeyoung.codetask.injection.module.ActivityModule;

import dagger.Subcomponent;

/**
 * Created by zoeyoung on 07/04/2017.
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(HomeActivity homeActivity);
}
