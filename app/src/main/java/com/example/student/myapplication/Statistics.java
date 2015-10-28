package com.example.student.myapplication;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Statistics extends Fragment {

    public static Statistics newInstance() {
        Statistics fragment = new Statistics();
        return fragment;
    }
    public Statistics() {
    }
    ImageView statisticpic;
    TextView statistic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_statistics, container, false);

        statistic = (TextView) rootView.findViewById(R.id.statistictext);

        statisticpic = (ImageView) rootView.findViewById(R.id.statisticpic);

        return rootView;
    }

}
