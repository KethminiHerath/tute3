package com.example.intensproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView number1,number2,answer;
    String String1, String2;
    int Number1, Number2,Number3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1=(TextView) findViewById(R.id.editTextNumber3);
        number2=(TextView) findViewById(R.id.editTextNumber4);
        answer =(TextView) findViewById(R.id.textanswer);

        number1.setText(getIntent().getStringExtra("number1"));
        number2.setText(getIntent().getStringExtra("number2"));

        String1 = number1.getText().toString();
        String2 = number2.getText().toString();

        Number1 = Integer.parseInt(String1);
        Number2 = Integer.parseInt(String2);

        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button);
        Button button3 = (Button) findViewById(R.id.button);
        Button button4 = (Button) findViewById(R.id.button);


        button1.setOnClickListener(new View.onClickListner){

            public void onClick(View view){
                Number3 = number1 + number2;
                answer.setText(Number1+"+"+ number2+"=" +number3);



            }

        }



    }
}