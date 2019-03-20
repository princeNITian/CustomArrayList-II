package com.example.prince.hsamp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView simpleGrid;
    ArrayList<Item> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = (GridView)findViewById(R.id.simpleGridView);
        item.add(new Item("Prince",R.drawable.p4));
        item.add(new Item("LearnByExample",R.drawable.learn));
        item.add(new Item("Maths",R.drawable.math));
        item.add(new Item("Physics",R.drawable.physics));
        item.add(new Item("Chemistry",R.drawable.chemistry));
        item.add(new Item("Raj",R.drawable.picf));

        MyAdapter adapter = new MyAdapter(this,R.layout.grid_view_items,item);
        simpleGrid.setAdapter(adapter);

    }
}
