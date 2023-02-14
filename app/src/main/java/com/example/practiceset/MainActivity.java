package com.example.practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void swapText(View view){
        TextView textView1 = (TextView)findViewById(R.id.textView2);
        TextView textView2 = (TextView)findViewById(R.id.textView3);
        String temp = textView1.getText().toString();
        textView1.setText(textView2.getText().toString());
        textView2.setText(temp);
    }
    public void concatText(View view){
        TextView tv1 = (TextView)findViewById(R.id.textView2);
        TextView tv2 = (TextView)findViewById(R.id.textView3);
        TextView tv3 = (TextView)findViewById(R.id.textView4);
        tv3.setText((tv1.getText().toString() + tv2.getText().toString()));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}