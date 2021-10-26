package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CaraMasuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_masuk);
    }

    public void clickLoginEmail(View view) {
        Intent i = new Intent(CaraMasuk.this, LoginEmail.class);
        startActivity(i);
    }

    public void clickSignUp(View view) {
        Intent i = new Intent(CaraMasuk.this, DaftarEmail.class);
        startActivity(i);
    }
}