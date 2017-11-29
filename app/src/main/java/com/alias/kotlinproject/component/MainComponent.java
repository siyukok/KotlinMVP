package com.alias.kotlinproject.component;

import com.alias.kotlinproject.activity.MainActivity;

import dagger.Component;

/**
 * Created by ASUS on 2017/11/29.
 */

@Component(dependencies = AppComponent.class)
public interface MainComponent {
    MainActivity inject(MainActivity mainActivity);
}
