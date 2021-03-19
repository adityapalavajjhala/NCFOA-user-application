package com.example.ncfoa_user_application.ui.qr_scanner;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.Manifest;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.Result;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRScannerViewModel extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}