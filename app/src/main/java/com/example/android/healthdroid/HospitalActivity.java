package com.example.android.healthdroid;

import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HospitalActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.hospital_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


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
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.hospital_drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent intent = null;
            Class activityClass = null;
            activityClass = MainActivity.class;
            intent = new Intent(this, activityClass);
            startActivity(intent);
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //Fragment fragment = null;
        //Class fragmentClass = null;
        Intent intent = null;
        Class activityClass = null;

        if(id == R.id.nav_dash){
            activityClass = MainActivity.class;
        }
        else if (id == R.id.nav_remind) {

        } else if (id == R.id.nav_hosp) {

        } else if (id == R.id.nav_first) {
            activityClass = AidActivity.class;

        } else if (id == R.id.nav_disease) {
            activityClass= DiseaseActivity.class;

        } else if (id == R.id.nav_govt) {
            activityClass = PolicyActivity.class;

        } else if (id == R.id.nav_share) {

        }
        else if (id == R.id.nav_about) {

        }



        if(id == R.id.nav_first || id == R.id.nav_disease || id == R.id.nav_govt || id == R.id.nav_dash){
            intent = new Intent(this, activityClass);
            startActivity(intent);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.hospital_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}