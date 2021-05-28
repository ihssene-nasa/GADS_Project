package com.example.leaderboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    public CardView card2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card2 = (CardView) findViewById(R.id.submission);
        card2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

}