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
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.family_father, R.string.ndls_family_father,
                R.drawable.family_father));
        words.add(new Word(R.string.family_mother, R.string.ndls_family_mother,
                R.drawable.family_mother));
        words.add(new Word(R.string.family_son, R.string.ndls_family_son,
                R.drawable.family_son));
        words.add(new Word(R.string.family_daughter, R.string.ndls_family_daughter,
                R.drawable.family_daughter));
        words.add(new Word(R.string.family_older_brother, R.string.ndls_family_older_brother,
                R.drawable.family_older_brother));
        words.add(new Word(R.string.family_younger_brother, R.string.ndls_family_younger_brother,
                R.drawable.family_younger_brother));
        words.add(new Word(R.string.family_older_sister, R.string.ndls_family_older_sister,
                R.drawable.family_older_sister));
        words.add(new Word(R.string.family_younger_sister, R.string.ndls_family_younger_sister,
                R.drawable.family_younger_sister));
        words.add(new Word(R.string.family_grandmother, R.string.ndls_family_grandmother,
                R.drawable.family_grandmother));
        words.add(new Word(R.string.family_grandfather, R.string.ndls_family_grandfather,
                R.drawable.family_grandfather));

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

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
