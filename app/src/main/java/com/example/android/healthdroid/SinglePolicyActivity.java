package com.example.android.healthdroid;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SinglePolicyActivity extends AppCompatActivity {

    ArrayList<CharSequence> alst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_policy);

        TextView head = (TextView) findViewById(R.id.head);
        TextView info = (TextView) findViewById(R.id.info);
        TextView obj = (TextView) findViewById(R.id.obj);
        ImageView img  = (ImageView) findViewById(R.id.img);
        Button btn = (Button) findViewById(R.id.btn);
        Intent i = getIntent();
        // getting attached intent data
        alst = i.getCharSequenceArrayListExtra("al");
        // displaying selected product name
        head.setText(alst.get(0));
        info.setText(alst.get(1));
        obj.setText(alst.get(2));
        int resID = getResources().getIdentifier((String) alst.get(3), "drawable", getApplicationContext().getPackageName());
        img.setImageResource(resID);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                selfDestruct(v);
            }
        });

    }

    public void selfDestruct(View v) {
        String url = (String) alst.get(4);
        if (!url.startsWith("http://") && !url.startsWith("https://"))
            url = "http://" + url;
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}
