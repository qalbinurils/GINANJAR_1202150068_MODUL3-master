package com.coba.ginanjar_1202150068_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.coba.ginanjar_1202150068_modul3.recyclerview.ListItem;
import com.coba.ginanjar_1202150068_modul3.recyclerview.ListItemAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private LinkedList<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        //check orientation screen
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Jika landscape maka akan menampilkan 2 grid
            recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
            //jika orientasi menjadi portrait
        } else {
            //maka akan menampilkan satu grid saja
            recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }


        //Create variabel LinkedList for save data
        listItems = new LinkedList<>();

        //adding data
        listItems.add(new ListItem("Ades", "Ini adalah air minum Ades", R.drawable.ades));
        listItems.add(new ListItem("Amidis", "Ini adalah air minum Amidis", R.drawable.aqua));
        listItems.add(new ListItem("Aqua", "Ini adalah air minum Amidis", R.drawable.amidis));
        listItems.add(new ListItem("Cleo", "Ini adalah air minum Cleo", R.drawable.cleo));
        listItems.add(new ListItem("Club", "Ini adalah air minum CLub", R.drawable.club));
        listItems.add(new ListItem("Equil", "Ini adalah air minum Equil", R.drawable.equil));
        listItems.add(new ListItem("Evian", "Ini adalah air minum Evian", R.drawable.evian));
        listItems.add(new ListItem("Le minerale", "Ini adalah air minum Le Minerale", R.drawable.leminerale));
        listItems.add(new ListItem("Nestle", "Ini adalah air minum Nestle", R.drawable.nestle));
        listItems.add(new ListItem("Pristine", "Ini adalah air minum Pristine", R.drawable.pristine));
        listItems.add(new ListItem("Vit", "Ini adalah air minum Vit", R.drawable.vit));

        //add data to adapter
        adapter = new ListItemAdapter(listItems, this);
    }

    //Check jika terjadi perubahan orienttation
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
    }
}
