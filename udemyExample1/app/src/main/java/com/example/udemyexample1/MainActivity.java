package com.example.udemyexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText EText;
    Button btn;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EText = findViewById(R.id.input);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.output);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idNumber = EText.getText().toString().trim();
                String dob =  idNumber.substring(0,6);
                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String sGender;
                if(gender<5)
                    sGender = getString(R.string.female);
                else
                    sGender = getString(R.string.male);

                int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;
                if(nationality == 0)
                    sNationality = getString(R.string.citizen);
                else
                    sNationality = getString(R.string.NotCitizen);

                String text = (getString(R.string.dob) + dob +
                        getString(R.string.gender) + sGender +
                        getString(R.string.nationality) + sNationality);

                txt.setText(text);
            }
        });

    }
}