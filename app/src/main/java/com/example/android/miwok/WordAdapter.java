package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 6/1/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mBackGroundColor;

    public WordAdapter(Context context, ArrayList<Word> words,int backGroundColor) {
        super(context,0,words);
        mBackGroundColor = backGroundColor;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defautlTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defautlTextView.setText(currentWord.getDefautlTranslation());

        TextView vietTextView = (TextView) listItemView.findViewById(R.id.viet_text_view);

        vietTextView.setText(currentWord.getVietTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.ic_launcher);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        /*set color for background each listview*/
        View textCointainer = listItemView.findViewById(R.id.linear_layout_background);

        int color = ContextCompat.getColor(getContext(), mBackGroundColor);

        textCointainer.setBackgroundColor(color);

        /*set audio for each listview*/


        return listItemView;
    }
}
