package com.example.mda;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrainingRvAdapter extends RecyclerView.Adapter<TrainingRvAdapter.RvViewHolder>{

    private ArrayList<RvModel> items;
    int row_index=-1;
    Context context;

    public TrainingRvAdapter(Context context,ArrayList<RvModel> items) {
        this.context=context;
        this.items = items;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rvitems,parent,false);
        RvViewHolder rvViewHolder=new RvViewHolder(v);
        return rvViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, final int position) {
        RvModel currentItem=items.get(position);
        holder.rvimage.setImageResource(currentItem.getImage());
        holder.rvtextView.setText(currentItem.getText());
        holder.rvnext.setImageResource(currentItem.getNext());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index=position;
                if(row_index==0)
                    context.startActivity(new Intent(context,TrainingGoogleAds.class));
                else if(row_index==2)
                    context.startActivity(new Intent(context,TrainingPayPerClick.class));
                notifyDataSetChanged();

            }

        });
        if(row_index==position){
            holder.relativeLayout.setBackgroundResource(R.drawable.rvselectedbg);
        }
        else
        {
            holder.relativeLayout.setBackgroundResource(R.drawable.rvbackground);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RvViewHolder extends RecyclerView.ViewHolder{
        TextView rvtextView;
        ImageView rvimage,rvnext;
        RelativeLayout relativeLayout;

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            rvtextView=itemView.findViewById(R.id.rvtext);
            rvimage=itemView.findViewById(R.id.rvimage);
            rvnext=itemView.findViewById(R.id.rvnext);
            relativeLayout=itemView.findViewById(R.id.relativelayoutid);
        }
    }

}
