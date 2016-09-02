package com.knackter.galaxy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.knackter.galaxy.R;
import com.knackter.galaxy.model.ModelInfo;

import java.util.ArrayList;

/**
 * Created by MAHESH on 28-Aug-16.
 */

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    Context context;
    ArrayList<ModelInfo> data;
    LayoutInflater inflater;

    public MyCustomAdapter(Context context, ArrayList<ModelInfo> data) {
        this.context = context;
        this.data = data;
        this.inflater= LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position) {

        View view  = inflater.inflate(R.layout.list_item_row,parent,false);

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {

        myViewHolder.textview.setText(data.get(position).title);
        myViewHolder.imageview.setImageResource(data.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textview;
        ImageView imageview;

        public MyViewHolder(View itemView) {
            super(itemView);

            textview = (TextView) itemView.findViewById(R.id.text_row);
            imageview = (ImageView) itemView.findViewById(R.id.img_row);
        }
    }
}


