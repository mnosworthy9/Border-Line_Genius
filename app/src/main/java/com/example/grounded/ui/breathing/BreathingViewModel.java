package com.example.grounded.ui.breathing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BreathingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BreathingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is breathing frag");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
