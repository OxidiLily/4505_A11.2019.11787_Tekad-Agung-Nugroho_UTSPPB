package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DaftarEmail extends AppCompatActivity {
    // Deklarasi variabel editTextEmail dengan tipe EditText
    EditText editTextEmail;

    // Deklarasi variabel editTextPassword dengan tipe EditText
    EditText editTextPassword;

    // Deklarasi variabel editTextName dengan tipe EditText
    EditText editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_email);

        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_txt_email);

        // Binding edt_txt_password ke variabel editTextPassword
        editTextPassword = findViewById(R.id.edt_txt_password);

        // Binding edt_txt_password ke variabel editTextName
        editTextName = findViewById(R.id.edt_txt_name);
    }

    public void clickCreate(View view) {
        int PasswordMaxLength = 15;

        // Validasi input email, password dan nama bila  kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextName.getText().toString().trim()))
        {
            editTextEmail.setError(getString(R.string.email_pass_nama_Kosong));
            editTextPassword.setError(getString(R.string.email_pass_nama_Kosong));
            editTextName.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            editTextPassword.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if (TextUtils.isEmpty(editTextName.getText().toString().trim())){
            editTextName.setError(getString(R.string.email_pass_nama_Kosong));
        }
        // Validasi inputan tipe email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.Email_tidakValid));
        }
        else if ( editTextPassword.length() > PasswordMaxLength) {
            editTextPassword.setError(getString(R.string.maximum_password));
        }

        else {
            Intent i = new Intent(DaftarEmail.this, LoginEmail.class);
            startActivity(i);
            Toast.makeText(view.getContext(),"Daftar Berhasil",Toast.LENGTH_LONG).show();
        }

    }
    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public void clickLoginEmail(View view) {
        Intent i = new Intent(DaftarEmail.this, LoginEmail.class);
        startActivity(i);

    }
}