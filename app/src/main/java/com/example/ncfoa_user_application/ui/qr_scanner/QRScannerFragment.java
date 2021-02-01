package com.example.ncfoa_user_application.ui.qr_scanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ncfoa_user_application.R;

public class QRScannerFragment extends Fragment {

    private QRScannerViewModel qrScannerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        qrScannerViewModel =
                new ViewModelProvider(this).get(QRScannerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qr_scanner, container, false);
        final TextView textView = root.findViewById(R.id.text_qr_scanner);
        qrScannerViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}