package com.zoeyoung.codetask.ui.base;

/**
 * Created by zoeyoung on 09/04/2017.
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */

public interface Presenter<T extends MvpView> {

    void attachView(T mvpView);

    void detachView();
}
