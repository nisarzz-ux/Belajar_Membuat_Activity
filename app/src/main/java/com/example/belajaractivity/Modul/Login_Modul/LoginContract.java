package com.example.belajaractivity.Modul.Login_Modul;

import com.example.myintent.base.BasePresenter;
import com.example.myintent.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
