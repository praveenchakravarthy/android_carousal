package com.example.demoapplication.screens;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.R;

import java.util.Random;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.myViewHolder> {

    protected Context context;
    protected String[] names;
    protected String color;

    public ColorAdapter(Context context, String[] names, String color){
        this.context = context;
        this.names = names;
        this.color = color;
    }

    @NonNull
    @Override
    public ColorAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_color_changes,
                parent, false);
        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorAdapter.myViewHolder holder, int position) {


        int[] androidColors = context.getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];


        holder.tv_popular_services_item.setText(names[position]);
        holder.layout_popular_services_item.setBackgroundColor(randomAndroidColor);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        protected ConstraintLayout layout_popular_services_item;
        protected TextView tv_popular_services_item;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            layout_popular_services_item = itemView.findViewById(R.id.layout_popular_services_item);
            tv_popular_services_item = itemView.findViewById(R.id.tv_popular_services_item);

        }
    }
}
