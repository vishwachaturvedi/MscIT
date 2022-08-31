package com.example.ecommerce.ui.user_order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class user_orderViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public user_orderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Order fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
