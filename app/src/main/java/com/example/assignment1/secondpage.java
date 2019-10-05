package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        final TextView textsum=findViewById(R.id.sumnb);
        final TextView textproduct=findViewById(R.id.productnb);
        Intent l=getIntent();
        String text1=l.getStringExtra("s");
        textsum.setText(text1);
        String text2=l.getStringExtra("p");
        textproduct.setText(text2);


        Button bk=findViewById(R.id.button2);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent= new Intent(secondpage.this,MainActivity.class);

                startActivity(intent);



            }
        });

    }
}
