package com.example.android.healthdroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SingleHospitalActivity extends AppCompatActivity {

    ArrayList<CharSequence> alst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_hospital);

        TextView head = (TextView) findViewById(R.id.head);
        TextView address = (TextView) findViewById(R.id.address);
        TextView contact_info = (TextView) findViewById(R.id.contact_info);
        ImageView img = (ImageView) findViewById(R.id.img);
        Button link = (Button) findViewById(R.id.link);
        Button map = (Button) findViewById(R.id.map);
        Intent i = getIntent();
        // getting attached intent data
        alst = i.getCharSequenceArrayListExtra("al");
        // displaying selected product name
        head.setText(alst.get(0));
        address.setText(alst.get(1));
        contact_info.setText(alst.get(2));
        int resID = getResources().getIdentifier((String) alst.get(3), "drawable", getApplicationContext().getPackageName());
        img.setImageResource(resID);

        link.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                selfDestruct(v);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                selfDestruct2(v);
            }
        });

    }

    public void selfDestruct2(View v) {
        Uri geoLocation = Uri.parse("geo:0,0?").buildUpon()
                .appendQueryParameter("q", alst.get(0)+", "+alst.get(1))
                .build();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void selfDestruct(View v) {
        String url = (String) alst.get(4);
        if (!url.startsWith("http://") && !url.startsWith("https://"))
            url = "http://" + url;
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

}
