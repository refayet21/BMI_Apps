package com.bmi.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bmi.bmicalculator.databinding.ActivityMainBinding;
import com.bmi.bmicalculator.databinding.ActivityMaleBinding;

import java.text.DecimalFormat;

public class MaleActivity extends AppCompatActivity {
    ActivityMaleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding=ActivityMaleBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        binding.malePageBtnCalculateID.setOnClickListener(v -> {
            String heightStr = binding.malePageEdtHeightID.getText().toString();
            double height = Double.parseDouble(heightStr);

            String weightStr = binding.malePageEdtWeightID.getText().toString();
            double weight = Double.parseDouble(weightStr);


            calculateBmi(height, weight);
        });



    }

    private void calculateBmi(double height, double weight) {

        height = height * 0.3048;

        double bmiValue = weight / (height * height);


        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String myBmiValue = decimalFormat.format(bmiValue);

        if (bmiValue < 18.5) {


            binding.malePageTvScoreID.setText("Your bmi score is : " + myBmiValue + " You're in the underweight range.You should eat more");

        } else if (bmiValue > 18.5 && bmiValue < 24.9) {
            binding.malePageTvScoreID.setText("Your bmi score is : " + myBmiValue + " You're in the Healthy Weight range. You should maintain this");


        } else if (bmiValue > 25.0 && bmiValue < 29.9) {
            binding.malePageTvScoreID.setText("Your bmi score is : " + myBmiValue + " You're in the Overweight range.  You should eat less");


        } else {
            binding.malePageTvScoreID.setText("Your bmi score is : " + myBmiValue + " You're in the Obesity range.  You should not eat more than once in a day ");


        }


    }


}


