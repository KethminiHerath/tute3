package com.example.intensproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button button;
    String mystring = "Sending Data";
    protected EditText editText1, editText2;
    private View.OnClickListener view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById((R.id.button));
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);

        button.setOnClickListener((view));

            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("number1", number1);
            intent.putExtra("number2", number2);

            Toast toast = Toast.makeText(getApplicationContext(), mystring, Toast.LENGTH_LONG);
            toast.show();
            startActivity(intent);




    }
}