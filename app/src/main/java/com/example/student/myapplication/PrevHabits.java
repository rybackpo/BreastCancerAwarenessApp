package com.example.student.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PrevHabits extends Fragment {

    public static PrevHabits newinstance() {
        PrevHabits fragment = new PrevHabits();
        return fragment;
    }
    public PrevHabits() {
    }

    TextView prevhabit  ;
    ImageView prevhabitpic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_prev_habits, container, false);

        prevhabit = (TextView) rootView.findViewById(R.id.prevhabittext);

        prevhabitpic = (ImageView) rootView.findViewById(R.id.prevhabitpic);


        return rootView;
    }

}
