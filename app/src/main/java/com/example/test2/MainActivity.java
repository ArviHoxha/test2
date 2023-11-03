package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttontest = findViewById(R.id.kataxwrisi);
        TextView textViewtest = findViewById(R.id.texttest);
        EditText onoma = findViewById(R.id.name);

        buttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttest = new Intent(MainActivity.this, deutero.class);
                startActivity(intenttest);

                textViewtest.setText(onoma.getText().toString());


            }
        });


    }
}