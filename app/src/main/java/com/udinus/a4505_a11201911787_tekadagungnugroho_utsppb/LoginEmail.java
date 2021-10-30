package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginEmail extends AppCompatActivity {
    // Deklarasi variabel editTextEmail dengan tipe EditText
    EditText editTextEmail;

    // Deklarasi variabel editTextPassword dengan tipe EditText
    EditText editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_email);


        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_txt_email);

        // Binding edt_txt_password ke variabel editTextPassword
        editTextPassword = findViewById(R.id.edt_txt_password);

    }

    public void clickForgot(View view) {
        Intent i = new Intent(LoginEmail.this, ForgotPassword.class);
        startActivity(i);
    }

    public void clickLoginEmail(View view) {
        int PasswordMaxLength = 15;

        // Validasi input email dan password kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.email_pass_nama_Kosong));
            editTextPassword.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            editTextPassword.setError(getString(R.string.email_pass_nama_Kosong));
        }
        // Validasi inputan tipe email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.Email_tidakValid));
        }
        else if ( editTextPassword.length() > PasswordMaxLength) {
            editTextPassword.setError(getString(R.string.maximum_password));
        }
        else {
            Intent i = new Intent(LoginEmail.this, TampilanAwal.class);
            startActivity(i);
        }

    }
    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }


    public void clickSignUp(View view) {
        Intent i = new Intent(LoginEmail.this, DaftarEmail.class);
        startActivity(i);
    }
}