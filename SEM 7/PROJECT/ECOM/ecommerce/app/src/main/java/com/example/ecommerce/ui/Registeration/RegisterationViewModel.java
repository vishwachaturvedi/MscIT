package com.example.ecommerce.ui.Registeration;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisterationViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public RegisterationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is registeration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}