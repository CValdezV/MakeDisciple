package edu.cwu.makedisciple;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NoteTaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_taking);

        //ToolBar setup
        Toolbar bar = (Toolbar) findViewById(R.id.my_toolbar);
        bar.setTitle("Campus/Church Notes");
        setSupportActionBar(bar);
        //Actions on the Bar itself
        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = (EditText) findViewById(R.id.editText);
                EditText et2 = (EditText) findViewById(R.id.editText2);
                EditText et3 = (EditText) findViewById(R.id.editText4);
                EditText et4 = (EditText) findViewById(R.id.editText5);
                EditText et5 = (EditText) findViewById(R.id.editText6);

                Snackbar.make(view, "\tSaved", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                et.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
            }
        });
    }
}
