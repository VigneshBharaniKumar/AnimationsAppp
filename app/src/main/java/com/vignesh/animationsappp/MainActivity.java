package com.vignesh.animationsappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Animate!", Toast.LENGTH_SHORT).show();

                txtHelloWorld.animate().alpha(0f).setDuration(2000);
                txtHelloWorld.setText("Hi World!");
                txtHelloWorld.animate().alpha(1f).setDuration(1000);

            }
        });

    }
}
