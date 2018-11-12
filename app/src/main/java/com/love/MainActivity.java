package com.love;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_flower(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
    public void btn_puzzle(View view){
        Intent intent = new Intent(this,PuzzleActivity.class);
        startActivity(intent);
    }
    public void btn_compare(View view){
        Intent intent = new Intent(this,CompareActivity.class);
        startActivity(intent);
    }
}
