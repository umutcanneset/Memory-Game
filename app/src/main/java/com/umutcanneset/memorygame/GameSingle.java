package com.umutcanneset.memorygame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

public class GameSingle extends AppCompatActivity {



        private TextView pointText1;
        private EditText point1;
        private ImageView[] allCards= new ImageView[20];
        private Button restartButton;


        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        ImageView imageView13;
        ImageView imageView14;
        ImageView imageView15;
        ImageView imageView16;
        ImageView imageView17;
        ImageView imageView18;
        ImageView imageView19;
        ImageView imageView20;

        Integer[] cards=new Integer[20];


        int indexx=0;
        int image11;
        int image12;
        int image13;
        int image14;
        int image21;
        int image22;
        int image23;
        int image24;
        int image31;
        int image32;
        int image33;
        int image34;
        int image41;
        int image42;
        int image43;
        int image44;
        int image51;
        int image52;
        int image53;
        int image54;


        int firstCard;
        int secondCard;
        int clickedFirst;
        int clickedSecond;
        int cardNumber=1;

        int turn=1;
        int ppoint1=0;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.game_single);


            restartButton = (Button) findViewById(R.id.restartButton);


            restartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(GameSingle.this, MainPage.class);
                    GameSingle.this.startActivity(myIntent);

                }
            });

            cards = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

            pointText1 = (TextView) findViewById(R.id.pointText);


            point1 = (EditText) findViewById(R.id.points);


            pointText1.setEnabled(false);

            point1.setEnabled(false);

            allCards[0] = (ImageView) findViewById(R.id.imageView1);
            allCards[1] = (ImageView) findViewById(R.id.imageView2);
            allCards[2] = (ImageView) findViewById(R.id.imageView3);
            allCards[3] = (ImageView) findViewById(R.id.imageView4);
            allCards[4] = (ImageView) findViewById(R.id.imageView5);
            allCards[5] = (ImageView) findViewById(R.id.imageView6);
            allCards[6] = (ImageView) findViewById(R.id.imageView7);
            allCards[7] = (ImageView) findViewById(R.id.imageView8);
            allCards[8] = (ImageView) findViewById(R.id.imageView9);
            allCards[9] = (ImageView) findViewById(R.id.imageView10);
            allCards[10] = (ImageView) findViewById(R.id.imageView11);
            allCards[11] = (ImageView) findViewById(R.id.imageView12);
            allCards[12] = (ImageView) findViewById(R.id.imageView13);
            allCards[13] = (ImageView) findViewById(R.id.imageView14);
            allCards[14] = (ImageView) findViewById(R.id.imageView15);
            allCards[15] = (ImageView) findViewById(R.id.imageView16);
            allCards[16] = (ImageView) findViewById(R.id.imageView17);
            allCards[17] = (ImageView) findViewById(R.id.imageView18);
            allCards[18] = (ImageView) findViewById(R.id.imageView19);
            allCards[19] = (ImageView) findViewById(R.id.imageView20);


            loadCards();


            Collections.shuffle(Arrays.asList(cards));




            allCards[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[0], theCard);
                }
            });

            allCards[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[1], theCard);
                }
            });

            allCards[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[2], theCard);
                }
            });

            allCards[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[3], theCard);
                }
            });

            allCards[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[4], theCard);
                }
            });

            allCards[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[5], theCard);
                }
            });

            allCards[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[6], theCard);
                }
            });

            allCards[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[7], theCard);
                }
            });

            allCards[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[8], theCard);
                }
            });

            allCards[9].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[9], theCard);
                }
            });

            allCards[10].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[10], theCard);
                }
            });

            allCards[11].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[11], theCard);
                }
            });

            allCards[12].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[12], theCard);
                }
            });

            allCards[13].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[13], theCard);
                }
            });

            allCards[14].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[14], theCard);
                }
            });

            allCards[15].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[15], theCard);
                }
            });

            allCards[16].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[16], theCard);
                }
            });

            allCards[17].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[17], theCard);
                }
            });

            allCards[18].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[18], theCard);
                }
            });

            allCards[19].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int theCard = Integer.parseInt((String) v.getTag());
                    process(allCards[19], theCard);
                }
            });



        }



        private void process(ImageView allCard, int theCard) {
            if (cards[theCard] == 0) {
                allCard.setImageResource(image11);
            } else if (cards[theCard] == 1) {
                allCard.setImageResource(image12);
            } else if (cards[theCard] == 2) {
                allCard.setImageResource(image13);
            } else if (cards[theCard] == 3) {
                allCard.setImageResource(image14);
            } else if (cards[theCard] == 4) {
                allCard.setImageResource(image21);
            } else if (cards[theCard] == 5) {
                allCard.setImageResource(image22);
            } else if (cards[theCard] == 6) {
                allCard.setImageResource(image23);
            } else if (cards[theCard] == 7) {
                allCard.setImageResource(image24);
            } else if (cards[theCard] == 8) {
                allCard.setImageResource(image31);
            } else if (cards[theCard] == 9) {
                allCard.setImageResource(image32);
            } else if (cards[theCard] == 10) {
                allCard.setImageResource(image33);
            } else if (cards[theCard] == 11) {
                allCard.setImageResource(image34);
            } else if (cards[theCard] == 12) {
                allCard.setImageResource(image41);
            } else if (cards[theCard] == 13) {
                allCard.setImageResource(image42);
            } else if (cards[theCard] == 14) {
                allCard.setImageResource(image43);
            } else if (cards[theCard] == 15) {
                allCard.setImageResource(image44);
            } else if (cards[theCard] == 16) {
                allCard.setImageResource(image51);
            } else if (cards[theCard] == 17) {
                allCard.setImageResource(image52);
            } else if (cards[theCard] == 18) {
                allCard.setImageResource(image53);
            } else if (cards[theCard] == 19) {
                allCard.setImageResource(image54);
            }

            if (cardNumber == 1) {
                firstCard = cards[theCard];
                if (firstCard > 9) {
                    firstCard = firstCard - 10;
                }
                cardNumber = 2;
                clickedFirst = theCard;
                allCard.setEnabled(false);
            } else if (cardNumber == 2) {
                secondCard = cards[theCard];
                if (secondCard > 9) {
                    secondCard = secondCard - 10;
                }
                cardNumber = 1;
                clickedSecond = theCard;

                allCards[0].setEnabled(false);
                allCards[1].setEnabled(false);
                allCards[2].setEnabled(false);
                allCards[3].setEnabled(false);
                allCards[4].setEnabled(false);
                allCards[5].setEnabled(false);
                allCards[6].setEnabled(false);
                allCards[7].setEnabled(false);
                allCards[8].setEnabled(false);
                allCards[9].setEnabled(false);
                allCards[10].setEnabled(false);
                allCards[11].setEnabled(false);
                allCards[12].setEnabled(false);
                allCards[13].setEnabled(false);
                allCards[14].setEnabled(false);
                allCards[15].setEnabled(false);
                allCards[16].setEnabled(false);
                allCards[17].setEnabled(false);
                allCards[18].setEnabled(false);
                allCards[19].setEnabled(false);


                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        calculate();
                    }
                }, 700);

            }
        }



        private void calculate() {

            if(firstCard==secondCard){

                if(clickedFirst==0){
                    allCards[0].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==1){
                    allCards[1].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==2){
                    allCards[2].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==3){
                    allCards[3].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==4){
                    allCards[4].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==5){
                    allCards[5].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==6){
                    allCards[6].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==7){
                    allCards[7].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==8){
                    allCards[8].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==9){
                    allCards[9].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==10){
                    allCards[10].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==11){
                    allCards[11].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==12){
                    allCards[12].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==13){
                    allCards[13].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==14){
                    allCards[14].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==15){
                    allCards[15].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==16){
                    allCards[16].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==17){
                    allCards[17].setVisibility(View.INVISIBLE);
                }else if(clickedFirst==18){
                    allCards[18].setVisibility(View.INVISIBLE);
                }else if (clickedFirst==19){
                    allCards[19].setVisibility(View.INVISIBLE);
                }

                if(clickedSecond==0){
                    allCards[0].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==1){
                    allCards[1].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==2){
                    allCards[2].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==3){
                    allCards[3].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==4){
                    allCards[4].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==5){
                    allCards[5].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==6){
                    allCards[6].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==7){
                    allCards[7].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==8){
                    allCards[8].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==9){
                    allCards[9].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==10){
                    allCards[10].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==11){
                    allCards[11].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==12){
                    allCards[12].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==13){
                    allCards[13].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==14){
                    allCards[14].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==15){
                    allCards[15].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==16){
                    allCards[16].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==17){
                    allCards[17].setVisibility(View.INVISIBLE);
                }else if(clickedSecond==18){
                    allCards[18].setVisibility(View.INVISIBLE);
                }else if (clickedSecond==19){
                    allCards[19].setVisibility(View.INVISIBLE);
                }

                ppoint1+=1;
                point1.setText(String.valueOf(ppoint1));

                MediaPlayer match= MediaPlayer.create(this,R.raw.match);
                match.start();



            }else{
                allCards[0].setImageResource(R.drawable.riddle);
                allCards[1].setImageResource(R.drawable.riddle);
                allCards[2].setImageResource(R.drawable.riddle);
                allCards[3].setImageResource(R.drawable.riddle);
                allCards[4].setImageResource(R.drawable.riddle);
                allCards[5].setImageResource(R.drawable.riddle);
                allCards[6].setImageResource(R.drawable.riddle);
                allCards[7].setImageResource(R.drawable.riddle);
                allCards[8].setImageResource(R.drawable.riddle);
                allCards[9].setImageResource(R.drawable.riddle);
                allCards[10].setImageResource(R.drawable.riddle);
                allCards[11].setImageResource(R.drawable.riddle);
                allCards[12].setImageResource(R.drawable.riddle);
                allCards[13].setImageResource(R.drawable.riddle);
                allCards[14].setImageResource(R.drawable.riddle);
                allCards[15].setImageResource(R.drawable.riddle);
                allCards[16].setImageResource(R.drawable.riddle);
                allCards[17].setImageResource(R.drawable.riddle);
                allCards[18].setImageResource(R.drawable.riddle);
                allCards[19].setImageResource(R.drawable.riddle);


            }



            allCards[0].setEnabled(true);
            allCards[1].setEnabled(true);
            allCards[2].setEnabled(true);
            allCards[3].setEnabled(true);
            allCards[4].setEnabled(true);
            allCards[5].setEnabled(true);
            allCards[6].setEnabled(true);
            allCards[7].setEnabled(true);
            allCards[8].setEnabled(true);
            allCards[9].setEnabled(true);
            allCards[10].setEnabled(true);
            allCards[11].setEnabled(true);
            allCards[12].setEnabled(true);
            allCards[13].setEnabled(true);
            allCards[14].setEnabled(true);
            allCards[15].setEnabled(true);
            allCards[16].setEnabled(true);
            allCards[17].setEnabled(true);
            allCards[18].setEnabled(true);
            allCards[19].setEnabled(true);

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    checkEnd();
                }
            }, 500);

        }

        private void checkEnd() {

            if(allCards[0].getVisibility()==View.INVISIBLE&&
                    allCards[1].getVisibility()==View.INVISIBLE&&
                    allCards[2].getVisibility()==View.INVISIBLE &&
                    allCards[3].getVisibility()==View.INVISIBLE&&
                    allCards[4].getVisibility()==View.INVISIBLE&&
                    allCards[5].getVisibility()==View.INVISIBLE&&
                    allCards[6].getVisibility()==View.INVISIBLE&&
                    allCards[7].getVisibility()==View.INVISIBLE &&
                    allCards[8].getVisibility()==View.INVISIBLE&&
                    allCards[9].getVisibility()==View.INVISIBLE&&
                    allCards[10].getVisibility()==View.INVISIBLE&&
                    allCards[11].getVisibility()==View.INVISIBLE&&
                    allCards[12].getVisibility()==View.INVISIBLE &&
                    allCards[13].getVisibility()==View.INVISIBLE&&
                    allCards[14].getVisibility()==View.INVISIBLE&&
                    allCards[15].getVisibility()==View.INVISIBLE&&
                    allCards[16].getVisibility()==View.INVISIBLE&&
                    allCards[17].getVisibility()==View.INVISIBLE &&
                    allCards[18].getVisibility()==View.INVISIBLE&&
                    allCards[19].getVisibility()==View.INVISIBLE){

                restartButton.setVisibility(View.VISIBLE);

                Toast.makeText(getApplicationContext(), "Game Over !  ", Toast.LENGTH_LONG).show();

                MediaPlayer closure=MediaPlayer.create(this,R.raw.closure);
                closure.start();
            }
        }


        private void loadCards() {


            image11=R.drawable.zero;
            image12=R.drawable.one;
            image13=R.drawable.two;
            image14=R.drawable.three;
            image21=R.drawable.four;
            image22=R.drawable.five;
            image23=R.drawable.six;
            image24=R.drawable.seven;
            image31=R.drawable.eight;
            image32=R.drawable.nine;
            image33=R.drawable.zero;
            image34=R.drawable.one;
            image41=R.drawable.two;
            image42=R.drawable.three;
            image43=R.drawable.four;
            image44=R.drawable.five;
            image51=R.drawable.six;
            image52=R.drawable.seven;
            image53=R.drawable.eight;
            image54=R.drawable.nine;
        }
    }


