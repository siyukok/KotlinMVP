package com.alias.kotlinproject;

import android.app.Application;

import com.alias.kotlinproject.component.AppComponent;
import com.alias.kotlinproject.component.DaggerAppComponent;
import com.alias.kotlinproject.module.AppModule;

/**
 * Created by ASUS on 2017/11/29.
 */

public class APP extends Application {
    private static APP instance;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initComponent();
    }

    private void initComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static APP getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
