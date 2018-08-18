package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words */
    private int mCategoryColorId;

    public WordAdapter(Context context, ArrayList<Word> Words,int CategoryColorId) {
        super(context, 0, Words);
        mCategoryColorId= CategoryColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTranslationView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the current Word object and
        // set this text on the Miwok TextView
        miwokTranslationView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTranslationView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the current Word object and
        // set this text on the default TextView
        defaultTranslationView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.image);

        //check if the current word has an image or not and modify the visibility accordingly
        wordImageView.setVisibility(View.GONE);
        if (currentWord.hasImage()){
            // Get the image resource id from the current Word object
            wordImageView.setImageResource(currentWord.getmImageResourceId());
            //maake sure that the image is visible
            wordImageView.setVisibility(View.VISIBLE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mCategoryColorId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
