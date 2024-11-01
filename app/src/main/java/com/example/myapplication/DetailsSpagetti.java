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

public class DetailsSpagetti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_spagetti);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("spaghetti_id");

        Spaghetti spaghetti = Spaghetti.spaghetti[id];

        ImageView image = (ImageView)findViewById(R.id.coffee_image);
        image.setImageResource(spaghetti.getImageResourceId());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(spaghetti.getName());
        txtDesc.setText(spaghetti.getDescription());
    }
}