package com.sputnik1973.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.XTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(80);
        textView.setText(message.toUpperCase());

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message2);
        layout.addView(textView);
    }
}
