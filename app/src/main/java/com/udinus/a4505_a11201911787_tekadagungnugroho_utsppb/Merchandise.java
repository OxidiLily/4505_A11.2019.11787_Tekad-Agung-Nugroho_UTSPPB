package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Merchandise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise);
        MerchandiseList[] myListData = new MerchandiseList[] {
                new MerchandiseList("Acrylic Stand Black Suit Ser. Baji Keisuke", "Tokyo Revengers",R.drawable.tokyo_revengers_acrylic_stand_black_suit_ser_baji_keisuke),
                new MerchandiseList("InuYasha Big Acrylic Stand Sesshomaru", "InuYasha",R.drawable.inuyasha_big_acrylic_stand_sesshomaru),
                new MerchandiseList("BanG Dream! Girls Band Party!☆PICO Collectible Pins Vol. 1", "BanG Dream! Girls Band Party!",R.drawable.bang_dream_girls_band_party_pico_collectible_pins),
                new MerchandiseList("Tokai Teio Line Art 1 Pocket Pass Case", "Uma Musume Pretty Derby",R.drawable.uma_musume_pretty_derby_tokai_teio_line_art_pocket_pass_case),
                new MerchandiseList("86 -Eighty Six- Rubber Mat Vladilena Milize", "86 -Eighty Six- ",R.drawable.eighty_six_rubber_mat),
                new MerchandiseList("[Set of 10] Love Live! Superstar!! Trading Visual Sheet Liella! Vol.2", "Love Live!",R.drawable.love_live_superstar_trading_visual_sheet_liella),
                new MerchandiseList("Camelot- Weapon Key Chain Lion King", "Fate/Grand Order",R.drawable.fategrand_order_divine_realm_of_the_round_table_camelot_weapon_key_chain_lion_king),
                new MerchandiseList("Kudo Shinichi- Whole Body Extra Large Tapestry Vol. 6", "Detective Conan",R.drawable.detective_conan_whole_body_extra_large_tapestry_kudo_shinichi),
                new MerchandiseList("Otsuka Pharmaceutical Energen Squeeze Bottle 1000ml", "Haikyuu!!",R.drawable.otsuka_pharmaceutical_energen_squeeze_bottle),
                new MerchandiseList("Yurucamp tente Collaboration Tissue Box Cover Biker Ver.", "Yurucamp",R.drawable.yurucamp_collaboration_tissue_box_cover_biker_ver),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.daftarMerchandise);
        AdapterMerchandise adapter = new AdapterMerchandise(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void clickOrder(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, OrderProduk.class);
        context.startActivity(intent);
    }
}
