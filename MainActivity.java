package com.example.chandler.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.AMQP.Queue.DeclareOk;

import android.app.Activity;

import android.os.Handler;
import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton blue_ranger;
    ImageButton blue_war;
    ImageButton blue_s;

    boolean blueranger_enabled = false;
    boolean bluewarrior_enabled = false;
    boolean bluesorc_enabled = false;

    ImageButton red_ranger;
    ImageButton red_war;
    ImageButton red_s;

    boolean redranger_enabled = false;
    boolean redwarrior_enabled = false;
    boolean redsorc_enabled = false;


    ImageButton _1,_2,_3,_4,_5,_6,_7,_8;
    ImageButton _9,_10,_11,_12,_13,_14,_15,_16;
    ImageButton _17,_18,_19,_20,_21,_22,_23,_24;
    ImageButton _25,_26,_27,_28,_29,_30,_31,_32;
    ImageButton _33,_34,_35,_36,_37,_38,_39,_40;
    ImageButton _41,_42,_43,_44,_45,_46,_47,_48;
    ImageButton _49,_50,_51,_52,_53,_54,_55,_56;
    ImageButton _57,_58,_59,_60,_61,_62,_63,_64;

    ImageButton s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _1 = (ImageButton) findViewById(R.id.imageButton1);
        _2 = (ImageButton) findViewById(R.id.imageButton2);
        _3 = (ImageButton) findViewById(R.id.imageButton3);
        _4 = (ImageButton) findViewById(R.id.imageButton4);
        _5 = (ImageButton) findViewById(R.id.imageButton5);
        _6 = (ImageButton) findViewById(R.id.imageButton6);
        _7 = (ImageButton) findViewById(R.id.imageButton7);
        _8 = (ImageButton) findViewById(R.id.imageButton8);
        _9 = (ImageButton) findViewById(R.id.imageButton9);
        _10 = (ImageButton) findViewById(R.id.imageButton10);
        _11 = (ImageButton) findViewById(R.id.imageButton11);
        _12 = (ImageButton) findViewById(R.id.imageButton12);
        _13 = (ImageButton) findViewById(R.id.imageButton13);
        _14 = (ImageButton) findViewById(R.id.imageButton14);
        _15 = (ImageButton) findViewById(R.id.imageButton15);
        _16 = (ImageButton) findViewById(R.id.imageButton16);
        _17 = (ImageButton) findViewById(R.id.imageButton17);
        _18 = (ImageButton) findViewById(R.id.imageButton18);
        _19 = (ImageButton) findViewById(R.id.imageButton19);
        _20 = (ImageButton) findViewById(R.id.imageButton20);
        _21 = (ImageButton) findViewById(R.id.imageButton21);
        _22 = (ImageButton) findViewById(R.id.imageButton22);
        _23 = (ImageButton) findViewById(R.id.imageButton23);
        _24 = (ImageButton) findViewById(R.id.imageButton24);
        _25 = (ImageButton) findViewById(R.id.imageButton25);
        _26 = (ImageButton) findViewById(R.id.imageButton26);
        _27 = (ImageButton) findViewById(R.id.imageButton27);
        _28 = (ImageButton) findViewById(R.id.imageButton28);
        _29 = (ImageButton) findViewById(R.id.imageButton29);
        _30 = (ImageButton) findViewById(R.id.imageButton30);
        _31 = (ImageButton) findViewById(R.id.imageButton31);
        _32 = (ImageButton) findViewById(R.id.imageButton32);
        _33 = (ImageButton) findViewById(R.id.imageButton33);
        _34 = (ImageButton) findViewById(R.id.imageButton34);
        _35 = (ImageButton) findViewById(R.id.imageButton35);
        _36 = (ImageButton) findViewById(R.id.imageButton36);
        _37 = (ImageButton) findViewById(R.id.imageButton37);
        _38 = (ImageButton) findViewById(R.id.imageButton38);
        _39 = (ImageButton) findViewById(R.id.imageButton39);
        _40 = (ImageButton) findViewById(R.id.imageButton40);
        _41 = (ImageButton) findViewById(R.id.imageButton41);
        _42 = (ImageButton) findViewById(R.id.imageButton42);
        _43 = (ImageButton) findViewById(R.id.imageButton43);
        _44 = (ImageButton) findViewById(R.id.imageButton44);
        _45 = (ImageButton) findViewById(R.id.imageButton45);
        _46 = (ImageButton) findViewById(R.id.imageButton46);
        _47 = (ImageButton) findViewById(R.id.imageButton47);
        _48 = (ImageButton) findViewById(R.id.imageButton48);
        _49 = (ImageButton) findViewById(R.id.imageButton49);
        _50 = (ImageButton) findViewById(R.id.imageButton50);
        _51 = (ImageButton) findViewById(R.id.imageButton51);
        _52 = (ImageButton) findViewById(R.id.imageButton52);
        _53 = (ImageButton) findViewById(R.id.imageButton53);
        _54 = (ImageButton) findViewById(R.id.imageButton54);
        _55 = (ImageButton) findViewById(R.id.imageButton55);
        _56 = (ImageButton) findViewById(R.id.imageButton56);
        _57 = (ImageButton) findViewById(R.id.imageButton57);
        _58 = (ImageButton) findViewById(R.id.imageButton58);
        _59 = (ImageButton) findViewById(R.id.imageButton59);
        _60 = (ImageButton) findViewById(R.id.imageButton60);
        _61 = (ImageButton) findViewById(R.id.imageButton61);
        _62 = (ImageButton) findViewById(R.id.imageButton62);
        _63 = (ImageButton) findViewById(R.id.imageButton63);
        _64 = (ImageButton) findViewById(R.id.imageButton64);

        /*for(int i = 1; i<64;i++){
            String _id = "_"+i;
           _id = (ImageButton) findViewById(R.id.('imageButton' + i);
        }*/

        blue_ranger = (ImageButton) findViewById(R.id.blueranger);
        blue_ranger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
            // _1.setVisibility(View.VISIBLE);
             if(blueranger_enabled == false){
                 blueranger_enabled = true;
                 //set visibility
             }
             else{
                 blueranger_enabled = false;
             }
        }
                                              });

        /*THIS IS # 1 listener*/

        blue_war = (ImageButton) findViewById(R.id.bluewarrior);
        blue_war.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // _1.setVisibility(View.VISIBLE);
                if(bluewarrior_enabled == false){
                    bluewarrior_enabled = true;
                }
                else{
                    bluewarrior_enabled = false;
                }
            }
        });

        blue_s = (ImageButton) findViewById(R.id.bluesorceress);
        blue_s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
              //  _1.setVisibility(View.VISIBLE);
                if(bluesorc_enabled == false){
                    bluesorc_enabled = true;
                }
                else{
                    bluesorc_enabled = false;
                }
            }
        });

        red_ranger = (ImageButton) findViewById(R.id.redranger);
        red_ranger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // _1.setVisibility(View.VISIBLE);
                if(redranger_enabled == false){
                    redranger_enabled = true;
                }
                else{
                    redranger_enabled = false;
                }
            }
        });

        red_war = (ImageButton) findViewById(R.id.redwarrior);
        red_war.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // _1.setVisibility(View.VISIBLE);
                if(redwarrior_enabled == false){
                    redwarrior_enabled = true;
                }
                else{
                    redwarrior_enabled = false;
                }
            }
        });

        red_s = (ImageButton) findViewById(R.id.redsorceress);
        red_s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // _1.setVisibility(View.VISIBLE);
                if(redsorc_enabled == false){
                    redsorc_enabled = true;
                }
                else{
                    redsorc_enabled = false;
                }
            }
        });
        _1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_1.getX() - 5);
                    blue_war.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_1.getX() - 5);
                    blue_s.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_1.getX() - 5);
                    blue_ranger.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
              /*  if(redwarrior_enabled == true){
                    red_war.setX(_1.getX() - 5);
                    red_war.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    redwarrior_enabled = false;
                }
                if(redsorc_enabled == true){
                    red_s.setX(_1.getX() - 5);
                    red_s.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    redsorc_enabled = false;
                }
                if(redranger_enabled == true){
                    red_ranger.setX(_1.getX() - 5);
                    red_ranger.setY(_1.getY() - 5);
                    _1.setVisibility(View.INVISIBLE);
                    redranger_enabled = false;
                }
                */
            }
                                });

        _2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_2.getX() - 5);
                    blue_war.setY(_2.getY() - 5);
                    _2.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_2.getX() - 5);
                    blue_s.setY(_2.getY() - 5);
                    _2.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_2.getX() - 5);
                    blue_ranger.setY(_2.getY() - 5);
                    _2.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }

            }
        });

        _3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_3.getX() - 5);
                    blue_war.setY(_3.getY() - 5);
                    _3.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_3.getX() - 5);
                    blue_s.setY(_3.getY() - 5);
                    _3.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_3.getX() - 5);
                    blue_ranger.setY(_3.getY() - 5);
                    _3.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });

        _4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_4.getX() - 5);
                    blue_war.setY(_4.getY() - 5);
                    _4.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_4.getX() - 5);
                    blue_s.setY(_4.getY() - 5);
                    _4.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_4.getX() - 5);
                    blue_ranger.setY(_4.getY() - 5);
                    _4.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });

        _5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_5.getX() - 5);
                    blue_war.setY(_5.getY() - 5);
                    _5.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_5.getX() - 5);
                    blue_s.setY(_5.getY() - 5);
                    _5.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_5.getX() - 5);
                    blue_ranger.setY(_5.getY() - 5);
                    _5.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_6.getX() - 5);
                    blue_war.setY(_6.getY() - 5);
                    _6.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_6.getX() - 5);
                    blue_s.setY(_6.getY() - 5);
                    _6.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_6.getX() - 5);
                    blue_ranger.setY(_6.getY() - 5);
                    _6.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_7.getX() - 5);
                    blue_war.setY(_7.getY() - 5);
                    _7.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_7.getX() - 5);
                    blue_s.setY(_7.getY() - 5);
                    _7.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_7.getX() - 5);
                    blue_ranger.setY(_7.getY() - 5);
                    _7.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_8.getX() - 5);
                    blue_war.setY(_8.getY() - 5);
                    _8.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_8.getX() - 5);
                    blue_s.setY(_8.getY() - 5);
                    _8.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_8.getX() - 5);
                    blue_ranger.setY(_8.getY() - 5);
                    _8.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_9.getX() - 5);
                    blue_war.setY(_9.getY() - 5);
                    _9.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_9.getX() - 5);
                    blue_s.setY(_9.getY() - 5);
                    _9.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_9.getX() - 5);
                    blue_ranger.setY(_9.getY() - 5);
                    _9.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_10.getX() - 5);
                    blue_war.setY(_10.getY() - 5);
                    _10.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_10.getX() - 5);
                    blue_s.setY(_10.getY() - 5);
                    _10.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_10.getX() - 5);
                    blue_ranger.setY(_10.getY() - 5);
                    _10.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_11.getX() - 5);
                    blue_war.setY(_11.getY() - 5);
                    _11.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_11.getX() - 5);
                    blue_s.setY(_11.getY() - 5);
                    _11.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_11.getX() - 5);
                    blue_ranger.setY(_11.getY() - 5);
                    _11.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_12.getX() - 5);
                    blue_war.setY(_12.getY() - 5);
                    _12.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_12.getX() - 5);
                    blue_s.setY(_12.getY() - 5);
                    _12.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_12.getX() - 5);
                    blue_ranger.setY(_12.getY() - 5);
                    _12.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_13.getX() - 5);
                    blue_war.setY(_13.getY() - 5);
                    _13.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_13.getX() - 5);
                    blue_s.setY(_13.getY() - 5);
                    _13.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_13.getX() - 5);
                    blue_ranger.setY(_13.getY() - 5);
                    _13.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_14.getX() - 5);
                    blue_war.setY(_14.getY() - 5);
                    _14.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_14.getX() - 5);
                    blue_s.setY(_14.getY() - 5);
                    _14.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_14.getX() - 5);
                    blue_ranger.setY(_14.getY() - 5);
                    _14.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_15.getX() - 5);
                    blue_war.setY(_15.getY() - 5);
                    _15.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_15.getX() - 5);
                    blue_s.setY(_15.getY() - 5);
                    _15.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_15.getX() - 5);
                    blue_ranger.setY(_15.getY() - 5);
                    _15.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_16.getX() - 5);
                    blue_war.setY(_16.getY() - 5);
                    _16.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_16.getX() - 5);
                    blue_s.setY(_16.getY() - 5);
                    _16.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_16.getX() - 5);
                    blue_ranger.setY(_16.getY() - 5);
                    _16.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_17.getX() - 5);
                    blue_war.setY(_17.getY() - 5);
                    _17.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_17.getX() - 5);
                    blue_s.setY(_17.getY() - 5);
                    _17.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_17.getX() - 5);
                    blue_ranger.setY(_17.getY() - 5);
                    _17.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_18.getX() - 5);
                    blue_war.setY(_18.getY() - 5);
                    _18.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_18.getX() - 5);
                    blue_s.setY(_18.getY() - 5);
                    _18.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_18.getX() - 5);
                    blue_ranger.setY(_18.getY() - 5);
                    _18.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_19.getX() - 5);
                    blue_war.setY(_19.getY() - 5);
                    _19.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_19.getX() - 5);
                    blue_s.setY(_19.getY() - 5);
                    _19.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_19.getX() - 5);
                    blue_ranger.setY(_19.getY() - 5);
                    _19.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_20.getX() - 5);
                    blue_war.setY(_20.getY() - 5);
                    _20.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_20.getX() - 5);
                    blue_s.setY(_20.getY() - 5);
                    _20.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_20.getX() - 5);
                    blue_ranger.setY(_20.getY() - 5);
                    _20.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_21.getX() - 5);
                    blue_war.setY(_21.getY() - 5);
                    _21.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_21.getX() - 5);
                    blue_s.setY(_21.getY() - 5);
                    _21.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_21.getX() - 5);
                    blue_ranger.setY(_21.getY() - 5);
                    _21.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_22.getX() - 5);
                    blue_war.setY(_22.getY() - 5);
                    _22.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_22.getX() - 5);
                    blue_s.setY(_22.getY() - 5);
                    _22.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_22.getX() - 5);
                    blue_ranger.setY(_22.getY() - 5);
                    _22.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_23.getX() - 5);
                    blue_war.setY(_23.getY() - 5);
                    _23.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_23.getX() - 5);
                    blue_s.setY(_23.getY() - 5);
                    _23.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_23.getX() - 5);
                    blue_ranger.setY(_23.getY() - 5);
                    _23.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_24.getX() - 5);
                    blue_war.setY(_24.getY() - 5);
                    _24.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_24.getX() - 5);
                    blue_s.setY(_24.getY() - 5);
                    _24.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_24.getX() - 5);
                    blue_ranger.setY(_24.getY() - 5);
                    _24.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_25.getX() - 5);
                    blue_war.setY(_25.getY() - 5);
                    _25.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_25.getX() - 5);
                    blue_s.setY(_25.getY() - 5);
                    _25.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_25.getX() - 5);
                    blue_ranger.setY(_25.getY() - 5);
                    _25.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_26.getX() - 5);
                    blue_war.setY(_26.getY() - 5);
                    _26.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_26.getX() - 5);
                    blue_s.setY(_26.getY() - 5);
                    _26.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_26.getX() - 5);
                    blue_ranger.setY(_26.getY() - 5);
                    _26.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_27.getX() - 5);
                    blue_war.setY(_27.getY() - 5);
                    _27.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_27.getX() - 5);
                    blue_s.setY(_27.getY() - 5);
                    _27.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_27.getX() - 5);
                    blue_ranger.setY(_27.getY() - 5);
                    _27.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_28.getX() - 5);
                    blue_war.setY(_28.getY() - 5);
                    _28.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_28.getX() - 5);
                    blue_s.setY(_28.getY() - 5);
                    _28.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_28.getX() - 5);
                    blue_ranger.setY(_28.getY() - 5);
                    _28.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_29.getX() - 5);
                    blue_war.setY(_1.getY() - 5);
                    _29.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_29.getX() - 5);
                    blue_s.setY(_29.getY() - 5);
                    _29.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_29.getX() - 5);
                    blue_ranger.setY(_29.getY() - 5);
                    _29.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_30.getX() - 5);
                    blue_war.setY(_30.getY() - 5);
                    _30.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_30.getX() - 5);
                    blue_s.setY(_30.getY() - 5);
                    _30.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_30.getX() - 5);
                    blue_ranger.setY(_30.getY() - 5);
                    _30.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });

        _31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_31.getX() - 5);
                    blue_war.setY(_31.getY() - 5);
                    _31.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_31.getX() - 5);
                    blue_s.setY(_31.getY() - 5);
                    _31.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_31.getX() - 5);
                    blue_ranger.setY(_31.getY() - 5);
                    _31.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_32.getX() - 5);
                    blue_war.setY(_32.getY() - 5);
                    _32.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_32.getX() - 5);
                    blue_s.setY(_32.getY() - 5);
                    _32.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_32.getX() - 5);
                    blue_ranger.setY(_32.getY() - 5);
                    _32.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_33.getX() - 5);
                    blue_war.setY(_33.getY() - 5);
                    _33.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_33.getX() - 5);
                    blue_s.setY(_33.getY() - 5);
                    _33.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_33.getX() - 5);
                    blue_ranger.setY(_33.getY() - 5);
                    _33.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_34.getX() - 5);
                    blue_war.setY(_34.getY() - 5);
                    _34.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_34.getX() - 5);
                    blue_s.setY(_34.getY() - 5);
                    _34.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_34.getX() - 5);
                    blue_ranger.setY(_34.getY() - 5);
                    _34.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_35.getX() - 5);
                    blue_war.setY(_35.getY() - 5);
                    _35.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_35.getX() - 5);
                    blue_s.setY(_35.getY() - 5);
                    _35.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_35.getX() - 5);
                    blue_ranger.setY(_35.getY() - 5);
                    _35.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_36.getX() - 5);
                    blue_war.setY(_36.getY() - 5);
                    _36.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_36.getX() - 5);
                    blue_s.setY(_36.getY() - 5);
                    _36.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_36.getX() - 5);
                    blue_ranger.setY(_36.getY() - 5);
                    _36.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_37.getX() - 5);
                    blue_war.setY(_37.getY() - 5);
                    _37.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_37.getX() - 5);
                    blue_s.setY(_37.getY() - 5);
                    _37.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_37.getX() - 5);
                    blue_ranger.setY(_37.getY() - 5);
                    _37.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_38.getX() - 5);
                    blue_war.setY(_38.getY() - 5);
                    _38.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_38.getX() - 5);
                    blue_s.setY(_38.getY() - 5);
                    _38.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_38.getX() - 5);
                    blue_ranger.setY(_38.getY() - 5);
                    _38.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_39.getX() - 5);
                    blue_war.setY(_39.getY() - 5);
                    _39.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_39.getX() - 5);
                    blue_s.setY(_39.getY() - 5);
                    _39.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_39.getX() - 5);
                    blue_ranger.setY(_39.getY() - 5);
                    _39.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_40.getX() - 5);
                    blue_war.setY(_40.getY() - 5);
                    _40.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_40.getX() - 5);
                    blue_s.setY(_40.getY() - 5);
                    _40.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_40.getX() - 5);
                    blue_ranger.setY(_40.getY() - 5);
                    _40.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_41.getX() - 5);
                    blue_war.setY(_41.getY() - 5);
                    _41.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_41.getX() - 5);
                    blue_s.setY(_41.getY() - 5);
                    _41.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_41.getX() - 5);
                    blue_ranger.setY(_41.getY() - 5);
                    _41.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_42.getX() - 5);
                    blue_war.setY(_42.getY() - 5);
                    _42.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_42.getX() - 5);
                    blue_s.setY(_42.getY() - 5);
                    _42.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_42.getX() - 5);
                    blue_ranger.setY(_42.getY() - 5);
                    _42.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_43.getX() - 5);
                    blue_war.setY(_43.getY() - 5);
                    _43.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_43.getX() - 5);
                    blue_s.setY(_43.getY() - 5);
                    _43.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_43.getX() - 5);
                    blue_ranger.setY(_43.getY() - 5);
                    _43.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_44.getX() - 5);
                    blue_war.setY(_44.getY() - 5);
                    _44.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_44.getX() - 5);
                    blue_s.setY(_44.getY() - 5);
                    _44.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_44.getX() - 5);
                    blue_ranger.setY(_44.getY() - 5);
                    _44.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_45.getX() - 5);
                    blue_war.setY(_45.getY() - 5);
                    _45.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_45.getX() - 5);
                    blue_s.setY(_45.getY() - 5);
                    _45.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_45.getX() - 5);
                    blue_ranger.setY(_45.getY() - 5);
                    _45.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_46.getX() - 5);
                    blue_war.setY(_46.getY() - 5);
                    _46.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_46.getX() - 5);
                    blue_s.setY(_46.getY() - 5);
                    _46.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_46.getX() - 5);
                    blue_ranger.setY(_46.getY() - 5);
                    _46.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_47.getX() - 5);
                    blue_war.setY(_47.getY() - 5);
                    _47.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_47.getX() - 5);
                    blue_s.setY(_47.getY() - 5);
                    _47.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_47.getX() - 5);
                    blue_ranger.setY(_47.getY() - 5);
                    _47.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _48.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_48.getX() - 5);
                    blue_war.setY(_48.getY() - 5);
                    _48.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_48.getX() - 5);
                    blue_s.setY(_48.getY() - 5);
                    _48.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_48.getX() - 5);
                    blue_ranger.setY(_48.getY() - 5);
                    _48.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_49.getX() - 5);
                    blue_war.setY(_49.getY() - 5);
                    _49.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_49.getX() - 5);
                    blue_s.setY(_49.getY() - 5);
                    _49.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_49.getX() - 5);
                    blue_ranger.setY(_49.getY() - 5);
                    _49.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_50.getX() - 5);
                    blue_war.setY(_50.getY() - 5);
                    _50.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_50.getX() - 5);
                    blue_s.setY(_50.getY() - 5);
                    _50.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_50.getX() - 5);
                    blue_ranger.setY(_50.getY() - 5);
                    _50.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_51.getX() - 5);
                    blue_war.setY(_51.getY() - 5);
                    _51.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_51.getX() - 5);
                    blue_s.setY(_51.getY() - 5);
                    _51.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_51.getX() - 5);
                    blue_ranger.setY(_51.getY() - 5);
                    _51.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_52.getX() - 5);
                    blue_war.setY(_52.getY() - 5);
                    _52.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_52.getX() - 5);
                    blue_s.setY(_52.getY() - 5);
                    _52.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_52.getX() - 5);
                    blue_ranger.setY(_52.getY() - 5);
                    _52.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _53.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_53.getX() - 5);
                    blue_war.setY(_53.getY() - 5);
                    _53.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_53.getX() - 5);
                    blue_s.setY(_53.getY() - 5);
                    _53.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_53.getX() - 5);
                    blue_ranger.setY(_53.getY() - 5);
                    _53.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_54.getX() - 5);
                    blue_war.setY(_54.getY() - 5);
                    _54.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_54.getX() - 5);
                    blue_s.setY(_54.getY() - 5);
                    _54.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_54.getX() - 5);
                    blue_ranger.setY(_54.getY() - 5);
                    _54.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_55.getX() - 5);
                    blue_war.setY(_55.getY() - 5);
                    _55.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_55.getX() - 5);
                    blue_s.setY(_55.getY() - 5);
                    _55.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_55.getX() - 5);
                    blue_ranger.setY(_55.getY() - 5);
                    _55.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_56.getX() - 5);
                    blue_war.setY(_56.getY() - 5);
                    _56.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_56.getX() - 5);
                    blue_s.setY(_56.getY() - 5);
                    _56.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_56.getX() - 5);
                    blue_ranger.setY(_56.getY() - 5);
                    _56.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_57.getX() - 5);
                    blue_war.setY(_57.getY() - 5);
                    _57.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_57.getX() - 5);
                    blue_s.setY(_57.getY() - 5);
                    _57.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_57.getX() - 5);
                    blue_ranger.setY(_57.getY() - 5);
                    _57.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _58.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_58.getX() - 5);
                    blue_war.setY(_58.getY() - 5);
                    _58.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_58.getX() - 5);
                    blue_s.setY(_58.getY() - 5);
                    _58.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_58.getX() - 5);
                    blue_ranger.setY(_58.getY() - 5);
                    _58.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _59.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_59.getX() - 5);
                    blue_war.setY(_59.getY() - 5);
                    _59.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_59.getX() - 5);
                    blue_s.setY(_59.getY() - 5);
                    _59.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_59.getX() - 5);
                    blue_ranger.setY(_59.getY() - 5);
                    _59.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _60.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_60.getX() - 5);
                    blue_war.setY(_60.getY() - 5);
                    _60.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_60.getX() - 5);
                    blue_s.setY(_60.getY() - 5);
                    _60.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_60.getX() - 5);
                    blue_ranger.setY(_60.getY() - 5);
                    _60.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _61.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_61.getX() - 5);
                    blue_war.setY(_61.getY() - 5);
                    _61.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_61.getX() - 5);
                    blue_s.setY(_61.getY() - 5);
                    _61.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_61.getX() - 5);
                    blue_ranger.setY(_61.getY() - 5);
                    _61.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _62.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_62.getX() - 5);
                    blue_war.setY(_62.getY() - 5);
                    _62.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_62.getX() - 5);
                    blue_s.setY(_62.getY() - 5);
                    _62.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_62.getX() - 5);
                    blue_ranger.setY(_62.getY() - 5);
                    _62.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _63.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_63.getX() - 5);
                    blue_war.setY(_63.getY() - 5);
                    _63.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_63.getX() - 5);
                    blue_s.setY(_63.getY() - 5);
                    _63.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_63.getX() - 5);
                    blue_ranger.setY(_63.getY() - 5);
                    _63.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });
        _64.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(bluewarrior_enabled == true){
                    blue_war.setX(_64.getX() - 5);
                    blue_war.setY(_64.getY() - 5);
                    _64.setVisibility(View.INVISIBLE);
                    bluewarrior_enabled = false;
                }
                if(bluesorc_enabled == true){
                    blue_s.setX(_64.getX() - 5);
                    blue_s.setY(_64.getY() - 5);
                    _64.setVisibility(View.INVISIBLE);
                    bluesorc_enabled = false;
                }
                if(blueranger_enabled == true){
                    blue_ranger.setX(_64.getX() - 5);
                    blue_ranger.setY(_64.getY() - 5);
                    _64.setVisibility(View.INVISIBLE);
                    blueranger_enabled = false;
                }
            }
        });

        //setupConnectionFactory();
        publishToAMQP();
        setupPubButton();

        final Handler incomingMessageHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                String message = msg.getData().getString("msg");
                TextView tv = (TextView) findViewById(R.id.textView);
                Date now = new Date();
                SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");
                tv.append(ft.format(now) + ' ' + message + '\n');
            }
        };
        subscribe(incomingMessageHandler);
    }

    void setupPubButton() {
        Button button = (Button) findViewById(R.id.publish);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText et = (EditText) findViewById(R.id.text);
                publishMessage(et.getText().toString());
                et.setText("");
            }
        });
    }

    Thread subscribeThread;
    Thread publishThread;
    @Override
    protected void onDestroy() {
        super.onDestroy();
        publishThread.interrupt();
        subscribeThread.interrupt();
    }

    private BlockingDeque<String> queue = new LinkedBlockingDeque<String>();
    void publishMessage(String message) {
        //Adds a message to internal blocking queue
        try {
            Log.d("","[q] " + message);
            queue.putLast(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ConnectionFactory factory = new ConnectionFactory();
    private void setupConnectionFactory() {
        String uri = "amqp://pi:raspberry@172.29.43.140:5672/test";
        try {
            factory.setAutomaticRecoveryEnabled(false);
            factory.setUri(uri);
        } catch (KeyManagementException | NoSuchAlgorithmException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    void subscribe(final Handler handler)
    {
        subscribeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Connection connection = factory.newConnection();
                        Channel channel = connection.createChannel();
                        channel.basicQos(1);
                        DeclareOk q = channel.queueDeclare();
                        channel.queueBind(q.getQueue(), "amq.fanout", "chat");
                        QueueingConsumer consumer = new QueueingConsumer(channel);
                        channel.basicConsume(q.getQueue(), true, consumer);

                        // Process deliveries
                        while (true) {
                            QueueingConsumer.Delivery delivery = consumer.nextDelivery();

                            String message = new String(delivery.getBody());
                            Log.d("","[r] " + message);

                            Message msg = handler.obtainMessage();
                            Bundle bundle = new Bundle();

                            bundle.putString("msg", message);
                            msg.setData(bundle);
                            handler.sendMessage(msg);
                        }
                    } catch (InterruptedException e) {
                        break;
                    } catch (Exception e1) {
                        Log.d("", "Connection broken: " + e1.getClass().getName());
                        try {
                            Thread.sleep(4000); //sleep and then try again
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                }
            }
        });
        subscribeThread.start();
    }


    public void publishToAMQP()
    {
        publishThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Connection connection = factory.newConnection();
                        Channel ch = connection.createChannel();
                        ch.confirmSelect();

                        while (true) {
                            String message = queue.takeFirst();
                            try{
                                ch.basicPublish("servertostorage", "store", null, message.getBytes());
                                Log.d("", "[s] " + message);
                                ch.waitForConfirmsOrDie();
                            } catch (Exception e){
                                Log.d("","[f] " + message);
                                queue.putFirst(message);
                                throw e;
                            }
                        }
                    } catch (InterruptedException e) {
                        break;
                    } catch (Exception e) {
                        Log.d("", "Connection broken: " + e.getClass().getName());
                        try {
                            Thread.sleep(5000); //sleep and then try again
                        } catch (InterruptedException e1) {
                            break;
                        }
                    }
                }
            }
        });
        publishThread.start();
    }
}
