package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class SaladsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);

        // Create an ArrayAdapter for the salads array
        ArrayAdapter<Salads> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Salads.salads);

        // Find the ListView and set the adapter
        ListView listView = (ListView)findViewById(R.id.listview4);
        listView.setAdapter(listAdapter);

        // Set up the item click listener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                // Launch the details activity with the selected salad's ID
                Intent intent = new Intent(SaladsActivity.this, DetailsSalads.class);
                intent.putExtra("salad_id", (int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}

