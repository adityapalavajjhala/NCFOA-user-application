package com.example.ncfoa_user_application.ui.qr_paymentVerification;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.ncfoa_user_application.R;

public class MoveFrag extends FragmentActivity {
    public void moveToFragment(Fragment fragment)  {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

    }
}
