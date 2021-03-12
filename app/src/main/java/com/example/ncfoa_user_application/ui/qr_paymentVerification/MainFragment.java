package com.example.ncfoa_user_application.ui.qr_paymentVerification;

import androidx.fragment.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;


import com.example.ncfoa_user_application.R;

public class MainFragment extends Fragment implements View.OnClickListener {
    private Button fragment_btn_1;
    private Button fragment_btn_2;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        fragment_btn_2 = (Button) view.findViewById(R.id.fragment_button_2);
        fragment_btn_2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.fragment_button_2:
                MoveFrag m = new MoveFrag();
                Fragment fragment2 = new QrPaymentVerificationFragment();
               m.moveToFragment(fragment2);
                break;
        }
    }

}


