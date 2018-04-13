package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_= (Button)findViewById(R.id.askButton);
        final ImageView ball = (ImageView)findViewById(R.id.ball_image);
        final int[] ball_arr = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
       button_.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Random r = new Random();
               int var = r.nextInt(5);
               ball.setImageResource(ball_arr[var]);

           }
       });





    }
}
