package com.example.mvvmdemo.model;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvvmdemo.R;

public class Model {
    private String text;

    public static Model model = new Model();

    private Model() {}


    public void setTextView(String text2, TextView textView) {
        text = text2;
        textView.setText(text);
    }

}
