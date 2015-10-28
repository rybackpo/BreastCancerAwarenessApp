package com.example.student.myapplication;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Drinks extends Fragment {

    public static Drinks newInstance() {
        Drinks fragment = new Drinks();
        return fragment;
    }
    public Drinks() {
    }

    TextView drinks;
    ImageView drinkspic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_drinks, container, false);

        drinks = (TextView) rootView.findViewById(R.id.drinktext);

        drinkspic = (ImageView) rootView.findViewById(R.id.drinkpic);


        return rootView;
    }
}
