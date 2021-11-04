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
                new FigureList("Yuji Itadori", " Jujutsu Kaisen",R.drawable.yuji_itadori_jujutsu_kaisen),
                new FigureList("Roxy Migurdia", "Mushoku Tensei",R.drawable.roxy_migurdia_mushoku_tensei),
                new FigureList("Kaga", "Azurlane",R.drawable.figure_kaga_azur_lane),
                new FigureList("Todoroki Shoto", " Boku no Hero Academia",R.drawable.todoroki_shoto_boku_no_hero_academia),
                new FigureList("Nagato", " Kantai Collection",R.drawable.nagato_kantai_collection),
                new FigureList("Akagi", "Azurlane" ,R.drawable.akagi_azur_lane),
                new FigureList("PVC Figure 1/7 Kirito - Sword Art Online", "Sword Art Online",R.drawable.kirito_sword_art_online),
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