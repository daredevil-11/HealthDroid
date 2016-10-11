package com.example.android.healthdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SingleAidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_aid);

        TextView head = (TextView) findViewById(R.id.id);
        TextView body = (TextView) findViewById(R.id.desc);
        Intent i = getIntent();
        // getting attached intent data
        ArrayList<CharSequence> alst = i.getCharSequenceArrayListExtra("al");
        // displaying selected product name
        head.setText(alst.get(0));
        body.setText(alst.get(1));
    }
}
