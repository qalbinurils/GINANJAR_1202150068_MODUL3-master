package com.coba.ginanjar_1202150068_modul3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }


    public void Login(View view) {
        //find EditText Username
        EditText username = findViewById(R.id.username);
        //find EditText password
        EditText password = findViewById(R.id.password);

        //check Username and Password
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")) {
            //Intent to MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            //Add Toast
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();
        } else {
            //add toast if login failed
            Toast.makeText(this, "Password dengan Username Tidak sesuai", Toast.LENGTH_LONG).show();
        }
    }
}
