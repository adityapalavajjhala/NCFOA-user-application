package com.example.ncfoa_user_application.ui.qr_paymentVerification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QrPaymentVerificationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QrPaymentVerificationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is QrPaymentVerification fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}