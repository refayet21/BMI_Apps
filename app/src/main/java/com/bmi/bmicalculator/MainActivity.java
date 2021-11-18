package com.bmi.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ImageView maleImage,femaleImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maleImage=findViewById(R.id.maleID);
        femaleImage=findViewById(R.id.femaleID);

        maleImage.setOnClickListener(v -> {
            Intent maleIntent=new Intent(MainActivity.this,MaleActivity.class);
            startActivity(maleIntent);
            Toast.makeText(MainActivity.this,"Male is clicked",Toast.LENGTH_SHORT).show();
        });

        femaleImage.setOnClickListener(v -> {
            Intent femaleIntent=new Intent(MainActivity.this,FemaleActivity.class);
            startActivity(femaleIntent);
            Toast.makeText(MainActivity.this,"Female is clicked",Toast.LENGTH_SHORT).show();
        });

    }
}