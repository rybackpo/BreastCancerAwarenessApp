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

public class Habits extends Fragment {

    public static Habits newInstance() {
        Habits fragment = new Habits();
        return fragment;
    }
    public Habits() {
    }

    TextView habit  ;
    ImageView habitpic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_habits, container, false);

        habit = (TextView) rootView.findViewById(R.id.habittext);

        habitpic = (ImageView) rootView.findViewById(R.id.habitpic);


        return rootView;
    }
}
