package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class contactDetails extends AppCompatActivity {
    TextView name,number,website,location;
    ImageView happiest, happy, sad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        website = findViewById(R.id.website);
        location = findViewById(R.id.location);

        happiest = findViewById(R.id.happiest);
        happy = findViewById(R.id.happy);
        sad = findViewById(R.id.sad);
    }
}