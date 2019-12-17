package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick:UP");
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick:DOWN");
                break;
            case R.id.arrow_left:
                Log.d("MainActivity","onClick:LEFT");
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick:RIGHT");
                break;


        }
    }
}




