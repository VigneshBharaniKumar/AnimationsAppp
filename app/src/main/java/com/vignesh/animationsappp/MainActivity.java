package com.vignesh.animationsappp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    private ImageView imgDog, imgCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);

        imgDog = findViewById(R.id.imgDog);
        imgCat = findViewById(R.id.imgCat);

        txtHelloWorld.setOnClickListener(onClickListener);
        txtHiWorld.setOnClickListener(onClickListener);

        imgDog.setOnClickListener(onClickImage);
        imgCat.setOnClickListener(onClickImage);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (txtHelloWorld.getAlpha() == 1) {

                Toast.makeText(getApplicationContext(), "Hi World", Toast.LENGTH_SHORT).show();
                txtHelloWorld.animate().alpha(0).setDuration(3000);
                txtHiWorld.animate().alpha(1).setDuration(3000);

            } else {

                Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
                txtHelloWorld.animate().alpha(1).setDuration(3000);
                txtHiWorld.animate().alpha(0).setDuration(3000);

            }

        }
    };

    private View.OnClickListener onClickImage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (imgDog.getAlpha() == 1) {

                Toast.makeText(MainActivity.this, "Meow", Toast.LENGTH_SHORT).show();
                imgDog.animate().alpha(0).setDuration(3000);
                imgCat.animate().alpha(1).setDuration(3000);

            } else {

                Toast.makeText(MainActivity.this, "Woof", Toast.LENGTH_SHORT).show();
                imgDog.animate().alpha(1).setDuration(3000);
                imgCat.animate().alpha(0).setDuration(3000);

            }

        }
    };

}
