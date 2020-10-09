package com.example.belajaractivity.Modul.Login_Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.belajaractivity.*;

/**
 * Created by fahrul on 13/03/19.
 */

public class Fragment extends BaseFragment<ActivityBase, Contract.Presenter> implements Contract.View {

    TextView textView;
    String email;
    String password;

    public Fragment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new Presenter(this);
        mPresenter.start();
        textView = fragmentView.findViewById(R.id.textView);
        textView.setText("My Username is " + email + " and My Password is " + password);
        setTitle("My Profile");
        return fragmentView;
    }

    @Override
    public void setPresenter(Contract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToProfile() {
        Intent intent = new Intent(activity, MainActivity.class);
        startActivity(intent);
        activity.finish();
    }

}
