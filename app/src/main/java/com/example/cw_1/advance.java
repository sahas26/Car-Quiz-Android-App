package com.example.cw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class advance extends AppCompatActivity {
    ImageView image1_personalito1,image2_personalito2,image3_personalito3;  //variable for 3 imageViews
    EditText text_genetec1,text_genetec2,text_genetec3;  // create a variable for 3 edit text
    TextView texi_1,texi_2,texi_3;    //make a variables for result textView
    int click=0;   //create a variable for counting a user attempts


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);




        text_genetec1=findViewById(R.id.silver_timer1); //set a edit textView to xml layout id path for first EditText
        text_genetec2=findViewById(R.id.silver_timer2); //set a edit textView to xml layout id path for second EditText
        text_genetec3=findViewById(R.id.silver_timer3); //set a edit textView to xml layout id path for third EditText



        image1_personalito1=findViewById(R.id.pico1);  // set a first imageview id from xml layout resource
        image2_personalito2=findViewById(R.id.pico2);  // set a second imageview id from xml layout resource
        image3_personalito3=findViewById(R.id.pico3);  // set a second imageview id from xml layout resource
        Button button_to_generateLevel = (Button)findViewById(R.id.button6);  //set a button to submit in xml layout
        Button button_next=findViewById(R.id.next22);

        Integer [] cars_AdvanceLife={                         //create a  arrayList using drawable images
                R.drawable.bmw1,R.drawable.bmw2,R.drawable.bmw3,R.drawable.bmw4,R.drawable.bmw5,R.drawable.bmw6,R.drawable.bmw7,
                R.drawable.bugatti1,R.drawable.bugatti2,R.drawable.bugatti3,
                R.drawable.toyota1,R.drawable.toyota2, R.drawable.toyota3,R.drawable.toyota4,R.drawable.toyota5,
                R.drawable.ford1, R.drawable.ford2,R.drawable.ford3,
                R.drawable.ferra1,R.drawable.ferra2,R.drawable.ferra3,
                R.drawable.mustang1, R.drawable.mustang2,R.drawable.mustang3,R.drawable.mustang4,
                R.drawable.lambo1,R.drawable.lambo2,
                R.drawable.rolls_royce1,R.drawable.rolls_royce2,R.drawable.rolls_royce3
        };

        Random catsaling = new Random();  //make the instance of the class random

        int random_seekering=catsaling.nextInt(9); //created the first random number bound as 9
        int random_nuer=random_seekering+11; //create a second random help of the first random number
        int random_terstagen=random_nuer+9;  // create a third random number help of the second random nummber

        image1_personalito1.setImageResource(cars_AdvanceLife[random_seekering]);  // set a first random number to first ImageView
        image2_personalito2.setImageResource(cars_AdvanceLife[random_nuer]);   //set a second random number to second imageView
        image3_personalito3.setImageResource(cars_AdvanceLife[random_terstagen]);  //set a third random number to third imageView


        texi_1=findViewById(R.id.txr1);  //first result textView  xml layout id path set
        texi_2=findViewById(R.id.txr2);   //second result textView  xml layout id path set
        texi_3=findViewById(R.id.txr3);  //third result textView  xml layout id path set



        button_to_generateLevel.setOnClickListener(new View.OnClickListener(){  //set a action to submit button

            @Override
            public void onClick(View v) {

                click = click+1; //if user press a submit button attempts will increased 1 by 1

                String TransportingEditIn11 =text_genetec1.getText().toString().toUpperCase();  //get a  first edit text input and convert in to uppercase
                String TransportingEditIn22 =text_genetec2.getText().toString().toUpperCase();  //get a  second edit text input and convert in to uppercase
                String TransportingEditIn33 =text_genetec3.getText().toString().toUpperCase();  //get a  third edit text input and convert in to uppercase


                if (click == 3) { //after attempts will be equal to 3 this statement will be activated
                    //wrong

                    button_to_generateLevel.setVisibility(v.INVISIBLE);
                    button_next.setVisibility(v.VISIBLE);
                    nextButton();//call a new activity method
            /////////////////////////// first ImageView
                    if (random_seekering <= 6 && !TransportingEditIn11.contentEquals("BMW")) {  // if the fist imageView range equal  than 0 and equal or less than  6 it is a "BMW"
                        text_genetec1.setTextColor(Color.RED);//if that first edit text answer did't match to bmw then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("BMW");
                    } else if (random_seekering >= 7 && random_seekering <= 9 && !TransportingEditIn11.contentEquals("BUGATTI")) { //if the fist imageView range equal or greater than 7 and less than 10 it is a "BUGATTI"
                        text_genetec1.setTextColor(Color.RED);//if that first edit text answer did't match to BUGATTI then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("BUGATTI");
                    } else if (random_seekering >= 10 && random_seekering <= 14 && !TransportingEditIn11.contentEquals("TOYOTA")) { //if the fist imageView range equal or greater than 10 and less than 15 it is a "TOYOTA"
                        text_genetec1.setTextColor(Color.RED);//if that first edit text answer did't match to TOYOTA then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("TOYOTA");
                    } else if (random_seekering >= 15 && random_seekering <= 17 && !TransportingEditIn11.contentEquals("FORD")) { //if the fist imageView range equal or greater than 15 and less than 18 it is a "FORD"
                        text_genetec1.setTextColor(Color.RED);//if that first edit text answer did't match to FORD then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("FORD");
                    } else if (random_seekering >= 18 && random_seekering <= 20 && !TransportingEditIn11.contentEquals("FERRARI")) { //if the fist imageView range equal or greater than 18 and less than 21 it is a "FERRARI"
                        text_genetec1.setTextColor(Color.RED); //if that first edit text answer did't match to FERRARI then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("FERRARI");
                    } else if (random_seekering >= 21 && random_seekering <= 24 && !TransportingEditIn11.contentEquals("MUSTANG")) { //if the fist imageView range equal or greater than 21 and less than 25 it is a "MUSTANG"
                        text_genetec1.setTextColor(Color.RED); //if that first edit text answer did't match to MUSTANG then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("MUSTANG");
                    } else if (random_seekering >= 25 && random_seekering <= 26 && !TransportingEditIn11.contentEquals("LAMBORGHINI")) { //if the fist imageView range equal or greater than 25 and less than 27 it is a "LAMBORGHINI"
                        text_genetec1.setTextColor(Color.RED); //if that first edit text answer did't match to LAMBORGHINI then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW); //and print a real answer in yellow color
                        texi_1.setText("LAMBORGHINI");
                    } else if (random_seekering >= 27 && random_seekering <= 29 && !TransportingEditIn11.contentEquals("ROLLS ROYCE")) { //if the fist imageView range equal or greater than 27 and equal or less than 29 it is a "ROLLS ROYCE"
                        text_genetec1.setTextColor(Color.RED); //if that first edit text answer did't match to ROLLS ROYCE then print a wrong massage in red colour
                        text_genetec1.setText("Wrong Answer");
                        texi_1.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_1.setText("ROLLS ROYCE");
                    }
///////////////////////// second imageView
                    if (random_nuer <= 6 && !TransportingEditIn22.contentEquals("BMW")) {   // if the second imageView range equal  than 0 and equal or less than  6 it is a "BMW"
                        text_genetec2.setTextColor(Color.RED); //if that second editText answer did't match to bmw then print a wrong massage in red colour
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_2.setText("BMW");
                    } else if (random_nuer >= 7 && random_nuer <= 9 && !TransportingEditIn22.contentEquals("BUGATTI")) {  //if the second imageView range equal or greater than 7 and less than 10 it is a "BUGATTI"
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_2.setText("BUGATTI");
                    } else if (random_nuer >= 10 && random_nuer <= 14 && !TransportingEditIn22.contentEquals("TOYOTA")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_2.setText("TOYOTA");
                    } else if (random_nuer >= 15 && random_nuer <= 17 && !TransportingEditIn22.contentEquals("FORD")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_2.setText("FORD");
                    } else if (random_nuer >= 18 && random_nuer <= 20 && !TransportingEditIn22.contentEquals("FERRARI")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_2.setText("FERRARI");
                    } else if (random_nuer >= 21 && random_nuer <= 24 && !TransportingEditIn22.contentEquals("MUSTANG")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_2.setText("MUSTANG");
                    } else if (random_nuer >= 25 && random_nuer <= 26 && !TransportingEditIn22.contentEquals("LAMBORGHINI")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_2.setText("LAMBORGHINI");
                    } else if (random_nuer >= 27 && random_nuer <= 29 && !TransportingEditIn22.contentEquals("ROLLS ROYCE")) {
                        text_genetec2.setTextColor(Color.RED);
                        text_genetec2.setText("Wrong Answer");
                        texi_2.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_2.setText("ROLLS ROYCE");
                    }


                    //////////////////////// third imageView

                    if (random_terstagen <= 6 && !TransportingEditIn33.contentEquals("BMW")) {  // if the third imageView range equal  than 0 and equal or less than  6 it is a "BMW"
                        text_genetec3.setTextColor(Color.RED);//if that third edit text answer did't match to bmw then print a wrong massage in red colour
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_3.setText("BMW");
                    } else if (random_terstagen >= 7 && random_terstagen <= 9 && !TransportingEditIn33.contentEquals("BUGATTI")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_3.setText("BUGATTI");
                    } else if (random_terstagen >= 10 && random_terstagen <= 14 && !TransportingEditIn33.contentEquals("TOYOTA")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_3.setText("TOYOTA");
                    } else if (random_terstagen >= 15 && random_terstagen <= 17 && !TransportingEditIn33.contentEquals("FORD")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_3.setText("FORD");
                    } else if (random_terstagen >= 18 && random_terstagen <= 20 && !TransportingEditIn33.contentEquals("FERRARI")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_3.setText("FERRARI");
                    } else if (random_terstagen >= 21 && random_terstagen <= 24 && !TransportingEditIn33.contentEquals("MUSTANG")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_3.setText("MUSTANG");
                    } else if (random_terstagen >= 25 && random_terstagen <= 26 && !TransportingEditIn33.contentEquals("LAMBORGHINI")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);  //and print a real answer in yellow color
                        texi_3.setText("LAMBORGHINI");
                    } else if (random_terstagen >= 27 && random_terstagen <= 29 && !TransportingEditIn33.contentEquals("ROLLS ROYCE")) {
                        text_genetec3.setTextColor(Color.RED);
                        text_genetec3.setText("Wrong Answer");
                        texi_3.setTextColor(Color.YELLOW);   //and print a real answer in yellow color
                        texi_3.setText("ROLLS ROYCE");
                    }
                }

                ///////if answer is correct


                    if (random_seekering <= 6 && TransportingEditIn11.equals("BMW")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("BMW");
                    } else if (random_seekering >= 7 && random_seekering <= 9 && TransportingEditIn11.equals("BUGATTI")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("BUGATTI");
                    } else if (random_seekering >= 10 && random_seekering <= 14 && TransportingEditIn11.equals("TOYOTA")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("TOYOTA");
                    } else if (random_seekering >= 15 && random_seekering <= 17 && TransportingEditIn11.equals("FORD")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("FORD");
                    } else if (random_seekering >= 18 && random_seekering <= 20 && TransportingEditIn11.equals("FERRARI")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("FERRARI");
                    } else if (random_seekering >= 21 && random_seekering <= 24 && TransportingEditIn11.equals("MUSTANG")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("MUSTANG");
                    } else if (random_seekering >= 25 && random_seekering <= 26 && TransportingEditIn11.equals("LAMBORGHINI")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("LAMBORGHINI");
                    } else if (random_seekering >= 27 && random_seekering <= 29 && TransportingEditIn11.equals("ROLLS ROYCE")) {
                        text_genetec1.setEnabled(false); //this  is made to make the first EditText uneditable
                        text_genetec1.setTextColor(Color.GREEN);
                        text_genetec1.setText("ROLLS ROYCE");
                    }


                    ///////////////////////////////////...........>>>>>>>>>>>>


                    if (random_nuer <= 6 && TransportingEditIn22.equals("BMW")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("BMW");
                    } else if (random_nuer >= 7 && random_nuer <= 9 && TransportingEditIn22.equals("BUGATTI")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("BUGATTI");
                    } else if (random_nuer >= 10 && random_nuer <= 14 && TransportingEditIn22.equals("TOYOTA")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("TOYOTA");
                    } else if (random_nuer >= 15 && random_nuer <= 17 && TransportingEditIn22.equals("FORD")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("FORD");
                    } else if (random_nuer >= 18 && random_nuer <= 20 && TransportingEditIn22.equals("FERRARI")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("FERRARI");
                    } else if (random_nuer >= 21 && random_nuer <= 24 && TransportingEditIn22.equals("MUSTANG")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("MUSTANG");
                    } else if (random_nuer >= 25 && random_nuer <= 26 && TransportingEditIn22.equals("LAMBORGHINI")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("LAMBORGHINI");
                    } else if (random_nuer >= 27 && random_nuer <= 29 && TransportingEditIn22.equals("ROLLS ROYCE")) {
                        text_genetec2.setEnabled(false);  //this  is made to make the second EditText uneditable
                        text_genetec2.setTextColor(Color.GREEN);
                        text_genetec2.setText("ROLLS ROYCE");
                    }


                    ////////////////////////////////......................>>>>>>>>>>>>>

                    if (random_terstagen <= 6 && TransportingEditIn33.equals("BMW")) {
                        text_genetec3.setEnabled(false);  //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("BMW");
                    } else if (random_terstagen >= 7 && random_terstagen <= 9 && TransportingEditIn33.equals("BUGATTI")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("BUGATTI");
                    } else if (random_terstagen >= 10 && random_terstagen <= 14 && TransportingEditIn33.equals("TOYOTA")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("TOYOTA");
                    } else if (random_terstagen >= 15 && random_terstagen <= 17 && TransportingEditIn33.equals("FORD")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("FORD");
                    } else if (random_terstagen >= 18 && random_terstagen <= 20 && TransportingEditIn33.equals("FERRARI")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("FERRARI");
                    } else if (random_terstagen >= 21 && random_terstagen <= 24 && TransportingEditIn33.equals("MUSTANG")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("MUSTANG");
                    } else if (random_terstagen >= 25 && random_terstagen <= 26 && TransportingEditIn33.equals("LAMBORGHINI")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("LAMBORGHINI");
                    } else if (random_terstagen >= 27 && random_terstagen <= 29 && TransportingEditIn33.equals("ROLLS ROYCE")) {
                        text_genetec3.setEnabled(false); //this  is made to make the third EditText uneditable
                        text_genetec3.setTextColor(Color.GREEN);
                        text_genetec3.setText("ROLLS ROYCE");
                    }



            }


        });
    } public void nextButton(){  //create a method to finish and create a new activity
        finish();
        Intent intentAd=new Intent(this,advance.class);
        startActivity(intentAd);
    }


}
