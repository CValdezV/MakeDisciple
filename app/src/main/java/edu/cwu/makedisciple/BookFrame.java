package edu.cwu.makedisciple;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BookFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_frame);

        //Toolbar setup
        Toolbar bar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(bar);
        //Actions on the Bar itself
        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
        //Intent to the abbreviations
        Button abbreviationButton = (Button) findViewById(R.id.AbbButton);
        abbreviationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BookFrame.this,Abbreviations.class));
            }
        });

        Button introButton = (Button) findViewById(R.id.IntroButton);
        introButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BookFrame.this,Introduction.class));
            }
        });
    }
}
