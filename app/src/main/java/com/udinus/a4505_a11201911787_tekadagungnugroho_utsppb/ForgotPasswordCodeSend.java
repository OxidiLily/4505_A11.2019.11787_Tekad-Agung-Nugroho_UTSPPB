package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordCodeSend extends AppCompatActivity {
    EditText editTextCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_code_send);

        editTextCode = findViewById(R.id.edt_txt_code);
    }

    public void clickLSendCode(View view) {
        int PasswordMaxLength = 5;

        if (TextUtils.isEmpty(editTextCode.getText().toString().trim())){
            editTextCode.setError(getString(R.string.email_pass_nama_Kosong));
        }
        else if ( editTextCode.length() > PasswordMaxLength) {
            editTextCode.setError(getString(R.string.maximum_code));
        }
        else{
        Intent i = new Intent(ForgotPasswordCodeSend.this, LoginEmail.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Reset Password Berhasil",Toast.LENGTH_LONG).show();
        }
    }
}