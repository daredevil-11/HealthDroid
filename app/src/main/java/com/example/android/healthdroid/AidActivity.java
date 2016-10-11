package com.example.android.healthdroid;

import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AidActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid);

        listView = (ListView) findViewById(R.id.list_aid);
        final ArrayList<Aid> arrayOfAid = Aid.getAid();

        AidAdapter adapter = new AidAdapter(this,arrayOfAid);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Aid aid = arrayOfAid.get(position);
                ArrayList<CharSequence> al = new ArrayList<CharSequence>();
                al.add(aid.head); al.add(aid.data);
                Intent intent = new Intent(AidActivity.this, SingleAidActivity.class);
                intent.putCharSequenceArrayListExtra("al", al);
                startActivity(intent);
                }
            }
        );
    }

}