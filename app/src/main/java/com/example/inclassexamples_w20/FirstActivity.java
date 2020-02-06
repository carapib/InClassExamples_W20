package com.example.inclassexamples_w20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView loads objects onto the screen.
        // Before this function, the screen is empty.
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.inputText);
        Button secondButton = findViewById(R.id.buttonToSecond);

        //Week3-Page6, Page8 Specifies the page where you are, and then what page you want to go to
        Intent nextPage = new Intent(this, SecondActivity.class);
            nextPage.putExtra("name", "Eric");
            nextPage.putExtra("age", 20);
            nextPage.putExtra("typed", editText.getText().toString());
        // Starting another activity

        //Send the table to SecondActivity:
        secondButton.setOnClickListener( click -> startActivity( nextPage ));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //
        super.onActivityResult(requestCode, resultCode, data);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    private void saveSharedPrefs(String stringToSave)
    {
        // Week 3, Page20 - SharedPreferences provides an interface for saving data to a file on your device.
        SharedPreferences prefs = getSharedPreferences("FileName", Context.MODE_PRIVATE);
        // Week 3, Page 21 - From the sharedPreferences object, you must get the Editor object
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("TypedText", stringToSave);
        // Week 3, Page 21 - You must call commit() when all your values have been set to save them to the file
        editor.commit();
    }
}
