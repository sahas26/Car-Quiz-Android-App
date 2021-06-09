package com.example.cw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Identify_Cars extends AppCompatActivity {

    ImageView image1_period1;
    ImageView image2_period2;
    ImageView image3_period3;
    TextView textrex;
    TextView Wind;
    static String valurScore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify__cars);





        Integer [] cars_Advance_period={
                R.drawable.bmw1,R.drawable.bmw2,R.drawable.bmw3,R.drawable.bmw4,R.drawable.bmw5,R.drawable.bmw6,R.drawable.bmw7,  //create a car image arrayList
                R.drawable.bugatti1,R.drawable.bugatti2,R.drawable.bugatti3,
                R.drawable.toyota1,R.drawable.toyota2, R.drawable.toyota3,R.drawable.toyota4,R.drawable.toyota5,
                R.drawable.ford1, R.drawable.ford2,R.drawable.ford3,
                R.drawable.ferra1,R.drawable.ferra2,R.drawable.ferra3,
                R.drawable.mustang1, R.drawable.mustang2,R.drawable.mustang3,R.drawable.mustang4,
                R.drawable.lambo1,R.drawable.lambo2,
                R.drawable.rolls_royce1,R.drawable.rolls_royce2,R.drawable.rolls_royce3
        };


        final String [] brands_forNaming={"BMW","Bugatti","Toyota","Ford","Ferrari","Mustang","Lamborghini","Rolls Royce"  //this array can't edit
        };



        image1_period1=findViewById(R.id.imageView); //first imageView initialize
        image2_period2=findViewById(R.id.imageView3); //second imageView initialize
        image3_period3=findViewById(R.id.imageView4);  //third imageView initialize
        textrex=findViewById(R.id.convence);  //initialize a id to random car name textview
        Wind=findViewById(R.id.maasithun);  // result textview id initialize
        Button button_toNext_stat = (Button)findViewById(R.id.button5); //button initialize



        button_toNext_stat.setOnClickListener(new View.OnClickListener(){  //set a action to button

            @Override
            public void onClick(View v) {
                Random threepicRan = new Random();  //make the instance of the class random
                Wind.setText("");  //clear result textView everyTime when user press next button
                highOnLife00(button_toNext_stat);  //call a change button name method

                // selected a different random pictures for 3 imageViews
                int random_edge=threepicRan.nextInt(9); //in that one it will gives a 0-9 range random number only
                int random_solid=random_edge+11; //create a second random help of the first random number it means it will gave a 9-20 range number only
                int random_coreMode=random_solid+9; //create a third random help of the second random number it means 20-29 range number only
                image1_period1.setImageResource(cars_Advance_period[random_edge]);   //set a first random number to first imageView
                image2_period2.setImageResource(cars_Advance_period[random_solid]);  //set a second random number to second ImageView
                image3_period3.setImageResource(cars_Advance_period[random_coreMode]);  //set a third random number to third ImageView

                int placingCorrect=threepicRan.nextInt(2); //


                if(placingCorrect==0) {  //select a different car brand name  to textView for first imageView

                    if (random_edge <= 6) {
                        String brandUser = brands_forNaming[0];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 7 && random_edge <= 9) {
                        String brandUser = brands_forNaming[1];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 10 && random_edge <= 14) {
                        String brandUser = brands_forNaming[2];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 15 && random_edge <= 17) {
                        String brandUser = brands_forNaming[3];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 18 && random_edge <= 20) {
                        String brandUser = brands_forNaming[4];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 21 && random_edge <= 24) {
                        String brandUser = brands_forNaming[5];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 25 && random_edge <= 26) {
                        String brandUser = brands_forNaming[6];
                        textrex.setText(brandUser);
                    } else if (random_edge >= 27 && random_edge <= 29) {
                        String brandUser = brands_forNaming[7];
                        textrex.setText(brandUser);
                    }
                }

                if(placingCorrect==1) {  //select a different car brand name  to textView for second imageView

                    if (random_solid <= 6) {
                        String brandUser = brands_forNaming[0];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 7 && random_solid <= 9) {
                        String brandUser = brands_forNaming[1];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 10 && random_solid <= 14) {
                        String brandUser = brands_forNaming[2];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 15 && random_solid <= 17) {
                        String brandUser = brands_forNaming[3];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 18 && random_solid <= 20) {
                        String brandUser = brands_forNaming[4];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 21 && random_solid <= 24) {
                        String brandUser = brands_forNaming[5];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 25 && random_solid <= 26) {
                        String brandUser = brands_forNaming[6];
                        textrex.setText(brandUser);
                    } else if (random_solid >= 27 && random_solid <= 29) {
                        String brandUser = brands_forNaming[7];
                        textrex.setText(brandUser);
                    }
                }


                if(placingCorrect==2) {  //select a different car brand name  to textView for third imageView

                    if (random_coreMode <= 6) {
                        String brandUser = brands_forNaming[0];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 7 && random_coreMode <= 9) {
                        String brandUser = brands_forNaming[1];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 10 && random_coreMode <= 14) {
                        String brandUser = brands_forNaming[2];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 15 && random_coreMode <= 17) {
                        String brandUser = brands_forNaming[3];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 18 && random_coreMode <= 20) {
                        String brandUser = brands_forNaming[4];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 21 && random_coreMode <= 24) {
                        String brandUser = brands_forNaming[5];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 25 && random_coreMode <= 26) {
                        String brandUser = brands_forNaming[6];
                        textrex.setText(brandUser);
                    } else if (random_coreMode >= 27 && random_coreMode <= 29) {
                        String brandUser = brands_forNaming[7];
                        textrex.setText(brandUser);
                    }
                }


                valurScore = (String)textrex.getText();  //set a uniq car brand name to textview to choose

                //in that part i divide a brand image array to 3 part..
                //  first part in this imageView i set a 2 brand everyTime..it's BMW & Bugatti
                // in second part i set 3 type of brand for second ImageView, that's TOYOTA,FORD,FERRARI
                //

                image1_period1.setOnClickListener(new View.OnClickListener(){  // set a action if  first ImageView is the correct or not

                    @Override
                    public void onClick(View v) {
                       // Wind.setText("");
                        if (random_edge <=6){
                            if (valurScore=="BMW"){
                                Wind.setTextColor(Color.GREEN); //if answer is correct then set a text in green colour
                                Wind.setText("Correct Answer");

                            }
                            else {
                                Wind.setTextColor(Color.RED);
                                Wind.setText("Wrong  Answer");  //it's wrong then set a text in red colour
                            }
                        }
                        if (random_edge >=7 && random_edge<=9) {
                            if (valurScore == "Bugatti") {
                                Wind.setTextColor(Color.GREEN);
                                Wind.setText("Correct Answer");

                            } else {
                                Wind.setTextColor(Color.RED);
                                Wind.setText("Wrong  Answer");
                            }
                        }


                    }


                });

                ////////////////////////////////////////////

                        image2_period2.setOnClickListener(new View.OnClickListener(){  //// set a action if second  ImageView is the correct or not

                            @Override
                            public void onClick(View v) {
                                Wind.setText("");
                                if (random_solid >=10 && random_solid<=14) {
                                    if (valurScore == "Toyota") {
                                        Wind.setTextColor(Color.GREEN);
                                        Wind.setText("Correct Answer");

                                    } else {
                                        Wind.setTextColor(Color.RED);
                                        Wind.setText("Wrong  Answer");
                                    }
                                }


                                if (random_solid >=15 && random_solid<=17){
                                    if (valurScore=="Ford"){
                                        Wind.setTextColor(Color.GREEN);
                                        Wind.setText("Correct Answer");

                                    }
                                    else {
                                        Wind.setTextColor(Color.RED);
                                        Wind.setText("Wrong  Answer");
                                    }
                                }
                                if (random_solid >=18 && random_solid<=20) {
                                    if (valurScore == "Ferrari") {
                                        Wind.setTextColor(Color.GREEN);
                                        Wind.setText("Correct Answer");

                                    } else {
                                        Wind.setTextColor(Color.RED);
                                        Wind.setText("Wrong  Answer");
                                    }
                                }


                            }


                        }


                );


                        ///////////////////////////////////////////


                image3_period3.setOnClickListener(new View.OnClickListener(){ // set a action if third  ImageView is the correct or not

                    @Override
                    public void onClick(View v) {
                        Wind.setText("");



                        if (random_coreMode >=21 && random_coreMode<=24) {
                            if (valurScore == "Mustang") {
                                Wind.setTextColor(Color.GREEN);
                                Wind.setText("Correct Answer");

                            } else {
                                Wind.setTextColor(Color.RED);
                                Wind.setText("Wrong  Answer");
                            }
                        }



                        if (random_coreMode >=25 && random_coreMode<=26){
                            if (valurScore=="Lamborghini"){
                                Wind.setTextColor(Color.GREEN);
                                Wind.setText("Correct Answer");

                            }
                            else {
                                Wind.setTextColor(Color.RED);
                                Wind.setText("Wrong  Answer");
                            }
                        }
                        if (random_coreMode >=27 && random_coreMode<=29) {
                            if (valurScore == "Rolls Royce") {
                                Wind.setTextColor(Color.GREEN);
                                Wind.setText("Correct Answer");

                            } else {
                                Wind.setTextColor(Color.RED);
                                Wind.setText("Wrong  Answer");
                            }
                        }
                    }
            });



            }
            public void highOnLife00(View vertun1){  // create a method to change button name
                vertun1.setEnabled(true);
                Button button=(Button) vertun1;
                button_toNext_stat.setText("next");
            }

        });
    }
}