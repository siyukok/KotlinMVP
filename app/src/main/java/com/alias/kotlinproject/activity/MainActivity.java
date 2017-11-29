package com.alias.kotlinproject.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alias.kotlinproject.R;
import com.alias.kotlinproject.base.BaseActivity;
import com.alias.kotlinproject.component.AppComponent;
import com.alias.kotlinproject.component.DaggerAppComponent;
import com.alias.kotlinproject.component.DaggerMainComponent;
import com.alias.kotlinproject.contract.MainContract;
import com.alias.kotlinproject.presenter.MainActivityPresenter;

import javax.inject.Inject;

/**
 * Created by ASUS on 2017/11/29.
 */

public class MainActivity extends BaseActivity implements MainContract.View {
    private Button main_btn;

    @Inject
    MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main_btn = findViewById(R.id.main_btn);
        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.click("dianjile");
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void configViews() {
        mPresenter.attachView(this);
    }

    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }

    @Override
    public void clickSuccess(String clickMessage) {
        main_btn.setText(clickMessage);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
