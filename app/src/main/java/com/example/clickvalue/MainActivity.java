package com.example.clickvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showvalue;
    int counter = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showvalue = (TextView) findViewById(R.id.count);
    }
    public void countIN (View view){
        counter++;
        showvalue.setText(Integer.toString(counter));
    }
    public void countDE (View v){
        counter--;
        showvalue.setText(Integer.toString(counter));
    }
    public void rest (View v){
        counter = 0;
        showvalue.setText(Integer.toString(counter));
    }

}