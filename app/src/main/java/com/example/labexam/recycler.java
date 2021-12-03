package com.example.labexam;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class recycler extends RecyclerView.ViewHolder {

    ImageView Image;
    View view;

    recycler(View itemView) {

        super(itemView);
        Image = (ImageView)itemView
                .findViewById(R.id.image_view_recycler);

        view  = itemView;
    }
}