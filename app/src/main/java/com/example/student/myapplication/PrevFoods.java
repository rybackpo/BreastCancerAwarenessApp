package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PrevFoods extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PrevFoods newInstance(int sectionNumber) {
        PrevFoods fragment = new PrevFoods();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PrevFoods() {
    }

    ImageView prevfoodpic;
    TextView prevfood;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_prev_foods, container, false);

        prevfood = (TextView) rootView.findViewById(R.id.prevfoodtext);

        prevfoodpic = (ImageView) rootView.findViewById(R.id.prevfoodpic);
        return rootView;
    }

}
