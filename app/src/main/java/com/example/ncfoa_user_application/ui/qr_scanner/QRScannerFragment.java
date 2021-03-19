package com.example.ncfoa_user_application.ui.qr_scanner;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.ncfoa_user_application.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QRScannerFragment extends Fragment {

    public static TextView scantext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_qr_scanner, container, false);
        scantext = RootView.findViewById(R.id.scantext);


        IntentIntegrator integrator = IntentIntegrator.forSupportFragment(QRScannerFragment.this);

        integrator.setOrientationLocked(false);
        integrator.setPrompt("Scan QR code");
        integrator.setBeepEnabled(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE);


        integrator.initiateScan();
        return RootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(getContext(), "Cancelled", Toast.LENGTH_LONG).show();
            } else {

                Toast.makeText(getContext(), "Scanned : " + result.getContents(), Toast.LENGTH_LONG).show();
                scantext.setText(result.getContents());




            }
        }
    }

}