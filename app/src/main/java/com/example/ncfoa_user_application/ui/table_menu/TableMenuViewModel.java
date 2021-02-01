package com.example.ncfoa_user_application.ui.table_menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TableMenuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TableMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Menu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}