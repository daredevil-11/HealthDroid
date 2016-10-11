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

public class PolicyActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        listView = (ListView) findViewById(R.id.list_policy);
        final ArrayList<Policy> arrayOfPolicy = Policy.getPolicy();

        PolicyAdapter adapter = new PolicyAdapter(this,arrayOfPolicy);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                Policy policy = arrayOfPolicy.get(position);
                                                ArrayList<CharSequence> al = new ArrayList<CharSequence>();
                                                al.add(policy.head); al.add("INFORMATION\n" + policy.info); al.add("OBJECTIVE\n"+policy.obj);
                                                al.add(policy.img); al.add(policy.link);
                                                Intent intent = new Intent(PolicyActivity.this, SinglePolicyActivity.class);
                                                intent.putCharSequenceArrayListExtra("al", al);
                                                startActivity(intent);
                                            }
                                        }
        );
    }

}