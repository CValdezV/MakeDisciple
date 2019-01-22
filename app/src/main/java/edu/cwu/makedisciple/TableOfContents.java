package edu.cwu.makedisciple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableOfContents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_of_contents);

        //About button intent
        Button aboutButton = (Button) findViewById(R.id.AboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContents.this,About.class));
            }
        });
        //Book button intent
        Button bookButton = (Button) findViewById(R.id.BookButton);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContents.this,BookFrame.class));
            }
        });
        Button logBook = (Button) findViewById(R.id.CalendarButton);
        logBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContents.this, Calendar.class));
            }
        });
        Button noteButton = (Button) findViewById(R.id.NoteButton);
        noteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContents.this,NoteTaking.class));
            }
        });
    }
}
