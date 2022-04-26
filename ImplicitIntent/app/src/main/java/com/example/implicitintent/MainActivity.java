package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReset, btnSumbit;
    EditText firstName, surName, ip,port;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        surName = findViewById(R.id.surName);
        ip = findViewById(R.id.ip);
        port = findViewById(R.id.port);

        btnSumbit = findViewById(R.id.submit);
        btnReset = findViewById(R.id.reset);

        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstName.getText().toString().isEmpty() || surName.getText().toString().isEmpty() || ip.getText().toString().isEmpty() || port.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Input the All Field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String fName,sName,ipNo,portNo;

                    fName= firstName.getText().toString();
                    sName = surName.getText().toString();
                    ipNo = ip.getText().toString();
                    portNo = port.getText().toString();

                    Intent intent = new Intent(MainActivity.this, page2.class);
                    intent.putExtra("firstName",fName);
                    intent.putExtra("surName",sName);
                    intent.putExtra("ip",ipNo);
                    intent.putExtra("port",portNo);
                    startActivity(intent);
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}