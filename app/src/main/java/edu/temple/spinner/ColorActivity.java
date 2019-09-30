package edu.temple.spinner;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner colorSpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> colorArrayAdapter =  ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        colorArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorSpinner.setAdapter(colorArrayAdapter);

        String [] colorArray = getResources().getStringArray(R.array.colors);

        ColorAdapter adapter = new ColorAdapter(this, colorArray);
        colorSpinner.setAdapter(adapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               view.setBackgroundColor(Color.parseColor(colorSpinner.getItemAtPosition(0).toString()));

               View someView = findViewById(R.id.constraint);

               View root = someView.getRootView();

               root.setBackgroundColor(Color.parseColor(colorSpinner.getItemAtPosition(position).toString()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
