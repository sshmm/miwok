package com.example.android.miwok;

import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //String [] words = new String[10];
        /*String [] words = {"one", "two","three","four","five","six","seven","eight","nine","ten"};*/

        //Creating Array of Words
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        TextView[] wordsView = new TextView[10];

        int wordsCount = 0;
        while (wordsCount < 10){
            wordsView[wordsCount] = new TextView(this);
            wordsView[wordsCount].setText(words.get(wordsCount));
            rootView.addView(wordsView[wordsCount]);
            wordsCount++;
        }



    }
}
