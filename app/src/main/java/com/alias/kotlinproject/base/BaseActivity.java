package com.alias.kotlinproject.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alias.kotlinproject.APP;
import com.alias.kotlinproject.component.AppComponent;

/**
 * Created by ASUS on 2017/11/29.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setupActivityComponent(APP.getInstance().getAppComponent());
        configViews();
    }

    public abstract int getLayoutId();

    public abstract void setupActivityComponent(AppComponent appComponent);

    public abstract void configViews();
}
