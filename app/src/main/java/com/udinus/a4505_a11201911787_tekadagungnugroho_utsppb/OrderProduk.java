package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class OrderProduk extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_produk);

    }

    public void clickorder(View view) {
        Intent i = new Intent(OrderProduk.this, OrderSukses.class);
        startActivity(i);
    }
}