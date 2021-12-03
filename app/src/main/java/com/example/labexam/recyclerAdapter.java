package com.example.labexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class recyclerAdapter<index> extends RecyclerView.Adapter<recycler> {
    List<recycler> list
            = Collections.emptyList();

    Context context;


    public recyclerAdapter(List<recycler> list,
                                Context context)
    {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public recycler onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.custom_card,
                        parent, false);

        recycler viewHolder
                = new recycler(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycler recycler, int i) {
        final index = recycler.getAdapterPosition();
        recycler.Image
                .setImageResource(list.get(i).Image);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
