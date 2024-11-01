package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SpaghettiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spaghetti);

        // Create an adapter for the spaghetti
        ArrayAdapter<Spaghetti> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Spaghetti.spaghetti); // Use your spaghetti array

        ListView listView = findViewById(R.id.listview6); // Make sure this ID matches your layout
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SpaghettiActivity.this, DetailsSpagetti.class);
                intent.putExtra("spaghetti_id", (int) id); // Pass the position as an ID
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
