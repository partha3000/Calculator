    package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView1, textView2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnplus, btnequls, btnmulti, btndivide, btnpar, btnback, btnc, btndot, btnminus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find By ID
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnplus = findViewById(R.id.btn_plus);
        btnminus = findViewById(R.id.btn_minus);
        btnpar = findViewById(R.id.btn_par);
        btnback = findViewById(R.id.btn_back);
        btndivide = findViewById(R.id.btn_divied);
        btnc = findViewById(R.id.btn_c);
        btndot = findViewById(R.id.btn_dot);
        btnmulti = findViewById(R.id.btn_multi);
        btnequls = findViewById(R.id.btn_equls);


        //OnClickListener
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnback.setOnClickListener(this);
        btnpar.setOnClickListener(this);
        btnequls.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
                textView2.setText(textView2.getText() + "0");
                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_1:
                textView2.setText(textView2.getText() + "1");
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_2:
                textView2.setText(textView2.getText() + "2");
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_3:
                textView2.setText(textView2.getText() + "3");
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_4:
                textView2.setText(textView2.getText() + "4");
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_5:
                textView2.setText(textView2.getText() + "5");
                Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_6:
                textView2.setText(textView2.getText() + "6");
                Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_7:
                textView2.setText(textView2.getText() + "7");
                Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_8:
                textView2.setText(textView2.getText() + "8");
                Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_9:
                textView2.setText(textView2.getText() + "9");
                Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_plus:
                textView2.setText(textView2.getText() + "+");
                Toast.makeText(MainActivity.this, "Plus", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_minus:
                textView2.setText(textView2.getText() + "-");
                Toast.makeText(MainActivity.this, "Minus", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_divied:
                textView2.setText(textView2.getText() + "÷");
                Toast.makeText(MainActivity.this, "Divied", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_multi:
                textView2.setText(textView2.getText() + "×");
                Toast.makeText(MainActivity.this, "Multi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_dot:
                textView2.setText(textView2.getText() + ".");
                Toast.makeText(MainActivity.this, "Dot", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_c:
                textView2.setText("");
                textView1.setText("");
                Toast.makeText(MainActivity.this, "C", Toast.LENGTH_SHORT).show();
                break;

            //if (textView2 !=null){
            // String val = textView2.getText().toString();
            //  val=val.substring(0,val.length()-1);
            // textView2.setText("");
            //  }if(textView2 !=null){
            //   Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            // }

            case R.id.btn_par:
                Toast.makeText(MainActivity.this, "par", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_equls:
                Toast.makeText(MainActivity.this, "Equls", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_back:

                String val = textView2.getText().toString();
                if (val.length() >= 1) {
                    val = val.substring(val.length() - 1,0);
                    textView2.setText(val);
                } else if (val.length() <= 1) {
                    textView2.setText("");
                    break;

                }
        }
       // btnback.setOnClickListener(new View.OnClickListener() {
         //   @Override
       //     public void onClick(View v) {


              //  if (v.getId()==R.id.btn_back){
             //       String val = textView2.getText().toString();
             //       val=val.substring(0,val.length()-1);
               //     textView2.setText(val);
             //   }
               // else if(v.getId()==R.id.btn_back){
                   // textView2.setText("0");
                   // textView1.setText("");
                   // Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
              //  }
          //  }
    //    });

    }
}