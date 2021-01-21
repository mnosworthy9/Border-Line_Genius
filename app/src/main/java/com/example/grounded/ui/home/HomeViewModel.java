package com.example.grounded.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class HomeViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        int randomElemenetIndex = (int) (Math.random() * 10) % 6; //100000) % 75966 for file
        String[] lines = {"Age is an issue of mind over matter. If you don't mind, it doesn't matter.;Mark Twain;age",
        "Anyone who stops learning is old, whether at twenty or eighty. Anyone who keeps learning stays young. The greatest thing in life is to keep your mind young.;Henry Ford;age",
        "Wrinkles should merely indicate where smiles have been.;Mark Twain;age",
        "A diplomat is a man who always remembers a woman's birthday but never remembers her age.;Robert Frost;age",
        "How incessant and great are the ills with which a prolonged old age is replete.;C. S. Lewis;age",
        "As I grow older, I pay less attention to what men say. I just watch what they do.;Andrew Carnegie;age"};

        String line = lines[randomElemenetIndex];

        mText.setValue(line);

    }

    public LiveData<String> getText() {
        return mText;
    }
}