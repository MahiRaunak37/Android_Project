package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    String outputFirstName,outputSurName,outputIP, outputPort;
    TextView textViewFirstName, textViewSurName,textViewIP,textViewPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

            textViewFirstName =findViewById(R.id.inputFirstName);
            textViewSurName = findViewById(R.id.inputSurName);
            textViewIP = findViewById(R.id.inputIPAddress);
            textViewPort = findViewById(R.id.inputPortNo);

            outputFirstName = getIntent().getStringExtra("firstName");
            outputSurName = getIntent().getStringExtra("surName");
            outputIP = getIntent().getStringExtra("ip");
            outputPort = getIntent().getStringExtra("port");

            textViewFirstName.setText(outputFirstName);
            textViewSurName.setText(outputSurName);
            textViewIP.setText(outputIP);
            textViewPort.setText(outputPort);


    }
}