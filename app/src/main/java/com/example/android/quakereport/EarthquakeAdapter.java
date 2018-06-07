package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthQuake=getItem(position);
        TextView magnitudeView=ListItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getmMagnitude());
        TextView locationView=ListItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getmLocation());
        TextView dateView=ListItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getmDate());
return ListItemView;
    }


}
