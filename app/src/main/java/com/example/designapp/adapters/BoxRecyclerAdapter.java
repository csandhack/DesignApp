package com.example.designapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.designapp.R;
import com.example.designapp.model.BoxModel;

import java.util.ArrayList;
import java.util.List;

public class BoxRecyclerAdapter extends RecyclerView.Adapter<BoxRecyclerAdapter.MyViewHolder> {
    List<BoxModel> boxModelList;
    Context context;

    public BoxRecyclerAdapter(Context context, ArrayList<BoxModel> data) {
        this.context = context;
        this.boxModelList = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView first;
        public TextView second;
        public ImageView imageView;

        public MyViewHolder(View v) {
            super(v);

            first = v.findViewById(R.id.tv_first_row_recycler_view_box);
            second = v.findViewById(R.id.tv_second_row_recycler_view_box);
            imageView = v.findViewById(R.id.box_image_view_row_recycler_view_box);

        }
    }

    @Override
    public BoxRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler_view_box, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        BoxModel all = boxModelList.get(position);
        holder.first.setText(all.getFirst());
        holder.second.setText(all.getSecond());
        holder.imageView.setImageResource(all.getImage());
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                final Intent intent;
                if (position == 0){
                    intent =  new Intent(context, ShowDetails.class);
                } else if (position == 1){
                    intent =  new Intent(context, AllDetails.class);
                } else {
                    intent =  new Intent(context, RecentDetails.class);
                }
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return boxModelList.size();
    }
}
