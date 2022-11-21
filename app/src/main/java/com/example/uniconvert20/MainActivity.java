package com.example.uniconvert20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;
private Button button5;
private Button button6;
private Button button9;
private TextView textView1;
private TextView textView2;
private TextView textView3;
private TextView textView4;
private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button9=findViewById(R.id.button9);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        editText1=findViewById(R.id.editText1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button1", Toast.LENGTH_SHORT).show();
                String s=editText1.getText().toString();
                int kg = Integer.parseInt(s);
                double milligram = 1000000 * kg;
                textView4.setText("The corresponding value of KG into Milligram is :" + milligram);
            }
        });
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button2", Toast.LENGTH_SHORT).show();
               String s1=editText1.getText().toString();
               int kg1 = Integer.parseInt(s1);
               double centigram = 100000 * kg1;
               textView4.setText("The corresponding value of KG into Centigram is :" + centigram);
           }
       });
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button3", Toast.LENGTH_SHORT).show();
               String s2=editText1.getText().toString();
               int kg2 = Integer.parseInt(s2);
               double decigram = 10000 * kg2;
               textView4.setText("The corresponding value of KG into decigram is :" + decigram);
           }
       });
       button4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button4", Toast.LENGTH_SHORT).show();
               String s3=editText1.getText().toString();
               int kg3 = Integer.parseInt(s3);
               double garm = 1000 * kg3;
               textView4.setText("The corresponding value of KG into gram is :" + garm);
           }
       });
       button5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button5", Toast.LENGTH_SHORT).show();
               String s4=editText1.getText().toString();
               int kg4 = Integer.parseInt(s4);
               double decagarm = 100 * kg4;
               textView4.setText("The corresponding value of KG into decagram is :" + decagarm);
           }
       });
       button6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button6", Toast.LENGTH_SHORT).show();
               String s5=editText1.getText().toString();
               int kg5 = Integer.parseInt(s5);
               double hectogarm = 10 * kg5;
               textView4.setText("The corresponding value of KG into hectogram is :" + hectogarm);
           }
       });
       button9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello, your on click listner methood worked for button7", Toast.LENGTH_SHORT).show();
               String s6=editText1.getText().toString();
               int kg6 = Integer.parseInt(s6);
               double pound = 2.205* kg6;
               textView4.setText("The corresponding value of KG into Pound is :" + pound);
           }
       });

    }
}