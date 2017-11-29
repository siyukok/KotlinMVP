package com.alias.kotlinproject.contract;

import com.alias.kotlinproject.base.BaseContract;

/**
 * Created by ASUS on 2017/11/29.
 */

public interface MainContract extends BaseContract {
    interface View extends BaseContract.BaseView {
        void clickSuccess(String clickMessage);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void click(String clickMessage);
    }
}
