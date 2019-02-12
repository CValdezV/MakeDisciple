package edu.cwu.makedisciple;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import edu.cwu.makedisciple.Database.DatabaseHelper;
import edu.cwu.makedisciple.Database.TextContent;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextContent content = new TextContent();
        DatabaseHelper db = new DatabaseHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Toolbar bar = (Toolbar) findViewById(R.id.my_toolbar);
        bar.setTitle("Introduction");
        setSupportActionBar(bar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //database call to get string
        content = db.getContent(2);

        String intro = getResources().getString(R.string.intro1);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(Html.fromHtml(intro));
        tv.setMovementMethod(new ScrollingMovementMethod());


    }
}
