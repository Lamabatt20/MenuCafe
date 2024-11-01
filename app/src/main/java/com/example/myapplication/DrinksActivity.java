package com.example.myapplication;

import static com.example.myapplication.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(layout.activity_main2);
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks);

        ListView listView = (ListView)findViewById(id.listview3);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(DrinksActivity.this,
                        DetailsDrink.class);
                intent.putExtra("drink_id", (int)id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}