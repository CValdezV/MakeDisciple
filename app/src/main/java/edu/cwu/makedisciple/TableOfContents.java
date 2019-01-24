package edu.cwu.makedisciple;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TableOfContents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_of_contents);
        //Action bar content
        Toolbar bar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(bar);


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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_new_content_about:
                // User chose the "Settings" item, show the app settings UI...
                Intent intent = new Intent(TableOfContents.this,About.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
