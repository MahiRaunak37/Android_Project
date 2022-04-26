package com.example.upload_reg_photo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public static final String KEY_User_Document1 = "doc1";
    ImageView IDProf;
    Button Upload_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IDProf=(ImageView)findViewById(R.id.IdProf);
        Upload_Btn=(Button)findViewById(R.id.UploadBtn);

        IDProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });
        Upload_Btn.setOnClickListener(this);
    }
    private void selectImage()
    {
        final CharSequence[] options = { "Take Photo", "Choose from Gallery","Cancel" };
        new AlertDialog.Builder.AlertDialog.Builder builder = new  AlertDialog.Builder.AlertDialog.Builder(Uplode_Reg_Photo.this);
    }

    @Override
    public void onClick(View view) {

    }
}