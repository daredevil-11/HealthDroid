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

public class DiseaseActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        listView = (ListView) findViewById(R.id.list_disease);
        final ArrayList<Disease> arrayOfdis = Disease.getDisease();

        DiseaseAdapter adapter = new DiseaseAdapter(this,arrayOfdis);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                Disease disease = arrayOfdis.get(position);
                                                ArrayList<CharSequence> al = new ArrayList<CharSequence>();
                                                al.add(disease.head); al.add("SYMPTOMS\n" + disease.symptoms); al.add("CAUSES\n"+disease.causes);
                                                al.add("TREATMENT\n"+disease.treat); al.add("PREVENTION\n"+disease.prevent);
                                                Intent intent = new Intent(DiseaseActivity.this, SingleDiseaseActivity.class);
                                                intent.putCharSequenceArrayListExtra("al", al);
                                                startActivity(intent);
                                            }
                                        }
        );
    }

}