package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Button button,button2,button3;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button=findViewById(R.id.button);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);

            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i=new Intent(getApplicationContext(),mainactivity2.class);
                    startActivity(i);
                }

            });

            button2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i=new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(i);
                }

            });

            button3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i=new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(i);
                }

            });



        }

    }
