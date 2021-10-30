package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActionFigure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_figure);
        FigureList[] myListData = new FigureList[] {
                new FigureList("Albedo", "Overlord",R.drawable.albedo_wing_ver),
                new FigureList("Kaga", "Azurlane",R.drawable.figure_kaga_azur_lane),
                new FigureList("Ganyu", " Genshin Impact",R.drawable.ganyu),
                new FigureList("Nagato", " Kantai Collection",R.drawable.nagato_kantai_collection),
                new FigureList("Akagi", "Azurlane" ,R.drawable.akagi_azur_lane),
                new FigureList("Kirito", "Sword Art Online",R.drawable.kirito_sword_art_online),
                new FigureList("Saber/Altria Pendragon Alter Dress Ver.", " Fate/stay Night",R.drawable.saber_altria_pendragon_alter_dress_ver),
                new FigureList("Naofumi Iwatani", "Tate no Yuusha no Nariagari",R.drawable.naofumi_iwatani_tate_no_yuusha_no_nariagari),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.daftarFigure);
        AdapterFigure adapter = new AdapterFigure(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void clickDes(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, OrderProduk.class);
        context.startActivity(intent);
    }
}