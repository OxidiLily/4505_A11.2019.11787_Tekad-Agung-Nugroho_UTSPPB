package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class OrderProduk extends AppCompatActivity{

    EditText name,no_Hp,alamats,emails;
    Button btnorder;
    
    private String KEY_NAME = "NAMA";
    private String KEY_HP = "HP";
    private String KEY_ALAMAT = "ALAMAT";
    private String KEY_EMAIL = "EMAIL";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_produk);


        name = (EditText) findViewById(R.id.edt_txt_nama);
        no_Hp = (EditText)  findViewById(R.id.edt_txt_hp);
        alamats = (EditText) findViewById(R.id.edt_txt_alamat);
        emails = (EditText) findViewById(R.id.edt_email);
        btnorder = (Button) findViewById(R.id.send);
        
        btnorder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama = name.getText().toString();
                String Hp = no_Hp.getText().toString();
                String alamat = alamats.getText().toString();
                String email = emails.getText().toString();

                if (TextUtils.isEmpty(name.getText().toString().trim())
                        &&
                        TextUtils.isEmpty(no_Hp.getText().toString().trim())
                        &&
                        TextUtils.isEmpty(alamats.getText().toString().trim())
                        &&
                        TextUtils.isEmpty(emails.getText().toString().trim())){
                    name.setError(getString(R.string.email_pass_nama_Kosong));
                    no_Hp.setError(getString(R.string.email_pass_nama_Kosong));
                    alamats.setError(getString(R.string.email_pass_nama_Kosong));
                    emails.setError(getString(R.string.email_pass_nama_Kosong));
                }
                else if (!isValidEmail(emails.getText().toString().trim())){
                    emails.setError(getString(R.string.Email_tidakValid));
                }
                else{
                Intent i = new Intent(OrderProduk.this, OrderSukses.class);
                i.putExtra(KEY_NAME, nama);
                i.putExtra(KEY_HP, Hp);
                i.putExtra(KEY_ALAMAT, alamat);
                i.putExtra(KEY_EMAIL, email);

                startActivity(i);
                }

            }

        });
    }
    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}