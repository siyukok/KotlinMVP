package com.alias.kotlinproject.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ASUS on 2017/11/29.
 */

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }
}
