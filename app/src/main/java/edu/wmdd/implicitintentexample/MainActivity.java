package edu.wmdd.implicitintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        String action = i.getAction();
        String type = i.getType();
        String data = i.getStringExtra(Intent.EXTRA_TEXT);

        TextView tv = findViewById(R.id.textView);
        tv.setText(action+" "+type+" "+data);
    }
}
