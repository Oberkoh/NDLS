/*
 *  Copyright (C) 2020 The National Disaster Logging System (NDLS) Project
 *  This project is a property of Michael Oberkoh and Ruth Yankson
 *  Unless giving explicit permission in writing, this project shouldn't be used whole or in part by a third person.
 */
package com.example.android.ndls;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class AlertsFragment extends Fragment {

    public AlertsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.number_one, R.string.ndls_number_one,
                R.drawable.number_one));
        words.add(new Word(R.string.number_two, R.string.ndls_number_two,
                R.drawable.number_two));
        words.add(new Word(R.string.number_three, R.string.ndls_number_three,
                R.drawable.number_three));
        words.add(new Word(R.string.number_four, R.string.ndls_number_four,
                R.drawable.number_four));
        words.add(new Word(R.string.number_five, R.string.ndls_number_five,
                R.drawable.number_five));
        words.add(new Word(R.string.number_six, R.string.ndls_number_six,
                R.drawable.number_six));
        words.add(new Word(R.string.number_seven, R.string.ndls_number_seven,
                R.drawable.number_seven));
        words.add(new Word(R.string.number_eight, R.string.ndls_number_eight,
                R.drawable.number_eight));
        words.add(new Word(R.string.number_nine, R.string.ndls_number_nine,
                R.drawable.number_nine));
        words.add(new Word(R.string.number_ten, R.string.ndls_number_ten,
                R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
