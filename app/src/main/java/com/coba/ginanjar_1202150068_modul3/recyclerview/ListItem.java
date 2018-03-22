package com.coba.ginanjar_1202150068_modul3.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListItem {

    //inisiasi variabel
    public String title;
    public String description;
    public int foto;


    //create constructor
    public ListItem(String title, String description, int foto) {
        this.title = title;
        this.description = description;
        this.foto = foto;
    }


    //get title
    public String getTitle() {
        return title;
    }

    //get foto
    public int getFoto() {
        return foto;
    }

    //get description
    public String getDescription() {
        return description;

    }
}
