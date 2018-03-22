package com.coba.ginanjar_1202150068_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Mengatur agar bisa tampil fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //mengatur splashscreen sehingga nanti setelah 3 detik pindah ke main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //mengatur intent SplashScreen ke Main Activity
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                //menampilkan toast
                Toast.makeText(SplashScreen.this, "GINANJAR_1202150068", Toast.LENGTH_LONG).show();

                this.finish();
            }

            private void finish() {

            }
            },
                //mengatur time out dari splash screen
                0);
    }
}
