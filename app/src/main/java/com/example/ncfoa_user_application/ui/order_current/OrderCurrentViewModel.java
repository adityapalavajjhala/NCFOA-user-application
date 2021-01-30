package com.example.ncfoa_user_application.ui.order_current;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrderCurrentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrderCurrentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Current order fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}