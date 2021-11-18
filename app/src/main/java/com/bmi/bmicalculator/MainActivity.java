package com.bmi.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bmi.bmicalculator.databinding.ActivityMainBinding;
import com.bmi.bmicalculator.databinding.ActivityMaleBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);


       binding.maleID.setOnClickListener(v -> {
            Intent maleIntent=new Intent(MainActivity.this,MaleActivity.class);
            startActivity(maleIntent);
            Toast.makeText(MainActivity.this,"Male is clicked",Toast.LENGTH_SHORT).show();
        });

        binding.femaleID.setOnClickListener(v -> {
            Intent femaleIntent=new Intent(MainActivity.this,FemaleActivity.class);
            startActivity(femaleIntent);
            Toast.makeText(MainActivity.this,"Female is clicked",Toast.LENGTH_SHORT).show();
        });

    }
}