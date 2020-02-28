package com.siddharth.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.SocialHolder> {

    private Context context;
    private List<SocialMedia> list;

    public SocialAdapter(Context context, List<SocialMedia> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SocialHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view= LayoutInflater.from(context).inflate(R.layout.recycler,parent,false);
      return new SocialHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialHolder holder, int position) {


        holder.getName().setText(list.get(position).getName());
        holder.getImage().setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class SocialHolder extends  RecyclerView.ViewHolder{
        public SocialHolder(@NonNull View itemView) {
            super(itemView);
        }
        TextView getName(){
            return itemView.findViewById(R.id.card_txt);
        }
        ImageView getImage() {
            return itemView.findViewById(R.id.card_img);
        }
    }
}
