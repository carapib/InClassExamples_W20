package com.example.inclassexamples_w20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class PrebuiltIntentExamples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prebuilt_intent_examples);

        //This shows how to use Android's default email app to send an email:
        Button temp = findViewById(R.id.sendEmailExample);
        temp.setOnClickListener(click ->{
            // Week3-Page15 Default Intent ACTION that opens the Email app that is currently responsible for ACTION_SEND
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"email@example.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject here");
            intent.putExtra(Intent.EXTRA_TEXT, "body text");
            startActivity(intent);

        });

        //This shows how to use Android's default web view app to view a web page:
        temp = findViewById(R.id.viewURL);
        temp.setOnClickListener( click -> {

            String url = "http://www.algonquincollege.com";
            // Week3-Page14 - You can use these to see what the default Activity on your phone for an Intent
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData( Uri.parse(url) );
            startActivity(i);

        });
    }
}
