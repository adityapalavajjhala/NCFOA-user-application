package com.example.ncfoa_user_application.ui.app_help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppHelpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AppHelpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Help fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}