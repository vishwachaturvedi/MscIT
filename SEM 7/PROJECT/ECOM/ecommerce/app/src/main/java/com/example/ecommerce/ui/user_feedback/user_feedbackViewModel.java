package com.example.ecommerce.ui.user_feedback;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class user_feedbackViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public user_feedbackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Feedback fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
