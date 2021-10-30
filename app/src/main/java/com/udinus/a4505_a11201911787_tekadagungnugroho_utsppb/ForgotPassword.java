package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {
    // Deklarasi variabel editTextEmail dengan tipe EditText
    EditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_txt_email);
    }

    public void clickLSendCode(View view) {

        // Validasi input email dan password kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.email_pass_nama_Kosong));
        }
        // Validasi inputan tipe email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())){
            editTextEmail.setError(getString(R.string.Email_tidakValid));
        }
        else {
            Intent i = new Intent(ForgotPassword.this, ForgotPasswordCodeSend.class);
            startActivity(i) ;
            Toast.makeText(view.getContext(),"Reset Code Terkirim ",Toast.LENGTH_LONG).show();
        }

    }

    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}