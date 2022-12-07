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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    Button orderButton;
    TextView quantityTv;
    Spinner spinner;
    EditText price;

    private List<Meal> meals = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meals.add(new Meal("Biryani", 12));
        meals.add(new Meal("Chicken Burger", 10));
        meals.add(new Meal("Butter Chicken", 14));

        spinner = (Spinner) findViewById(R.id.Spinner);
        price = (EditText) findViewById(R.id.price);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        quantityTv = (TextView) findViewById(R.id.quantityTv);
        orderButton = (Button) findViewById(R.id.orderButton);

        List<String> mealName = meals.stream().map(meal -> meal.getName()).collect(Collectors.toList());


        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, mealName);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //   price.setText(spinner.getSelectedItem(10));
                price.setText(String.valueOf(meals.get(position).getPrice()));
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
