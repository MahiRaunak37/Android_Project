package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    OnClickListener listener1 = null;
    OnClickListener listener2 = null;
    OnClickListener listener3 = null;

    Button blue;
    Button pink;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listener1 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("blue");
                blue.setVisibility(View.INVISIBLE);
                pink.setVisibility(View.VISIBLE);
                text.setVisibility(View.INVISIBLE);
            }
        };

        listener2 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("pink");
                blue.setVisibility(View.VISIBLE);
                pink.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
            }
        };
        listener3 = new OnClickListener(){
            @Override
            public void onClick(View v){
                setTitle("text");
                blue.setVisibility(View.VISIBLE);
                pink.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
            }
        };

        setContentView(R.layout.activity_main);

        blue=(Button) findViewById(R.id.blue);
        blue.setOnClickListener(listener1);
        pink=(Button) findViewById(R.id.pink);
        pink.setOnClickListener(listener2);

        text = (TextView)findViewById(R.id.text);
        text.setOnClickListener(listener3);

    }
}