package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView show_count = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.COUNT);
        show_count.setText(count);
    }
}