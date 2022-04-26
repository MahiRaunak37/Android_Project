package com.example.udemyexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    Button act1,act2;
    TextView textOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.inputText);
        act1 = findViewById(R.id.button);
        act2 = findViewById(R.id.button2);
        textOut = findViewById(R.id.output);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter all fields ",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, com.example.udemyexplicitintent.Activity1.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter all fikds",Toast.LENGTH_LONG).show();
                }
                else
                {
                    String act2name = etName.getText().toString().trim();
                    Intent intent =new  Intent(MainActivity.this, com.example.udemyexplicitintent.Activity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}