package edu.temple.spinner;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent rec_int = getIntent();
        String color = rec_int.getStringExtra("Color");
        findViewById(R.id.CanvasActivity).setBackgroundColor(Color.parseColor(color));
    }
}

