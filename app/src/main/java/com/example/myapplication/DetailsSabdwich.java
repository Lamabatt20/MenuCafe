package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsSabdwich extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_sabdwich);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("sandwich_id");

        Sandwiches sandwiches = Sandwiches.sandwiches[id];

        ImageView image = (ImageView)findViewById(R.id.coffee_image);
        image.setImageResource(sandwiches.getImageResourceId());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(sandwiches.getName());
        txtDesc.setText(sandwiches.getDescription());
    }
}