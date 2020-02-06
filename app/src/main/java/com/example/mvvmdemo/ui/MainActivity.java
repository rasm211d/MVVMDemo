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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.firstButton);
        final TextView textView = findViewById(R.id.firstTextView);
        final EditText editText = findViewById(R.id.firstEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Model.model.setTextView(editText.getText().toString(), textView);
            }
        });
    }
}
