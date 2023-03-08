package com.example.posterapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<ItemModel> dataItem;
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textjudul;
        TextView textTahun;
        ImageView posterFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textjudul = itemView.findViewById(R.id.text_judul);
            textTahun = itemView.findViewById(R.id.text_tahun);
            posterFilm = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRecyclerView(ArrayList<ItemModel> data){
        this.dataItem = data;
    }
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView text_judul = holder.textjudul;
        TextView text_tahun = holder.textTahun;
        ImageView image_poster = holder.posterFilm;

        text_judul.setText(dataItem.get(position).getNama());
        text_tahun.setText(dataItem.get(position).getYear());
        image_poster.setImageResource(dataItem.get(position).getPoster());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
