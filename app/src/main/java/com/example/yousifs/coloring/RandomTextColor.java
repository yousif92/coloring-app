package com.example.yousifs.coloring;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.lzyzsd.randomcolor.RandomColor;

import java.util.Random;

public class RandomTextColor extends AppCompatActivity {
    RandomColor randomColor = new RandomColor();
    private Button colorChanger;
    private EditText textInput;
    private TextView textView;
    private TextView colorValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_text_color);
        colorChanger = findViewById(R.id.colorChangerbtn);
        colorChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }

    public void sendMessage() {
        textInput = findViewById(R.id.textInput);
        textView = findViewById(R.id.textView);
        colorValue = findViewById(R.id.colorValueTextView);


        String messageString = textInput.getText().toString();
        textView.setText(messageString);
        textInput.setText("");
        textView.setTextColor(randomColor.randomColor());
        colorValue.setText("Color: " + String.format("#%06X",(0xFFFFFF & randomColor.randomColor())));

    }
}
