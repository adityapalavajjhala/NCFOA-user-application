package com.example.ncfoa_user_application.ui.qr_scanner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QRScannerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QRScannerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is QR scanner fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}