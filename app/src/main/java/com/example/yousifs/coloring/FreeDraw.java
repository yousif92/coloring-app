package com.example.yousifs.coloring;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.divyanshu.draw.widget.DrawView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class FreeDraw extends AppCompatActivity {
     Button clear;
    DrawView draw_view;
     Button eraser;
     Button redbtn, bluebtn, greenbtn, yellowbtn, blackbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_draw);

        clear = findViewById(R.id.clear);
        eraser = findViewById(R.id.eraser);
        redbtn = findViewById(R.id.redbtn);
        bluebtn = findViewById(R.id.bluebtn);
        greenbtn = findViewById(R.id.greeenbtn);
        yellowbtn = findViewById(R.id.yellowbtn);
        blackbtn = findViewById(R.id.blackbtn);



        draw_view = findViewById(R.id.draw_view);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.clearCanvas();
                draw_view.setStrokeWidth(15);
            }
        });

        eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.WHITE);
                draw_view.setStrokeWidth(30);
            }
        });

        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.RED);
                draw_view.setStrokeWidth(15);
            }
        });

        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.BLUE);
                draw_view.setStrokeWidth(15);
            }
        });

        yellowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.YELLOW);
                draw_view.setStrokeWidth(15);
            }
        });

        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.GREEN);
                draw_view.setStrokeWidth(15);
            }
        });
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                draw_view.setColor(Color.BLACK);
                draw_view.setStrokeWidth(15);
            }
        });


    }




}
