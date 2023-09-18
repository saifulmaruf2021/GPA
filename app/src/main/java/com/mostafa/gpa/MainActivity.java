package com.mostafa.gpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {
    EditText edi_m1,edi_m2,edi_m3,edi_m4,edi_m5,edi_m6;
    MaterialButton btn_cal;
    TextView textV_p1,textV_p2,textV_p3,textV_p4,textV_p5,textV_p6,textV_p7,
            textV_g1,textV_g2,textV_g3,textV_g4,textV_g5,textV_g6,textV_g7,
            textV_m7,tv_display;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edi_m1 = findViewById(R.id.edi_m1);
        edi_m2 = findViewById(R.id.edi_m2);
        edi_m3 = findViewById(R.id.edi_m3);
        edi_m4 = findViewById(R.id.edi_m4);
        edi_m5 = findViewById(R.id.edi_m5);
        edi_m6 = findViewById(R.id.edi_m6);
        textV_m7 = findViewById(R.id.textV_m7);
        textV_g7 = findViewById(R.id.textV_g7);

        textV_p1 = findViewById(R.id.textV_p1);
        textV_p2 = findViewById(R.id.textV_p2);
        textV_p3 = findViewById(R.id.textV_p3);
        textV_p4 = findViewById(R.id.textV_p4);
        textV_p5 = findViewById(R.id.textV_p5);
        textV_p6 = findViewById(R.id.textV_p6);
        textV_p7 = findViewById(R.id.textV_p7);

        textV_g1 = findViewById(R.id.textV_g1);
        textV_g2 = findViewById(R.id.textV_g2);
        textV_g3 = findViewById(R.id.textV_g3);
        textV_g4 = findViewById(R.id.textV_g4);
        textV_g5 = findViewById(R.id.textV_g5);
        textV_g6 = findViewById(R.id.textV_g6);
        textV_g3 = findViewById(R.id.textV_g3);

        btn_cal = findViewById(R.id.btn_cal);

        tv_display = findViewById(R.id.tv_display);

        btnClear=findViewById(R.id.btnClear);




    //==================edi_m1 If code============================
    //============================================================



            edi_m1.addTextChangedListener(new TextWatcher() {

        @Override

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            if (edi_m1.getText().toString().equals("")){
                edi_m1.setError("Fill in the Box");
                textV_p1.setText("");
                textV_g1.setText("");

            }


        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

            if (edi_m1.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                if (edi_m1.getText().toString().equals("0") || edi_m1.getText().toString().equals("1") ||edi_m1.getText().toString().equals("2") ||edi_m1.getText().toString().equals("3") ||edi_m1.getText().toString().equals("4") ||edi_m1.getText().toString().equals("5") ||edi_m1.getText().toString().equals("0") ||edi_m1.getText().toString().equals("6") ||edi_m1.getText().toString().equals("7") ||edi_m1.getText().toString().equals("8") ||edi_m1.getText().toString().equals("9") ||edi_m1.getText().toString().equals("10") ||edi_m1.getText().toString().equals("11") ||edi_m1.getText().toString().equals("12") ||edi_m1.getText().toString().equals("13") ||edi_m1.getText().toString().equals("14") ||edi_m1.getText().toString().equals("15") ||edi_m1.getText().toString().equals("16") ||edi_m1.getText().toString().equals("17") ||edi_m1.getText().toString().equals("18") ||edi_m1.getText().toString().equals("19") ||edi_m1.getText().toString().equals("20") ||edi_m1.getText().toString().equals("21") ||edi_m1.getText().toString().equals("22") ||edi_m1.getText().toString().equals("23") ||edi_m1.getText().toString().equals("24") ||edi_m1.getText().toString().equals("25") ||edi_m1.getText().toString().equals("26") ||edi_m1.getText().toString().equals("27") ||edi_m1.getText().toString().equals("28") ||edi_m1.getText().toString().equals("29") ||edi_m1.getText().toString().equals("30") ||edi_m1.getText().toString().equals("31") ||edi_m1.getText().toString().equals("32") ){

                    textV_p1.setText("0.0");
                    textV_g1.setText("F");
            //====================================33-39==-------------------=======================
                }else if (edi_m1.getText().toString().equals("33") || edi_m1.getText().toString().equals("34") || edi_m1.getText().toString().equals("35") || edi_m1.getText().toString().equals("36") || edi_m1.getText().toString().equals("37") || edi_m1.getText().toString().equals("38") || edi_m1.getText().toString().equals("39")){

                    textV_p1.setText("1.0");
                    textV_g1.setText("D");
                    //====================================40-49==-------------------=======================
                }else if (edi_m1.getText().toString().equals("40") || edi_m1.getText().toString().equals("41") || edi_m1.getText().toString().equals("42") || edi_m1.getText().toString().equals("43") || edi_m1.getText().toString().equals("44") || edi_m1.getText().toString().equals("45") || edi_m1.getText().toString().equals("46")|| edi_m1.getText().toString().equals("47")|| edi_m1.getText().toString().equals("48")|| edi_m1.getText().toString().equals("49")){

                    textV_p1.setText("2.0");
                    textV_g1.setText("C");
                    //====================================50-59==-------------------=======================
                }else if (edi_m1.getText().toString().equals("50") || edi_m1.getText().toString().equals("51") || edi_m1.getText().toString().equals("52") || edi_m1.getText().toString().equals("53") || edi_m1.getText().toString().equals("54") || edi_m1.getText().toString().equals("55") || edi_m1.getText().toString().equals("56")|| edi_m1.getText().toString().equals("57")|| edi_m1.getText().toString().equals("58")|| edi_m1.getText().toString().equals("59")){

                    textV_p1.setText("3.0");
                    textV_g1.setText("B");
                    //====================================60-69==-------------------=======================
                }else if (edi_m1.getText().toString().equals("60") || edi_m1.getText().toString().equals("61") || edi_m1.getText().toString().equals("62") || edi_m1.getText().toString().equals("63") || edi_m1.getText().toString().equals("64") || edi_m1.getText().toString().equals("65") || edi_m1.getText().toString().equals("66")|| edi_m1.getText().toString().equals("67")|| edi_m1.getText().toString().equals("68")|| edi_m1.getText().toString().equals("69")){

                    textV_p1.setText("3.5");
                    textV_g1.setText("A-");
                    //====================================70-79==-------------------=======================
                }else if (edi_m1.getText().toString().equals("70") || edi_m1.getText().toString().equals("71") || edi_m1.getText().toString().equals("72") || edi_m1.getText().toString().equals("73") || edi_m1.getText().toString().equals("74") || edi_m1.getText().toString().equals("75") || edi_m1.getText().toString().equals("76")|| edi_m1.getText().toString().equals("77")|| edi_m1.getText().toString().equals("78")|| edi_m1.getText().toString().equals("79")){

                    textV_p1.setText("4.0");
                    textV_g1.setText("A");
                    //====================================80-100==-------------------=======================
                }else if (edi_m1.getText().toString().equals("80") || edi_m1.getText().toString().equals("81") || edi_m1.getText().toString().equals("82") || edi_m1.getText().toString().equals("83") || edi_m1.getText().toString().equals("84") || edi_m1.getText().toString().equals("85") || edi_m1.getText().toString().equals("86")|| edi_m1.getText().toString().equals("87")|| edi_m1.getText().toString().equals("88")|| edi_m1.getText().toString().equals("89") || edi_m1.getText().toString().equals("90") || edi_m1.getText().toString().equals("91") || edi_m1.getText().toString().equals("92") || edi_m1.getText().toString().equals("93") || edi_m1.getText().toString().equals("94") || edi_m1.getText().toString().equals("95") || edi_m1.getText().toString().equals("96")|| edi_m1.getText().toString().equals("97")|| edi_m1.getText().toString().equals("98")|| edi_m1.getText().toString().equals("99")|| edi_m1.getText().toString().equals("100")){

                    textV_p1.setText("5.0");
                    textV_g1.setText("A+");

                }




            }else {
                edi_m1.setError("Fill in the Box");

            }




        }



        @Override
        public void afterTextChanged(Editable editable) {
            if (edi_m1.getText().toString().equals("")){
                edi_m1.setError("Fill in the Box");
                textV_p1.setText("");
                textV_g1.setText("");

            }

        }
    });

        //==================edi_m2 If code============================

        edi_m2.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edi_m2.getText().toString().equals("")){
                    edi_m2.setError("Fill in the Box");
                    textV_p2.setText("");
                    textV_g2.setText("");

                }


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

                if (edi_m2.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                    if (edi_m2.getText().toString().equals("0") || edi_m2.getText().toString().equals("1") ||edi_m2.getText().toString().equals("2") ||edi_m2.getText().toString().equals("3") ||edi_m2.getText().toString().equals("4") ||edi_m2.getText().toString().equals("5") ||edi_m2.getText().toString().equals("0") ||edi_m2.getText().toString().equals("6") ||edi_m2.getText().toString().equals("7") ||edi_m2.getText().toString().equals("8") ||edi_m2.getText().toString().equals("9") ||edi_m2.getText().toString().equals("10") ||edi_m2.getText().toString().equals("11") ||edi_m2.getText().toString().equals("12") ||edi_m2.getText().toString().equals("13") ||edi_m2.getText().toString().equals("14") ||edi_m2.getText().toString().equals("15") ||edi_m2.getText().toString().equals("16") ||edi_m2.getText().toString().equals("17") ||edi_m2.getText().toString().equals("18") ||edi_m2.getText().toString().equals("19") ||edi_m2.getText().toString().equals("20") ||edi_m2.getText().toString().equals("21") ||edi_m2.getText().toString().equals("22") ||edi_m2.getText().toString().equals("23") ||edi_m2.getText().toString().equals("24") ||edi_m2.getText().toString().equals("25") ||edi_m2.getText().toString().equals("26") ||edi_m2.getText().toString().equals("27") ||edi_m2.getText().toString().equals("28") ||edi_m2.getText().toString().equals("29") ||edi_m2.getText().toString().equals("30") ||edi_m2.getText().toString().equals("31") ||edi_m2.getText().toString().equals("32") ){

                        textV_p2.setText("0.0");
                        textV_g2.setText("F");
                        //====================================33-39==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("33") || edi_m2.getText().toString().equals("34") || edi_m2.getText().toString().equals("35") || edi_m2.getText().toString().equals("36") || edi_m2.getText().toString().equals("37") || edi_m2.getText().toString().equals("38") || edi_m2.getText().toString().equals("39")){

                        textV_p2.setText("1.0");
                        textV_g2.setText("D");
                        //====================================40-49==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("40") || edi_m2.getText().toString().equals("41") || edi_m2.getText().toString().equals("42") || edi_m2.getText().toString().equals("43") || edi_m2.getText().toString().equals("44") || edi_m2.getText().toString().equals("45") || edi_m2.getText().toString().equals("46")|| edi_m2.getText().toString().equals("47")|| edi_m2.getText().toString().equals("48")|| edi_m2.getText().toString().equals("49")){

                        textV_p2.setText("2.0");
                        textV_g2.setText("C");
                        //====================================50-59==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("50") || edi_m2.getText().toString().equals("51") || edi_m2.getText().toString().equals("52") || edi_m2.getText().toString().equals("53") || edi_m2.getText().toString().equals("54") || edi_m2.getText().toString().equals("55") || edi_m2.getText().toString().equals("56")|| edi_m2.getText().toString().equals("57")|| edi_m2.getText().toString().equals("58")|| edi_m2.getText().toString().equals("59")){

                        textV_p2.setText("3.0");
                        textV_g2.setText("B");
                        //====================================60-69==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("60") || edi_m2.getText().toString().equals("61") || edi_m2.getText().toString().equals("62") || edi_m2.getText().toString().equals("63") || edi_m2.getText().toString().equals("64") || edi_m2.getText().toString().equals("65") || edi_m2.getText().toString().equals("66")|| edi_m2.getText().toString().equals("67")|| edi_m2.getText().toString().equals("68")|| edi_m2.getText().toString().equals("69")){

                        textV_p2.setText("3.5");
                        textV_g2.setText("A-");
                        //====================================70-79==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("70") || edi_m2.getText().toString().equals("71") || edi_m2.getText().toString().equals("72") || edi_m2.getText().toString().equals("73") || edi_m2.getText().toString().equals("74") || edi_m2.getText().toString().equals("75") || edi_m2.getText().toString().equals("76")|| edi_m2.getText().toString().equals("77")|| edi_m2.getText().toString().equals("78")|| edi_m2.getText().toString().equals("79")){

                        textV_p2.setText("4.0");
                        textV_g2.setText("A");
                        //====================================80-100==-------------------=======================
                    }else if (edi_m2.getText().toString().equals("80") || edi_m2.getText().toString().equals("81") || edi_m2.getText().toString().equals("82") || edi_m2.getText().toString().equals("83") || edi_m2.getText().toString().equals("84") || edi_m2.getText().toString().equals("85") || edi_m2.getText().toString().equals("86")|| edi_m2.getText().toString().equals("87")|| edi_m2.getText().toString().equals("88")|| edi_m2.getText().toString().equals("89") || edi_m2.getText().toString().equals("90") || edi_m2.getText().toString().equals("91") || edi_m2.getText().toString().equals("92") || edi_m2.getText().toString().equals("93") || edi_m2.getText().toString().equals("94") || edi_m2.getText().toString().equals("95") || edi_m2.getText().toString().equals("96")|| edi_m2.getText().toString().equals("97")|| edi_m2.getText().toString().equals("98")|| edi_m2.getText().toString().equals("99")|| edi_m2.getText().toString().equals("100")){

                        textV_p2.setText("5.0");
                        textV_g2.setText("A+");

                    }




                }else {
                    edi_m2.setError("Fill in the Box");

                }




            }



            @Override
            public void afterTextChanged(Editable editable) {
                if (edi_m2.getText().toString().equals("")){
                    edi_m2.setError("Fill in the Box");
                    textV_p2.setText("");
                    textV_g2.setText("");

                }

            }
        });

        //==================edi_m3 If code============================
        edi_m3.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edi_m3.getText().toString().equals("")){
                    edi_m3.setError("Fill in the Box");
                    textV_p3.setText("");
                    textV_g3.setText("");

                }


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

                if (edi_m3.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                    if (edi_m3.getText().toString().equals("0") || edi_m3.getText().toString().equals("1") ||edi_m3.getText().toString().equals("2") ||edi_m3.getText().toString().equals("3") ||edi_m3.getText().toString().equals("4") ||edi_m3.getText().toString().equals("5") ||edi_m3.getText().toString().equals("0") ||edi_m3.getText().toString().equals("6") ||edi_m3.getText().toString().equals("7") ||edi_m3.getText().toString().equals("8") ||edi_m3.getText().toString().equals("9") ||edi_m3.getText().toString().equals("10") ||edi_m3.getText().toString().equals("11") ||edi_m3.getText().toString().equals("12") ||edi_m3.getText().toString().equals("13") ||edi_m3.getText().toString().equals("14") ||edi_m3.getText().toString().equals("15") ||edi_m3.getText().toString().equals("16") ||edi_m3.getText().toString().equals("17") ||edi_m3.getText().toString().equals("18") ||edi_m3.getText().toString().equals("19") ||edi_m3.getText().toString().equals("20") ||edi_m3.getText().toString().equals("21") ||edi_m3.getText().toString().equals("22") ||edi_m3.getText().toString().equals("23") ||edi_m3.getText().toString().equals("24") ||edi_m3.getText().toString().equals("25") ||edi_m3.getText().toString().equals("26") ||edi_m3.getText().toString().equals("27") ||edi_m3.getText().toString().equals("28") ||edi_m3.getText().toString().equals("29") ||edi_m3.getText().toString().equals("30") ||edi_m3.getText().toString().equals("31") ||edi_m3.getText().toString().equals("32") ){

                        textV_p3.setText("0.0");
                        textV_g3.setText("F");
                        //====================================33-39==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("33") || edi_m3.getText().toString().equals("34") || edi_m3.getText().toString().equals("35") || edi_m3.getText().toString().equals("36") || edi_m3.getText().toString().equals("37") || edi_m3.getText().toString().equals("38") || edi_m3.getText().toString().equals("39")){

                        textV_p3.setText("1.0");
                        textV_g3.setText("D");
                        //====================================40-49==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("40") || edi_m3.getText().toString().equals("41") || edi_m3.getText().toString().equals("42") || edi_m3.getText().toString().equals("43") || edi_m3.getText().toString().equals("44") || edi_m3.getText().toString().equals("45") || edi_m3.getText().toString().equals("46")|| edi_m3.getText().toString().equals("47")|| edi_m3.getText().toString().equals("48")|| edi_m3.getText().toString().equals("49")){

                        textV_p3.setText("2.0");
                        textV_g3.setText("C");
                        //====================================50-59==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("50") || edi_m3.getText().toString().equals("51") || edi_m3.getText().toString().equals("52") || edi_m3.getText().toString().equals("53") || edi_m3.getText().toString().equals("54") || edi_m3.getText().toString().equals("55") || edi_m3.getText().toString().equals("56")|| edi_m3.getText().toString().equals("57")|| edi_m3.getText().toString().equals("58")|| edi_m3.getText().toString().equals("59")){

                        textV_p3.setText("3.0");
                        textV_g3.setText("B");
                        //====================================60-69==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("60") || edi_m3.getText().toString().equals("61") || edi_m3.getText().toString().equals("62") || edi_m3.getText().toString().equals("63") || edi_m3.getText().toString().equals("64") || edi_m3.getText().toString().equals("65") || edi_m3.getText().toString().equals("66")|| edi_m3.getText().toString().equals("67")|| edi_m3.getText().toString().equals("68")|| edi_m3.getText().toString().equals("69")){

                        textV_p3.setText("3.5");
                        textV_g3.setText("A-");
                        //====================================70-79==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("70") || edi_m3.getText().toString().equals("71") || edi_m3.getText().toString().equals("72") || edi_m3.getText().toString().equals("73") || edi_m3.getText().toString().equals("74") || edi_m3.getText().toString().equals("75") || edi_m3.getText().toString().equals("76")|| edi_m3.getText().toString().equals("77")|| edi_m3.getText().toString().equals("78")|| edi_m3.getText().toString().equals("79")){

                        textV_p3.setText("4.0");
                        textV_g3.setText("A");
                        //====================================80-100==-------------------=======================
                    }else if (edi_m3.getText().toString().equals("80") || edi_m3.getText().toString().equals("81") || edi_m3.getText().toString().equals("82") || edi_m3.getText().toString().equals("83") || edi_m3.getText().toString().equals("84") || edi_m3.getText().toString().equals("85") || edi_m3.getText().toString().equals("86")|| edi_m3.getText().toString().equals("87")|| edi_m3.getText().toString().equals("88")|| edi_m3.getText().toString().equals("89") || edi_m3.getText().toString().equals("90") || edi_m3.getText().toString().equals("91") || edi_m3.getText().toString().equals("92") || edi_m3.getText().toString().equals("93") || edi_m3.getText().toString().equals("94") || edi_m3.getText().toString().equals("95") || edi_m3.getText().toString().equals("96")|| edi_m3.getText().toString().equals("97")|| edi_m3.getText().toString().equals("98")|| edi_m3.getText().toString().equals("99")|| edi_m3.getText().toString().equals("100")){

                        textV_p3.setText("5.0");
                        textV_g3.setText("A+");

                    }




                }else {
                    edi_m3.setError("Fill in the Box");

                }




            }



            @Override
            public void afterTextChanged(Editable editable) {
                if (edi_m3.getText().toString().equals("")){
                    edi_m3.setError("Fill in the Box");
                    textV_p3.setText("");
                    textV_g3.setText("");

                }

            }
        });
        //==================edi_m4 If code============================
        edi_m4.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edi_m4.getText().toString().equals("")){
                    edi_m4.setError("Fill in the Box");
                    textV_p4.setText("");
                    textV_g4.setText("");

                }


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

                if (edi_m4.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                    if (edi_m4.getText().toString().equals("0") || edi_m4.getText().toString().equals("1") ||edi_m4.getText().toString().equals("2") ||edi_m4.getText().toString().equals("3") ||edi_m4.getText().toString().equals("4") ||edi_m4.getText().toString().equals("5") ||edi_m4.getText().toString().equals("0") ||edi_m4.getText().toString().equals("6") ||edi_m4.getText().toString().equals("7") ||edi_m4.getText().toString().equals("8") ||edi_m4.getText().toString().equals("9") ||edi_m4.getText().toString().equals("10") ||edi_m4.getText().toString().equals("11") ||edi_m4.getText().toString().equals("12") ||edi_m4.getText().toString().equals("13") ||edi_m4.getText().toString().equals("14") ||edi_m4.getText().toString().equals("15") ||edi_m4.getText().toString().equals("16") ||edi_m4.getText().toString().equals("17") ||edi_m4.getText().toString().equals("18") ||edi_m4.getText().toString().equals("19") ||edi_m4.getText().toString().equals("20") ||edi_m4.getText().toString().equals("21") ||edi_m4.getText().toString().equals("22") ||edi_m4.getText().toString().equals("23") ||edi_m4.getText().toString().equals("24") ||edi_m4.getText().toString().equals("25") ||edi_m4.getText().toString().equals("26") ||edi_m4.getText().toString().equals("27") ||edi_m4.getText().toString().equals("28") ||edi_m4.getText().toString().equals("29") ||edi_m4.getText().toString().equals("30") ||edi_m4.getText().toString().equals("31") ||edi_m4.getText().toString().equals("32") ){

                        textV_p4.setText("0.0");
                        textV_g4.setText("F");
                        //====================================33-39==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("33") || edi_m4.getText().toString().equals("34") || edi_m4.getText().toString().equals("35") || edi_m4.getText().toString().equals("36") || edi_m4.getText().toString().equals("37") || edi_m4.getText().toString().equals("38") || edi_m4.getText().toString().equals("39")){

                        textV_p4.setText("1.0");
                        textV_g4.setText("D");
                        //====================================40-49==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("40") || edi_m4.getText().toString().equals("41") || edi_m4.getText().toString().equals("42") || edi_m4.getText().toString().equals("43") || edi_m4.getText().toString().equals("44") || edi_m4.getText().toString().equals("45") || edi_m4.getText().toString().equals("46")|| edi_m4.getText().toString().equals("47")|| edi_m4.getText().toString().equals("48")|| edi_m4.getText().toString().equals("49")){

                        textV_p4.setText("2.0");
                        textV_g4.setText("C");
                        //====================================50-59==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("50") || edi_m4.getText().toString().equals("51") || edi_m4.getText().toString().equals("52") || edi_m4.getText().toString().equals("53") || edi_m4.getText().toString().equals("54") || edi_m4.getText().toString().equals("55") || edi_m4.getText().toString().equals("56")|| edi_m4.getText().toString().equals("57")|| edi_m4.getText().toString().equals("58")|| edi_m4.getText().toString().equals("59")){

                        textV_p4.setText("3.0");
                        textV_g4.setText("B");
                        //====================================60-69==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("60") || edi_m4.getText().toString().equals("61") || edi_m4.getText().toString().equals("62") || edi_m4.getText().toString().equals("63") || edi_m4.getText().toString().equals("64") || edi_m4.getText().toString().equals("65") || edi_m4.getText().toString().equals("66")|| edi_m4.getText().toString().equals("67")|| edi_m4.getText().toString().equals("68")|| edi_m4.getText().toString().equals("69")){

                        textV_p4.setText("3.5");
                        textV_g4.setText("A-");
                        //====================================70-79==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("70") || edi_m4.getText().toString().equals("71") || edi_m4.getText().toString().equals("72") || edi_m4.getText().toString().equals("73") || edi_m4.getText().toString().equals("74") || edi_m4.getText().toString().equals("75") || edi_m4.getText().toString().equals("76")|| edi_m4.getText().toString().equals("77")|| edi_m4.getText().toString().equals("78")|| edi_m4.getText().toString().equals("79")){

                        textV_p4.setText("4.0");
                        textV_g4.setText("A");
                        //====================================80-100==-------------------=======================
                    }else if (edi_m4.getText().toString().equals("80") || edi_m4.getText().toString().equals("81") || edi_m4.getText().toString().equals("82") || edi_m4.getText().toString().equals("83") || edi_m4.getText().toString().equals("84") || edi_m4.getText().toString().equals("85") || edi_m4.getText().toString().equals("86")|| edi_m4.getText().toString().equals("87")|| edi_m4.getText().toString().equals("88")|| edi_m4.getText().toString().equals("89") || edi_m4.getText().toString().equals("90") || edi_m4.getText().toString().equals("91") || edi_m4.getText().toString().equals("92") || edi_m4.getText().toString().equals("93") || edi_m4.getText().toString().equals("94") || edi_m4.getText().toString().equals("95") || edi_m4.getText().toString().equals("96")|| edi_m4.getText().toString().equals("97")|| edi_m4.getText().toString().equals("98")|| edi_m4.getText().toString().equals("99")|| edi_m4.getText().toString().equals("100")){

                        textV_p4.setText("5.0");
                        textV_g4.setText("A+");

                    }



                }else {
                    edi_m4.setError("Fill in the Box");

                }

            }



            @Override
            public void afterTextChanged(Editable editable) {
                if (edi_m4.getText().toString().equals("")){
                    edi_m4.setError("Fill in the Box");
                    textV_p4.setText("");
                    textV_g4.setText("");

                }

            }
        });
        //==================edi_m5 If code============================
        edi_m5.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edi_m5.getText().toString().equals("")){
                    edi_m5.setError("Fill in the Box");
                    textV_p5.setText("");
                    textV_g5.setText("");

                }


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

                if (edi_m5.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                    if (edi_m5.getText().toString().equals("0") || edi_m5.getText().toString().equals("1") ||edi_m5.getText().toString().equals("2") ||edi_m5.getText().toString().equals("3") ||edi_m5.getText().toString().equals("4") ||edi_m5.getText().toString().equals("5") ||edi_m5.getText().toString().equals("0") ||edi_m5.getText().toString().equals("6") ||edi_m5.getText().toString().equals("7") ||edi_m5.getText().toString().equals("8") ||edi_m5.getText().toString().equals("9") ||edi_m5.getText().toString().equals("10") ||edi_m5.getText().toString().equals("11") ||edi_m5.getText().toString().equals("12") ||edi_m5.getText().toString().equals("13") ||edi_m5.getText().toString().equals("14") ||edi_m5.getText().toString().equals("15") ||edi_m5.getText().toString().equals("16") ||edi_m5.getText().toString().equals("17") ||edi_m5.getText().toString().equals("18") ||edi_m5.getText().toString().equals("19") ||edi_m5.getText().toString().equals("20") ||edi_m5.getText().toString().equals("21") ||edi_m5.getText().toString().equals("22") ||edi_m5.getText().toString().equals("23") ||edi_m5.getText().toString().equals("24") ||edi_m5.getText().toString().equals("25") ||edi_m5.getText().toString().equals("26") ||edi_m5.getText().toString().equals("27") ||edi_m5.getText().toString().equals("28") ||edi_m5.getText().toString().equals("29") ||edi_m5.getText().toString().equals("30") ||edi_m5.getText().toString().equals("31") ||edi_m5.getText().toString().equals("32") ){

                        textV_p5.setText("0.0");
                        textV_g5.setText("F");
                        //====================================33-39==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("33") || edi_m5.getText().toString().equals("34") || edi_m5.getText().toString().equals("35") || edi_m5.getText().toString().equals("36") || edi_m5.getText().toString().equals("37") || edi_m5.getText().toString().equals("38") || edi_m5.getText().toString().equals("39")){

                        textV_p5.setText("1.0");
                        textV_g5.setText("D");
                        //====================================40-49==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("40") || edi_m5.getText().toString().equals("41") || edi_m5.getText().toString().equals("42") || edi_m5.getText().toString().equals("43") || edi_m5.getText().toString().equals("44") || edi_m5.getText().toString().equals("45") || edi_m5.getText().toString().equals("46")|| edi_m5.getText().toString().equals("47")|| edi_m5.getText().toString().equals("48")|| edi_m5.getText().toString().equals("49")){

                        textV_p5.setText("2.0");
                        textV_g5.setText("C");
                        //====================================50-59==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("50") || edi_m5.getText().toString().equals("51") || edi_m5.getText().toString().equals("52") || edi_m5.getText().toString().equals("53") || edi_m5.getText().toString().equals("54") || edi_m5.getText().toString().equals("55") || edi_m5.getText().toString().equals("56")|| edi_m5.getText().toString().equals("57")|| edi_m5.getText().toString().equals("58")|| edi_m5.getText().toString().equals("59")){

                        textV_p5.setText("3.0");
                        textV_g5.setText("B");
                        //====================================60-69==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("60") || edi_m5.getText().toString().equals("61") || edi_m5.getText().toString().equals("62") || edi_m5.getText().toString().equals("63") || edi_m5.getText().toString().equals("64") || edi_m5.getText().toString().equals("65") || edi_m5.getText().toString().equals("66")|| edi_m5.getText().toString().equals("67")|| edi_m5.getText().toString().equals("68")|| edi_m5.getText().toString().equals("69")){

                        textV_p5.setText("3.5");
                        textV_g5.setText("A-");
                        //====================================70-79==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("70") || edi_m5.getText().toString().equals("71") || edi_m5.getText().toString().equals("72") || edi_m5.getText().toString().equals("73") || edi_m5.getText().toString().equals("74") || edi_m5.getText().toString().equals("75") || edi_m5.getText().toString().equals("76")|| edi_m5.getText().toString().equals("77")|| edi_m5.getText().toString().equals("78")|| edi_m5.getText().toString().equals("79")){

                        textV_p5.setText("4.0");
                        textV_g5.setText("A");
                        //====================================80-100==-------------------=======================
                    }else if (edi_m5.getText().toString().equals("80") || edi_m5.getText().toString().equals("81") || edi_m5.getText().toString().equals("82") || edi_m5.getText().toString().equals("83") || edi_m5.getText().toString().equals("84") || edi_m5.getText().toString().equals("85") || edi_m5.getText().toString().equals("86")|| edi_m5.getText().toString().equals("87")|| edi_m5.getText().toString().equals("88")|| edi_m5.getText().toString().equals("89") || edi_m5.getText().toString().equals("90") || edi_m5.getText().toString().equals("91") || edi_m5.getText().toString().equals("92") || edi_m5.getText().toString().equals("93") || edi_m5.getText().toString().equals("94") || edi_m5.getText().toString().equals("95") || edi_m5.getText().toString().equals("96")|| edi_m5.getText().toString().equals("97")|| edi_m5.getText().toString().equals("98")|| edi_m5.getText().toString().equals("99")|| edi_m5.getText().toString().equals("100")){

                        textV_p5.setText("5.0");
                        textV_g5.setText("A+");

                    }




                }else {
                    edi_m5.setError("Fill in the Box");

                }




            }



            @Override
            public void afterTextChanged(Editable editable) {
                if (edi_m5.getText().toString().equals("")){
                    edi_m5.setError("Fill in the Box");
                    textV_p5.setText("");
                    textV_g5.setText("");

                }

            }
        });
        //==================edi_m6 If code============================
        edi_m6.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edi_m6.getText().toString().equals("")){
                    edi_m6.setError("Fill in the Box");
                    textV_p6.setText("");
                    textV_g6.setText("");

                }


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2 ) {

                if (edi_m6.getText().toString().length() > 0){
//                ====================================0-32-------------------=======================
                    if (edi_m6.getText().toString().equals("0") || edi_m6.getText().toString().equals("1") ||edi_m6.getText().toString().equals("2") ||edi_m6.getText().toString().equals("3") ||edi_m6.getText().toString().equals("4") ||edi_m6.getText().toString().equals("5") ||edi_m6.getText().toString().equals("0") ||edi_m6.getText().toString().equals("6") ||edi_m6.getText().toString().equals("7") ||edi_m6.getText().toString().equals("8") ||edi_m6.getText().toString().equals("9") ||edi_m6.getText().toString().equals("10") ||edi_m6.getText().toString().equals("11") ||edi_m6.getText().toString().equals("12") ||edi_m6.getText().toString().equals("13") ||edi_m6.getText().toString().equals("14") ||edi_m6.getText().toString().equals("15") ||edi_m6.getText().toString().equals("16") ||edi_m6.getText().toString().equals("17") ||edi_m6.getText().toString().equals("18") ||edi_m6.getText().toString().equals("19") ||edi_m6.getText().toString().equals("20") ||edi_m6.getText().toString().equals("21") ||edi_m6.getText().toString().equals("22") ||edi_m6.getText().toString().equals("23") ||edi_m6.getText().toString().equals("24") ||edi_m6.getText().toString().equals("25") ||edi_m6.getText().toString().equals("26") ||edi_m6.getText().toString().equals("27") ||edi_m6.getText().toString().equals("28") ||edi_m6.getText().toString().equals("29") ||edi_m6.getText().toString().equals("30") ||edi_m6.getText().toString().equals("31") ||edi_m6.getText().toString().equals("32") ){

                        textV_p6.setText("0.0");
                        textV_g6.setText("F");
                        //====================================33-39==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("33") || edi_m6.getText().toString().equals("34") || edi_m6.getText().toString().equals("35") || edi_m6.getText().toString().equals("36") || edi_m6.getText().toString().equals("37") || edi_m6.getText().toString().equals("38") || edi_m6.getText().toString().equals("39")){

                        textV_p6.setText("1.0");
                        textV_g6.setText("D");
                        //====================================40-49==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("40") || edi_m6.getText().toString().equals("41") || edi_m6.getText().toString().equals("42") || edi_m6.getText().toString().equals("43") || edi_m6.getText().toString().equals("44") || edi_m6.getText().toString().equals("45") || edi_m6.getText().toString().equals("46")|| edi_m6.getText().toString().equals("47")|| edi_m6.getText().toString().equals("48")|| edi_m6.getText().toString().equals("49")){

                        textV_p6.setText("2.0");
                        textV_g6.setText("C");
                        //====================================50-59==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("50") || edi_m6.getText().toString().equals("51") || edi_m6.getText().toString().equals("52") || edi_m6.getText().toString().equals("53") || edi_m6.getText().toString().equals("54") || edi_m6.getText().toString().equals("55") || edi_m6.getText().toString().equals("56")|| edi_m6.getText().toString().equals("57")|| edi_m6.getText().toString().equals("58")|| edi_m6.getText().toString().equals("59")){

                        textV_p6.setText("3.0");
                        textV_g6.setText("B");
                        //====================================60-69==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("60") || edi_m6.getText().toString().equals("61") || edi_m6.getText().toString().equals("62") || edi_m6.getText().toString().equals("63") || edi_m6.getText().toString().equals("64") || edi_m6.getText().toString().equals("65") || edi_m6.getText().toString().equals("66")|| edi_m6.getText().toString().equals("67")|| edi_m6.getText().toString().equals("68")|| edi_m6.getText().toString().equals("69")){

                        textV_p6.setText("3.5");
                        textV_g6.setText("A-");
                        //====================================70-79==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("70") || edi_m6.getText().toString().equals("71") || edi_m6.getText().toString().equals("72") || edi_m6.getText().toString().equals("73") || edi_m6.getText().toString().equals("74") || edi_m6.getText().toString().equals("75") || edi_m6.getText().toString().equals("76")|| edi_m6.getText().toString().equals("77")|| edi_m6.getText().toString().equals("78")|| edi_m6.getText().toString().equals("79")){

                        textV_p6.setText("4.0");
                        textV_g6.setText("A");
                        //====================================80-100==-------------------=======================
                    }else if (edi_m6.getText().toString().equals("80") || edi_m6.getText().toString().equals("81") || edi_m6.getText().toString().equals("82") || edi_m6.getText().toString().equals("83") || edi_m6.getText().toString().equals("84") || edi_m6.getText().toString().equals("85") || edi_m6.getText().toString().equals("86")|| edi_m6.getText().toString().equals("87")|| edi_m6.getText().toString().equals("88")|| edi_m6.getText().toString().equals("89") || edi_m6.getText().toString().equals("90") || edi_m6.getText().toString().equals("91") || edi_m6.getText().toString().equals("92") || edi_m6.getText().toString().equals("93") || edi_m6.getText().toString().equals("94") || edi_m6.getText().toString().equals("95") || edi_m6.getText().toString().equals("96")|| edi_m6.getText().toString().equals("97")|| edi_m6.getText().toString().equals("98")|| edi_m6.getText().toString().equals("99")|| edi_m6.getText().toString().equals("100")){

                        textV_p6.setText("5.0");
                        textV_g6.setText("A+");

                    }


                }else {
                    edi_m6.setError("Fill in the Box");

                }

            }


            @Override
            public void afterTextChanged(Editable editable) {
                if (edi_m6.getText().toString().equals("")){
                    edi_m6.setError("Fill in the Box");
                    textV_p6.setText("");
                    textV_g6.setText("");

                }

            }
        });




        
//        ======================================================
//        ================================================================
//================================================================================
 //        ==================================String To Integer convert=====================

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String editBox1 = edi_m1.getText().toString();
                String editBox2 = edi_m2.getText().toString();
                String editBox3 = edi_m3.getText().toString();
                String editBox4 = edi_m4.getText().toString();
                String editBox5 = edi_m5.getText().toString();
                String editBox6 = edi_m6.getText().toString();
                
                if (editBox1.length()>0 && editBox2.length()>0 && editBox3.length()>0 && editBox4.length()>0 && editBox5.length()>0 && editBox6.length()>0){


                    int bangleEdi = Integer.parseInt(editBox1);
                    int englishaEdi = Integer.parseInt(editBox2);
                    int mathlaEdi = Integer.parseInt(editBox3);
                    int scienceEdi = Integer.parseInt(editBox4);
                    int socialEdi = Integer.parseInt(editBox5);
                    int religionEdi = Integer.parseInt(editBox6);

                    int totalMark = bangleEdi + englishaEdi + mathlaEdi + scienceEdi + socialEdi + religionEdi;

                    String totalMarkString = String.valueOf(totalMark); // Convert int to String

                    textV_m7.setText(totalMarkString);


//                =============================point =================

                    // Get the text from each TextView
                    String strNum1 = textV_p1.getText().toString();
                    String strNum2 = textV_p2.getText().toString();
                    String strNum3 = textV_p3.getText().toString();
                    String strNum4 = textV_p4.getText().toString();
                    String strNum5 = textV_p5.getText().toString();
                    String strNum6 = textV_p6.getText().toString();

                    // Convert the text to floats

                    float num1 = Float.parseFloat(strNum1);
                    float num2 = Float.parseFloat(strNum2);
                    float num3 = Float.parseFloat(strNum3);
                    float num4 = Float.parseFloat(strNum4);
                    float num5 = Float.parseFloat(strNum5);
                    float num6 = Float.parseFloat(strNum6);

                    // Add the numbers together

                    float sum = num1 + num2 + num3 + num4 + num5 + num6;
                    float pointResult = sum / 6;

                    // Display the result
                    String formattedResult = String.format("%.2f", pointResult); // Format to three decimal places

                    textV_p7.setText(formattedResult);


//                    =============================grad========================


                    if (num1 == 0.0 || num2 == 0.0 || num3 == 0.0 || num4 == 0.0 || num5 == 0.0 || num6 == 0.0 ){
                        textV_g7.setText("F");
                        tv_display.setText("You are a Fail");
                    }else if (pointResult == 1.00){
                        textV_g7.setText("D");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }else if (pointResult >1.00 && pointResult == 2.00 || pointResult <2.00){
                        textV_g7.setText("C");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }else if (pointResult >2.00 && pointResult == 3.00 || pointResult <3.00){
                        textV_g7.setText("B");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }else if (pointResult >3.00 && pointResult == 3.50 || pointResult <3.50){
                        textV_g7.setText("A-");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }else if (pointResult >3.50 && pointResult == 4.00 || pointResult <5.00){
                        textV_g7.setText("A");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }else if (pointResult == 5.00){
                        textV_g7.setText("A+");

                        tv_display.setText("You are a passed\nyour points: " + formattedResult);

                    }

                    



                }else {

                    Toast.makeText(MainActivity.this, "Fill in all the boxes", Toast.LENGTH_SHORT).show();
                    
                }


            }

        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String clr1, clr2, clr3, clr4, clr5, clr6, clr7, clr8, clr9, clr10, clr11, clr12, clr13, clr14, clr15, clr16, clr17, clr18, clr19, clr20,clr21, clr22;

                clr1=edi_m1.getText().toString();
                clr2=edi_m2.getText().toString();
                clr3=edi_m3.getText().toString();
                clr4=edi_m4.getText().toString();
                clr5=edi_m5.getText().toString();
                clr6=edi_m6.getText().toString();
                clr7=textV_p1.getText().toString();
                clr8=textV_p2.getText().toString();
                clr9=textV_p3.getText().toString();
                clr10=textV_p4.getText().toString();
                clr11=textV_p5.getText().toString();
                clr12=textV_p6.getText().toString();
                clr13=textV_p7.getText().toString();
                clr14=textV_g1.getText().toString();
                clr15=textV_g2.getText().toString();
                clr16=textV_g3.getText().toString();
                clr17=textV_g4.getText().toString();
                clr18=textV_g5.getText().toString();
                clr19=textV_g6.getText().toString();
                clr20=textV_g7.getText().toString();
                clr21=textV_m7.getText().toString();
                clr22=tv_display.getText().toString();

                edi_m1.setText("");
                edi_m2.setText("");
                edi_m3.setText("");
                edi_m4.setText("");
                edi_m5.setText("");
                edi_m6.setText("");
                textV_p1.setText("");
                textV_p2.setText("");
                textV_p3.setText("");
                textV_p4.setText("");
                textV_p5.setText("");
                textV_p6.setText("");
                textV_p7.setText("");
                textV_g1.setText("");
                textV_g2.setText("");
                textV_g3.setText("");
                textV_g4.setText("");
                textV_g5.setText("");
                textV_g6.setText("");
                textV_g7.setText("");
                textV_m7.setText("");
                tv_display.setText("");
            }
        });







    }

}