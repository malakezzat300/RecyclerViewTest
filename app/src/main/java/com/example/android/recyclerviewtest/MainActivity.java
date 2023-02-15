package com.example.android.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<AndroidItem> list = new ArrayList<>();
    RecyclerView recyclerView;
    ItemAdapter adapter;
    private static boolean isLinear = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AndroidItem item1 = new AndroidItem(R.drawable.img15,"Cupcake","Android 1.5");
        AndroidItem item2 = new AndroidItem(R.drawable.img16,"Donut","Android 1.6");
        AndroidItem item3 = new AndroidItem(R.drawable.img21,"Eclair","Android 2.1");
        AndroidItem item4 = new AndroidItem(R.drawable.img22,"Froyo","Android 2.2");
        AndroidItem item5 = new AndroidItem(R.drawable.img23,"Gingerbread","Android 2.3");
        AndroidItem item6 = new AndroidItem(R.drawable.img3,"Honeycomb","Android 3.0");
        AndroidItem item7 = new AndroidItem(R.drawable.img4,"IceCream Sandwich","Android 4.0");
        AndroidItem item8 = new AndroidItem(R.drawable.img41,"Jelly Bean ","Android 4.1");
        AndroidItem item9 = new AndroidItem(R.drawable.img44,"KitKat","Android 4.4");
        AndroidItem item10 = new AndroidItem(R.drawable.img5,"Lollipop","Android 5.0");



        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        list.add(item7);
        list.add(item8);
        list.add(item9);
        list.add(item10);


        recyclerView = findViewById(R.id.rv);
        adapter = new ItemAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }


    public void change(View view) {
        if(isLinear) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
            recyclerView.setAdapter(adapter);
            isLinear = false;
        }
        else{
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
            isLinear = true;
        }
    }

    public static boolean isLinear() {
        return isLinear;
    }
}