package com.example.hextree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secret_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);

        Intent getsecret = getIntent();

        String secret = getsecret.getStringExtra(Intent.EXTRA_TEXT);
        if (secret!= null){
            TextView text = findViewById(R.id.secret_text);
            text.setText("Shared:"+secret);
        }


    }
}