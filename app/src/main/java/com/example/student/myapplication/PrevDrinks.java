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

public class PrevDrinks extends Fragment {

    public static PrevDrinks newinstance() {
        PrevDrinks fragment = new PrevDrinks();
        return fragment;
    }
    public PrevDrinks() {
    }

    TextView prevdrinks;
    ImageView prevdrinkspic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_prev_drinks, container, false);

        prevdrinks = (TextView) rootView.findViewById(R.id.prevdrinktext);

        prevdrinkspic = (ImageView) rootView.findViewById(R.id.prevdrinkpic);


        return rootView;
    }

}
