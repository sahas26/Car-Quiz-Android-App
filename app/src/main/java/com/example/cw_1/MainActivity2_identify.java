package com.example.cw_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.Random;



public class MainActivity2_identify extends AppCompatActivity {
    ImageView imageView;
    Spinner spinner;    //import spinner
    ArrayAdapter<CharSequence>adapter;            // declare arrayadapter
    //TextView textViewIdentify1;
    Button buttonForStart;  //starting button





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_identify);  //xml file path

        spinner=(Spinner) findViewById(R.id.spinner);  // set the spinner
        adapter=ArrayAdapter.createFromResource(this,R.array.Brands, android.R.layout.simple_spinner_item);  // set a spinner array adapter
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // set the dropdownList
        spinner.setAdapter(adapter);



        imageView= findViewById(R.id.imageView2);  // initialize a imageview id
        buttonForStart=findViewById(R.id.start);   //initialize the button id
        TextView right=(TextView)findViewById(R.id.correct);  //initialize the correct answer textview
        TextView wrong=(TextView)findViewById(R.id.wrong);   //initialize the wrong answer textview
        TextView real=(TextView)findViewById(R.id.real);     //initialize the true answer textview


        Random random = new Random();   //make the instance of the class random

       //int random_select = random.nextInt();


        Integer [] cars={    //created a array for random car images
                R.drawable.bmw1,R.drawable.bmw2,R.drawable.bmw3,R.drawable.bmw4,R.drawable.bmw5,R.drawable.bmw6,R.drawable.bmw7,
                R.drawable.bugatti1,R.drawable.bugatti2,R.drawable.bugatti3,
                R.drawable.toyota1,R.drawable.toyota2, R.drawable.toyota3,R.drawable.toyota4,R.drawable.toyota5,
                R.drawable.ford1, R.drawable.ford2,R.drawable.ford3,
                R.drawable.ferra1,R.drawable.ferra2,R.drawable.ferra3,                                          // set a car images in drawble
                R.drawable.mustang1, R.drawable.mustang2,R.drawable.mustang3,R.drawable.mustang4,
                R.drawable.lambo1,R.drawable.lambo2,
                R.drawable.rolls_royce1,R.drawable.rolls_royce2,R.drawable.rolls_royce3

        };




        buttonForStart.setOnClickListener(new View.OnClickListener() {   //set a action to start button


            @Override
            public void onClick(View v) {
                wrong.setText("");  //empty every textviews after clicking next button
                right.setText(" ");
                real.setText(" ");


                highOnLife(buttonForStart); // call a methoid to change button name



                int randNum = random.nextInt(cars.length);  //shuffle the arrayList to arrayList length
               imageView.setImageResource(cars[randNum]);   //set a selected random image to imageView
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {//set the listener to perform action base on item selection


                    if(randNum>=0 && randNum<=6 && position==2){  //compare random picture to spinnerlist answer if it is true ther print in green color
                        right.setTextColor(Color.GREEN);
                        right.setText("your Answer Correct");
                    }
                    else if(randNum>=0 && randNum<=6 && position!=2){  //if it is wrong print in red color answer is wrong and print the correct answer in yellow color
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("BMW");
                        wrong.setText(" Your Answer Wrong");
                    }
                    if (randNum>=7 && randNum<=9 && position==8){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=7 && randNum<=9 && position !=8){
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("Bugatti");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=10 && randNum<=14 && position==7){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=10 && randNum<=14 && position !=7){
                        real.setTextColor(Color.YELLOW);
                        wrong.setTextColor(Color.RED);
                        real.setText("Toyota");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=15 && randNum<=17 && position==1){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=15 && randNum<=17 && position !=1){
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("Ford");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=18 && randNum<=20 && position==4){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=18 && randNum<=20 && position !=4){
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("Ferrari");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=21 && randNum<=24 && position==3){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=21 && randNum<=24 && position !=3){
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("Mustang");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=25 && randNum<=26 && position==5){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=25 && randNum<=26 && position !=5){
                        wrong.setTextColor(Color.RED);
                        real.setTextColor(Color.YELLOW);
                        real.setText("Lamborghini");
                        wrong.setText("Your Answer Wrong");
                    }
                    if (randNum>=27&& randNum<=29 && position==6){
                        right.setTextColor(Color.GREEN);
                        right.setText("Your Answer Correct");
                    }
                    else if (randNum>=27 && randNum<=29&& position !=6){
                        real.setTextColor(Color.YELLOW);
                        wrong.setTextColor(Color.RED);
                        real.setText("Rolls Royce");
                        wrong.setText("Your Answer Wrong");

                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {


                }
            });

}

        });

    }
    public void highOnLife(View vertun){  //creating a method to change button command name
        vertun.setEnabled(true);
        Button button=(Button) vertun;
        buttonForStart.setText("next");
    }
}