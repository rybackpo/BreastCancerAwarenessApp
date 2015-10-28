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

public class PrevEnvironment extends Fragment {

    public static PrevEnvironment newinstance() {
        PrevEnvironment fragment = new PrevEnvironment();
        return fragment;
    }
    public PrevEnvironment() {
    }

    TextView prevenvironment;
    ImageView prevenvironmentpic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_prev_environment, container, false);

        prevenvironment = (TextView) rootView.findViewById(R.id.prevenvironmenttext);

        prevenvironmentpic = (ImageView) rootView.findViewById(R.id.prevenvrionmentpic);


        return rootView;
    }

}
