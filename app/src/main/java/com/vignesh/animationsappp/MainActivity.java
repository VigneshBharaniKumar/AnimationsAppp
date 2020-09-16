package com.vignesh.animationsappp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);

        txtHelloWorld.setOnClickListener(onClickListener);
        txtHiWorld.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (txtHelloWorld.getAlpha() == 1) {

                Toast.makeText(MainActivity.this, "Hi World", Toast.LENGTH_SHORT);
                txtHelloWorld.animate().alpha(0).setDuration(3000);
                txtHiWorld.animate().alpha(1).setDuration(3000);

            } else {

                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT);
                txtHelloWorld.animate().alpha(1).setDuration(3000);
                txtHiWorld.animate().alpha(0).setDuration(3000);

            }

            /*Toast.makeText(MainActivity.this, "Animate!", Toast.LENGTH_SHORT).show();

            txtHelloWorld.animate().alpha(0).setDuration(3000);
            txtHiWorld.animate().alpha(1).setDuration(3000);*/

                /*txtHelloWorld.startAnimation(animation);

                animation = new AlphaAnimation(0, 1);
                animation.setDuration(2000);
                animation.setStartOffset(2000);

                txtHelloWorld.setText("Hi World");
                txtHelloWorld.startAnimation(animation);*/

        }
    };

}
