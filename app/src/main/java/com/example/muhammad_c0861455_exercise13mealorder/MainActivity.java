package com.example.muhammad_c0861455_exercise13mealorder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    Button orderButton;
    TextView quantityTv;
    Spinner spinner;
    EditText price;

    String[] meals = {"Biryani", "Butter Chicken", "Chicken Burger"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.Spinner);
        price = (EditText) findViewById(R.id.price);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        quantityTv = (TextView) findViewById(R.id.quantityTv);
        orderButton = (Button) findViewById(R.id.orderButton);

        ArrayAdapter ad = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, meals);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             //   price.setText(spinner.getSelectedItem(10));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner.setAdapter(ad);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                quantityTv.setText("Quantity: " + String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

}