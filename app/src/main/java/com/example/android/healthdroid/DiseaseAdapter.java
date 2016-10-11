package com.example.android.healthdroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TanmayDas on 01-10-2016.
 */
public class DiseaseAdapter extends ArrayAdapter<Disease> {
    public DiseaseAdapter(Context context, ArrayList<Disease> dis) {
        super(context, 0, dis);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Disease dis = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_disease, parent, false);
        }
        // Lookup view for data population
        TextView head = (TextView) convertView.findViewById(R.id.Head);
        // Populate the data into the template view using the data object
        head.setText(dis.head);
        // Return the completed view to render on screen
        return convertView;
    }
}
