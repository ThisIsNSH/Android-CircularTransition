package com.nora.nsh.myapplication;

import android.animation.Animator;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

import static android.support.v7.appcompat.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout one = (LinearLayout) findViewById(R.id.one);
        final LinearLayout two= (LinearLayout) findViewById(R.id.two);
        final LinearLayout three = (LinearLayout) findViewById(R.id.three);
        final LinearLayout four = (LinearLayout) findViewById(R.id.four);
        final LinearLayout five = (LinearLayout) findViewById(R.id.five);
        final LinearLayout six = (LinearLayout) findViewById(R.id.six);


        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // Ordinary Intent for launching a new activity
                Intent intent = new Intent(MainActivity.this, one.class);

                // Get the transition name from the string
                String transitionName = getString(R.string.simple);

                // Define the view that the animation will start from
                View viewStart = findViewById(R.id.scroll);

                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
                                viewStart,   // Starting view
                                transitionName    // The String
                        );
                //Start the Intent
                ActivityCompat.startActivity(MainActivity.this, intent, options.toBundle());
            }

        });
    }

}
