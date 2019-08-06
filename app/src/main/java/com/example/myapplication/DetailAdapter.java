package com.example.myapplication;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

class DetailAdapter extends ArrayAdapter<Detail> {
    public DetailAdapter(ArrayList<Detail> detail, Context c) {
        super(c, 0, detail);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Detail currentPosition = getItem(position);
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_detail, parent, false);
        }
        TextView subjectName = (TextView) listView.findViewById(R.id.subjectName);
        TextView progress = (TextView) listView.findViewById(R.id.progress);
        //ImageView image = (ImageView) listView.findViewById(R.id.iconImage);
        subjectName.setText(currentPosition.getmSubject());
        progress.setText(String.valueOf(currentPosition.getmProgress())+String.valueOf("%"));

        return listView;
    }

}
