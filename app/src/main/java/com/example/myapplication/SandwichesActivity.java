package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SandwichesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        // Create an adapter for the sandwiches
        ArrayAdapter<Sandwiches> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Sandwiches.sandwiches); // Use your sandwiches array

        ListView listView = findViewById(R.id.listview5); // Make sure this ID matches your layout
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SandwichesActivity.this, DetailsSabdwich.class);
                intent.putExtra("sandwich_id", (int) id); // Pass the position as an ID
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
