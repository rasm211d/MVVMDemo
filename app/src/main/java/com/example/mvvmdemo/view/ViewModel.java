package com.example.mvvmdemo.view;

import android.view.Display;
import android.view.View;

import com.example.mvvmdemo.model.Model;
import com.example.mvvmdemo.ui.MainActivity;

public class ViewModel {
    public static ViewModel viewModel = new ViewModel();

    private ViewModel() {
        Model.model.addObserver(MainActivity.mainActivity);
    }

    public void setText(String text) {
        Model.model.setText(text);
    }

    public void getText() {
        Model.model.getText();
    }





}
