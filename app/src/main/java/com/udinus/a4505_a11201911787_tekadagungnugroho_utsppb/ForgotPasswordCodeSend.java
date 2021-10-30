package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForgotPasswordCodeSend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_code_send);
    }

    public void clickLSendCode(View view) {
        Intent i = new Intent(ForgotPasswordCodeSend.this, LoginEmail.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Reset Password Berhasil",Toast.LENGTH_LONG).show();
    }
}