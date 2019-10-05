package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstnumber=findViewById(R.id.number1);
        final EditText secondnumber=findViewById(R.id.number2);
        final EditText thirdnumber=findViewById(R.id.number3);


        int nb1,nb2,nb3;
        nb1=Integer.parseInt(firstnumber.getText().toString());
        nb2=Integer.parseInt(secondnumber.getText().toString());
        nb3=Integer.parseInt(thirdnumber.getText().toString());
        final int s=nb1+nb2+nb3;
        final int p=nb1*nb2*nb3;

        final String sum=Integer.toString(s);
        final String product=Integer.toString(p);

        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(MainActivity.this,secondpage.class);
                 getIntent().putExtra("sum" ,"s");
                getIntent().putExtra("product" ,"p");
                startActivity(i);




            }

        });


    }
}
