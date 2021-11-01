package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderSukses extends AppCompatActivity {

    TextView namasukses,hpsukses,alamatsukses,emailsukses ;

    private String nama,hp,alamat,email;

//    key Pemanggilan
    private String KEY_NAME = "NAMA";
    private String KEY_HP = "HP";
    private String KEY_ALAMAT = "ALAMAT";
    private String KEY_EMAIL = "EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_sukses);
//    inialisasi
        namasukses = (TextView) findViewById(R.id.nama_sukses);
        hpsukses = (TextView) findViewById(R.id.hp_sukses);
        alamatsukses = (TextView) findViewById(R.id.alamat_sukses);
        emailsukses = (TextView) findViewById(R.id.email_sukses);

//mengambil data dari input
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        hp = extras.getString(KEY_HP);
        alamat = extras.getString(KEY_ALAMAT);
        email = extras.getString(KEY_EMAIL);

//mencetak dari data input
        namasukses.setText("Nama Pemesan : "+nama);
        hpsukses.setText("Nomor Telepon : "+hp);
        alamatsukses.setText("Alamat Tujuan : "+alamat);
        emailsukses.setText("Email : "+email);
    }

    public void kembali(View view) {
        Intent i = new Intent(OrderSukses.this,TampilanAwal.class);
        startActivity(i);
    }
}
