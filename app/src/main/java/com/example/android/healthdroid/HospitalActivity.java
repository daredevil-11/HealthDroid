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

public class HospitalActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        listView = (ListView) findViewById(R.id.list_hospital);
        final ArrayList<Hospital> arrayOfHospital = Hospital.getHospital();

        HospitalAdapter adapter = new HospitalAdapter(this,arrayOfHospital);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                Hospital hopsi = arrayOfHospital.get(position);
                                                ArrayList<CharSequence> al = new ArrayList<CharSequence>();
                                                al.add(hopsi.head); al.add("ADDRESS\n"+hopsi.address);
                                                al.add("CONTACT\n"+hopsi.contact_info);
                                                al.add(hopsi.img_hos);
                                                al.add(hopsi.link);
                                                Intent intent = new Intent(HospitalActivity.this, SingleHospitalActivity.class);
                                                intent.putCharSequenceArrayListExtra("al", al);
                                                startActivity(intent);
                                            }
                                        }
        );
    }

}