package com.alias.kotlinproject.component;

import android.content.Context;

import com.alias.kotlinproject.module.AppModule;

import dagger.Component;

/**
 * Created by ASUS on 2017/11/29.
 */

@Component(modules = AppModule.class)
public interface AppComponent {
    Context getContext();
}
