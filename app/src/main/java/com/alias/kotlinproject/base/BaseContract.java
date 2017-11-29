package com.alias.kotlinproject.base;

/**
 * Created by ASUS on 2017/11/29.
 */

public interface BaseContract {
    interface BasePresenter<T> {
        void attachView(T view);

        void detachView();
    }

    interface BaseView {
        void showError();

        void complete();
    }
}
