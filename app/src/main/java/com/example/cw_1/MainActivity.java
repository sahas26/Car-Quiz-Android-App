package com.example.cw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {  //this appCompatActivity inherited from android support library
    Button but_forNow;   // make identyfy button
    Button butte_com;    // identify cars button
    Button butto_zero;  // advance button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//before create my functionality i want to include my parent activity
        setContentView(R.layout.activity_main);//provide a perticular view to activity and attaching layout activity

        but_forNow=findViewById(R.id.make_iden);                      //initialize a make indentyfy button
        but_forNow.setOnClickListener(new View.OnClickListener() {    // initialize a action to click
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2_identify.class);  // give a massage to change the class
                startActivity(intent);
            }
        });

        butte_com=findViewById(R.id.iden_cab);                        //set identify cars button
        butte_com.setOnClickListener(new View.OnClickListener() {    //set a action to click
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,Identify_Cars.class);  // set a path to identify car
                startActivity(intent4);
            }
        });

        butto_zero=findViewById(R.id.AOKE);                          //set advance button
        butto_zero.setOnClickListener(new View.OnClickListener() {   //set a action to click
            @Override
            public void onClick(View v) {
                Intent inten_coren=new Intent(MainActivity.this,advance.class);    //set a path to advance
                startActivity(inten_coren);
            }
        });


    }
}