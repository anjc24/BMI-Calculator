package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void calculate(View view){
       Log.i("Info", "Button");
       EditText weight = (EditText) findViewById(R.id.weight);
       EditText heightt = (EditText) findViewById(R.id.heightt);
       Log.i("Info", weight.getText().toString());
       Log.i("Info", heightt.getText().toString());
       String weightInKg= weight.getText().toString();
       double weightD = Double.parseDouble(weightInKg);
       String heightInMt= heightt.getText().toString();
       double heightD = Double.parseDouble(heightInMt);
       double bmi = weightD/(heightD*heightD);
       String bmiS= Double.toString(bmi);
       Log.i("Info", bmiS);
        TextView result = (TextView)findViewById(R.id.result);
        TextView category = (TextView)findViewById(R.id.category);
        result.setText("Your BMI is: " + String.format("%.2f" ,bmi));
        if(bmi < 18) {
            category.setText("Category: Underweight");
        }
        else if(bmi < 25){
            category.setText("Category: Healthy Weight");
        }
        else if(bmi < 30){
            category.setText("Category: Overweight");
        }
        else {
            category.setText("Category: Obese");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}