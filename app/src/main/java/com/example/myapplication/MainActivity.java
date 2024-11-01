package com.example.myapplication;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String[] menuItems = {"Drinks", "Sandwiches", "Salads", "Spaghetti"};
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0: // Drinks
                        intent = new Intent(MainActivity.this, DrinksActivity.class);
                        startActivity(intent);
                        break;
                    case 1: // Sandwiches
                        intent = new Intent(MainActivity.this, SandwichesActivity.class);
                        startActivity(intent);
                        break;
                    case 2: // Salads
                        intent = new Intent(MainActivity.this, SaladsActivity.class);
                        startActivity(intent);
                        break;
                    case 3: // Spaghetti
                        intent = new Intent(MainActivity.this, SpaghettiActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        ListView listView = (ListView)findViewById(R.id.listview2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(itemClickListener);


    }
}