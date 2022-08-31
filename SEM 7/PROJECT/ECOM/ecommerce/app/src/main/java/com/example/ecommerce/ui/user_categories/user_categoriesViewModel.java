package com.example.ecommerce.ui.user_categories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class user_categoriesViewModel  extends ViewModel {
    private MutableLiveData<String> mText;
    public user_categoriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is category fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
