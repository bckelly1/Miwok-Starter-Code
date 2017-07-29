package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Brian on 6/25/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int color;

    public WordAdapter(Activity context, ArrayList<Word> words, int category_color) {
        super(context, 0, words);

        this.color = category_color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word word = getItem(position);

        RelativeLayout textLayout = (RelativeLayout) listItemView.findViewById(R.id.wordViewId);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_word);
        defaultTextView.setText(word.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(word.hasImage()){
            imageView.setImageResource(word.getImagePath());

            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        int newColor = ContextCompat.getColor(getContext(), color);
        // Set the background color of the text container View
        textLayout.setBackgroundColor(newColor);

        return listItemView;
    }
}
