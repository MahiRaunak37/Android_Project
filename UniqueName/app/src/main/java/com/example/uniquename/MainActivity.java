package com.example.uniquename;

import androidx.appcompat.app.AppCompatActivity;
import android.provider.Settings;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        String ID = Settings.Secure.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
        String id = ID.toUpperCase();

        SimpleDateFormat date = new SimpleDateFormat( "yyyyMMddHHmmssSS");
        output.setText(id+date.format(new Date()));


    }
}