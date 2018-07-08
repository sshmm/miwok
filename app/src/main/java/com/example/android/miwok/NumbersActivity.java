package com.example.android.miwok;

import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

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

        //Find the root view of the Layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Keep looping until we've reached the end of the list
        for (int wordsCount = 0; wordsCount < 10; wordsCount++){
            // Create a new TextView
            TextView wordsView = new TextView(this);

            // Set the text to be word at the current index
            wordsView.setText(words.get(wordsCount));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordsView);
        }



    }
}
