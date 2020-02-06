package com.example.inclassexamples_w20;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        // Week3-Page9
        // Retrieve the Intent object that caused the transition with the function getIntent()​
        Intent dataSent = getIntent();
        String nameSent = dataSent.getStringExtra("name");
        // To get the values that were reserved under names
        int ageSent = dataSent.getIntExtra("age", 0);
        String typed = dataSent.getStringExtra("typed");

        // Week3-Page7
        Button previousButton = findViewById(R.id.previousPageButton);
        previousButton.setOnClickListener(click -> {
            setResult( 123, dataSent);
            finish();
        } );

        //Get a format string:
        String toastMessage = getResources().getString(R.string.toastMessage1);
        //add in the added variables
        String formattedString = String.format(toastMessage, nameSent, ageSent, typed);
        //show the toast
        Toast.makeText(this, formattedString, Toast.LENGTH_LONG);
    }

}
