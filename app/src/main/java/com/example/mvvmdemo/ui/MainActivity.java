package com.example.mvvmdemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.model.Model;
import com.example.mvvmdemo.view.ViewModel;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {
    private Button button;
    private TextView textView;
    private EditText editText;
    public static MainActivity mainActivity = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mainActivity=this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.firstButton);
        textView = findViewById(R.id.firstTextView);
        editText = findViewById(R.id.firstEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewModel.viewModel.setText(editText.getText().toString());
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        textView.setText(Model.model.getText());
    }
}
