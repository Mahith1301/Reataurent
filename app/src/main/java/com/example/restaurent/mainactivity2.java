package com.example.restaurent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mainactivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button button4, button5, button6;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainactivity2.this, "Fried rice ready to serve", Toast.LENGTH_SHORT).show();
                Log.i("veg", "onClick: ");
                Log.i("veg", "Fried rice");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainactivity2.this, "VEG Biryani to serve", Toast.LENGTH_SHORT).show();
                Log.d("veg", "onClick: ");
                Log.d("veg", "veg biryani");
            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainactivity2.this, "Naan and Paneer to serve", Toast.LENGTH_SHORT).show();
                Log.i("veg", "onClick: ");
                Log.i("veg", "Naan and paneer");
            }
        });
    }

    }
