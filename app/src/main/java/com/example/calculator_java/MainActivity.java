package com.example.calculator_java;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView;
    Button buttonDevide;
    Button buttonMultiply;
    Button buttonMinus;
    Button buttonPlus;
    Button buttonResult;
    Button buttonEmpty;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    long a;
    long b;
    long result;
    String operation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button0 = (Button) findViewById(R.id.btn0);
        buttonDevide = (Button) findViewById(R.id.devide);
        buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonMinus = (Button) findViewById(R.id.minus);
        buttonPlus = (Button) findViewById(R.id.plus);
        buttonResult = (Button) findViewById(R.id.result);
        buttonEmpty = (Button) findViewById(R.id.empty);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonEmpty.setOnClickListener(this::onEmpty);
        buttonDevide.setOnClickListener(this::onDevide);
        buttonMultiply.setOnClickListener(this::onMultiply);
        buttonMinus.setOnClickListener(this::onMinus);
        buttonPlus.setOnClickListener(this::onPlus);
        buttonResult.setOnClickListener(this::onResult);


    }


    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                textView.setText(textView.getText() + "0");
                break;
            case R.id.btn1:
                textView.setText(textView.getText() + "1");
                break;
            case R.id.btn2:
                textView.setText(textView.getText() + "2");
                break;
            case R.id.btn3:
                textView.setText(textView.getText() + "3");
                break;
            case R.id.btn4:
                textView.setText(textView.getText() + "4");
                break;
            case R.id.btn5:
                textView.setText(textView.getText() + "5");
                break;
            case R.id.btn6:
                textView.setText(textView.getText() + "6");
                break;
            case R.id.btn7:
                textView.setText(textView.getText() + "7");
                break;
            case R.id.btn8:
                textView.setText(textView.getText() + "8");
                break;
            case R.id.btn9:
                textView.setText(textView.getText() + "9");
                break;


        }
    }

    public void onPlus(View v) {
        operation = "+";
        a = Long.parseLong(textView.getText().toString());
        textView.setText("");
    }


    void onMinus(View v) {
        operation = "-";
        a = Long.parseLong(textView.getText().toString());
        textView.setText("");
    }

    void onMultiply(View v) {
        operation = "*";
        a = Long.parseLong(textView.getText().toString());
        textView.setText("");
    }

    void onDevide(View v) {
        operation = "/";
        a = Long.parseLong(textView.getText().toString());
        textView.setText("");
    }

    void onResult(View v) {

        b = Long.parseLong(textView.getText().toString());
        switch (operation) {
            case "+":
                result = a + b;
                textView.setText(String.valueOf(result));
                break;
            case "-":
                result = a - b;
                textView.setText(String.valueOf(result));
                break;
            case "*":
                result = a * b;
                textView.setText(String.valueOf(result));
                break;
            case "/":
                result = a / b;
                textView.setText(String.valueOf(result));
                break;
        }

    }

    public void onEmpty(View v) {
        result = 0;
        a = 0;
        b = 0;
        textView.setText("");
    }
}