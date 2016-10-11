package com.example.android.healthdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SingleDiseaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_disease);

        TextView head = (TextView) findViewById(R.id.head);
        TextView sym = (TextView) findViewById(R.id.symptom);
        TextView cause = (TextView) findViewById(R.id.causes);
        TextView treat = (TextView) findViewById(R.id.treat);
        TextView prevent = (TextView) findViewById(R.id.prevent);
        Intent i = getIntent();
        // getting attached intent data
        ArrayList<CharSequence> alst = i.getCharSequenceArrayListExtra("al");
        // displaying selected product name
        head.setText(alst.get(0));
        sym.setText(alst.get(1));
        cause.setText(alst.get(2));
        treat.setText(alst.get(3));
        prevent.setText(alst.get(4));
    }
}
