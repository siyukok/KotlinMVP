package com.alias.kotlinproject.presenter;

import com.alias.kotlinproject.base.RxPresenter;
import com.alias.kotlinproject.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by ASUS on 2017/11/29.
 */

public class MainActivityPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter<MainContract.View>{

    @Inject
    public MainActivityPresenter(){

    }

    @Override
    public void click(String clickMessage) {
        mView.clickSuccess(clickMessage);
    }
}
