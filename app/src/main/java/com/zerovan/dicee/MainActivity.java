package com.zerovan.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public int dollar = 14000;
    double roundTwoDecimals(double d)
    {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }
    public void login(View view)
    {
        try {


        EditText Username = (EditText) findViewById(R.id.UsernameEditText);

        String value= Username.getText().toString();

        double finalValue=Double.parseDouble(value);
        finalValue/=dollar;
        finalValue = roundTwoDecimals(finalValue);
        String resault =Double.toString(finalValue);

//        double amount =finalValue/dollar;
//        Log.i("price ", (Double.toString(amount)));



//        TextView textView = (TextView) findViewById(R.id.UsernameTextView);
//
        Toast.makeText(this, "$ "+resault , Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex)
        {
            Toast.makeText(this, "مقدار اشتباه" , Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
