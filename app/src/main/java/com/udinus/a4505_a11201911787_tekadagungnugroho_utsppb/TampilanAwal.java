package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
    }

    public void pencet(View view) {
        Intent i = new Intent(TampilanAwal.this, OrderProduk.class);
        startActivity(i);
    }

    public void pencet1(View view) {
        Intent i = new Intent(TampilanAwal.this, ActionFigure.class);
        startActivity(i);
    }
}