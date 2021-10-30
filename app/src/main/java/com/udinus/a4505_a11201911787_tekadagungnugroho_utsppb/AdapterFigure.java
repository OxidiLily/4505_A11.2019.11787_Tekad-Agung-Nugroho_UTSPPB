package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterFigure extends RecyclerView.Adapter<AdapterFigure.ViewHolder> {
    private  FigureList[] listfigure;

    public AdapterFigure( FigureList[] listfigure) {
        this.listfigure= listfigure;
    }

    @NonNull
    @Override
    public AdapterFigure.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.activity_tampilan_shop, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText(listfigure[position].getNamaFigure());
        holder.textView2.setText(listfigure[position].getDeskripsiFigure());
        holder.imageButton.setImageResource(listfigure[position].getGambarFigure());
        }



    @Override
    public int getItemCount() {
        return listfigure.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageButton imageButton;
        public TextView textView1,textView2;
        public Button a;
        public FrameLayout frameLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageButton = (ImageButton) itemView.findViewById(R.id.gambarFigure);
            this.textView1= (TextView) itemView.findViewById(R.id.namaFigure);
            this.textView2= (TextView) itemView.findViewById(R.id.keteranganFigure);
            frameLayout = (FrameLayout) itemView.findViewById(R.id.figureAdapter);
            a           = (Button) itemView.findViewById(R.id.tombol);
        }
    }
    
}
