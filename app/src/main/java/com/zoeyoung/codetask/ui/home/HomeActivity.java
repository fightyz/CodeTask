package com.zoeyoung.codetask.ui.home;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContainer;

import com.zoeyoung.codetask.R;
import com.zoeyoung.codetask.ui.base.BaseActivity;
import com.zoeyoung.codetask.ui.base.MvpView;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements MvpView {
    private static final String TAG = "HomeActivity";

//    @Inject HomePresenter mHomePresenter;

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        activityComponent().inject(this);
    }
}
