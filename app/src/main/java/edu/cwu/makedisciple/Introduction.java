package edu.cwu.makedisciple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        TextView text = findViewById(R.id.Introduction);
        text.setMovementMethod(new ScrollingMovementMethod());
    }
}
