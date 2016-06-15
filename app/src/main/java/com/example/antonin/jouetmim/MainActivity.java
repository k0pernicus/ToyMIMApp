package com.example.antonin.jouetmim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MIMClass mim_object = new MIMClass();
                long beg = System.currentTimeMillis();
                for (int i = 0; i < 5000000; i++) {
                    int b = mim_object.Foo();
                }
                // Get execution time of the application
                Log.d("EXECUTION_TIME", Long.toString(System.currentTimeMillis() - beg));
                finish();
            }
        });
    }
}
