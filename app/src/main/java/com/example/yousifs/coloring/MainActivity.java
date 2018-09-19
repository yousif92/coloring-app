package com.example.yousifs.coloring;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button openRandomColorbtn;
    private Button freeDrawbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openRandomColorbtn = findViewById(R.id.openRandomColorbtn);
        freeDrawbtn = findViewById(R.id.freeDrawbtn);


        openRandomColorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRandomColorActivity();
            }
        });

        freeDrawbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFreeDrawActivity();
            }
        });


    }

    public void openRandomColorActivity(){
        Intent intent = new Intent(this,RandomTextColor.class);
        startActivity(intent);
    }

    public void openFreeDrawActivity(){
        Intent intent = new Intent(this,FreeDraw.class);
        startActivity(intent);
    }
}
