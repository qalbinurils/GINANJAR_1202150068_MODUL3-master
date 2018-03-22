package com.coba.ginanjar_1202150068_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView fotoProduct, battery;
    TextView title, description, ukuran;
    int levelCurrent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //find Intent from Main Activity
        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("title");
        String mDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        int mFoto = intent.getIntExtra("foto", 0);

        //find TextView then set title to view
        title = findViewById(R.id.titleDetail);
        title.setText(mTitle);

        //find TextView then set description to view
        description = findViewById(R.id.descriptionDetail);
        description.setText(mDescription);

        //find ImageVIew then set foto to view
        fotoProduct = findViewById(R.id.imageDetail);
        fotoProduct.setImageResource(mFoto);

        //find view liter
        ukuran = findViewById(R.id.liter);
        //find view battery
        battery = findViewById(R.id.battery);
        //find levelCurrent Battery
        levelCurrent = battery.getDrawable().getLevel();

    }

    //method yang akan dieksekusi ketika button minus di klik
    public void minus(View view) {
        levelCurrent = battery.getDrawable().getLevel();
        if (levelCurrent - 1 >= 0) {
            //set text view dengan ukuran yang didapatkan - 1
            ukuran.setText((levelCurrent - 1) + "L");
            //Set Image Battery
            battery.setImageLevel(levelCurrent - 1);
        } else {
            //minimum levelCurrent
            levelCurrent = 0;
            //maka akan muncul toast yang memberi tahu bahwa air sedikit
            Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
        }
    }

    //method yang akan dieksekusi ketika button plus di klik
    public void plus(View view) {
        levelCurrent = battery.getDrawable().getLevel();
        if (levelCurrent + 1 <= 6) {
            //set text view dengan ukuran yang sudah didapatkan + 1
            ukuran.setText((levelCurrent + 1) + "L");
            //maka set image battery dengan battery satu tingkat sebelum level tertinggi
            battery.setImageLevel(levelCurrent + 1);
        } else {
            //maksimum levelCurrent
            levelCurrent = 6;
            //maka akan muncul toast yang memberi tahu bahwa air sudah full
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
        }
    }
}
