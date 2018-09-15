package com.zerovan.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view)
    {
        EditText Username = (EditText) findViewById(R.id.UsernameEditText);
        EditText Password = (EditText) findViewById(R.id.PasswordEditText);
        Log.i("username"  ,Username.getText().toString());
        Log.i("Password"  ,Password.getText().toString());
        Log.i("msg","test login");
        TextView textView = (TextView) findViewById(R.id.UsernameTextView);
        textView.setText("login done");
        Toast.makeText(this, "hello " + Username.getText().toString() , Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
