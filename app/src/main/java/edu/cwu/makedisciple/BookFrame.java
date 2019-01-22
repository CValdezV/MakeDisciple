package edu.cwu.makedisciple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_frame);

        //Intent to the abbreviations
        Button abbreviationButton = (Button) findViewById(R.id.AbbButton);
        abbreviationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BookFrame.this,Abbreviations.class));
            }
        });

    }
}
