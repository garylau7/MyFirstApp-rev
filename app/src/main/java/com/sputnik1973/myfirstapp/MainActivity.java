package com.sputnik1973.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.sputnik1973.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** call on Button click*/
    public void sendMessage(View view){
        //do sth
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }

    public void sendMessage2(View view){
        Intent intent = new Intent(this, DisplayMessageActivity2.class);

        EditText editText = (EditText) findViewById(R.id.edit_message2);
        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);



        startActivity(intent);
    }
}
