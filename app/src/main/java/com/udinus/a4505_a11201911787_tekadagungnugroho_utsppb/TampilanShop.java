package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_shop);
    }


    public void clickDes(View view) {
        Intent i = new Intent(TampilanShop.this, OrderProduk.class);
        startActivity(i);
    }
}