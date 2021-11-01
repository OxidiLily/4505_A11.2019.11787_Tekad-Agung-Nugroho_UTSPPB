package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMerchandise extends RecyclerView.Adapter<AdapterMerchandise.ViewHolder>{
    private  MerchandiseList[] listmerchandise;

    public AdapterMerchandise(MerchandiseList[] listmerchandise) {
        this.listmerchandise = listmerchandise;
    }

    @NonNull
    @Override
    public AdapterMerchandise.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.activity_tampilan_shop2, parent, false);
        AdapterMerchandise.ViewHolder viewHolder = new AdapterMerchandise.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMerchandise.ViewHolder holder, int position) {
        holder.textView1.setText(listmerchandise[position].getNamaMerchandise());
        holder.textView2.setText(listmerchandise[position].getDeskripsiMerchandise());
        holder.imageButton.setImageResource(listmerchandise[position].getGambarMerchandise());
    }

    @Override
    public int getItemCount() {
        return listmerchandise.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageButton imageButton;
        public TextView textView1,textView2;
        public Button a;
        public FrameLayout frameLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageButton = (ImageButton) itemView.findViewById(R.id.gambarMerchandise);
            this.textView1= (TextView) itemView.findViewById(R.id.namaMerchandise);
            this.textView2= (TextView) itemView.findViewById(R.id.keteranganMerchandise);
            frameLayout = (FrameLayout) itemView.findViewById(R.id.merchandiseAdapter);
            a           = (Button) itemView.findViewById(R.id.tombol);
        }

    }
}
