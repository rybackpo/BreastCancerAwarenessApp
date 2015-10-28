package com.example.student.myapplication;


import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startService(new Intent(this, Sound.class));
        startAnimating();
    }

    private void startAnimating() {
        // Fade in top title
        TextView logo1 = (TextView) findViewById(R.id.top_title);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo1.startAnimation(fade1);
        // Fade in bottom title after a built-in delay.
        TextView logo2 = (TextView) findViewById(R.id.bot_title);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
        logo2.startAnimation(fade2);
        TextView logo3 = (TextView) findViewById(R.id.bot_version);
        logo3.startAnimation(fade2);
        // Transition to Main Menu when bottom title finishes animating
        fade2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationEnd(Animation animation) {
                // The animation has ended, transition to the Main Menu screen
                Intent i = new Intent(Splash.this,
                        TopLevelMenu.class);
                startActivity(i);
                Splash.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationStart(Animation animation) {
            }


        });
        Animation spinin = AnimationUtils.loadAnimation(this,
                R.anim.custom_anim);
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        img1.startAnimation(spinin);
        }
    @Override
    protected void onPause() {
        super.onPause();
        // Stop the animation
        TextView logo1 = (TextView) findViewById(R.id.top_title);
        logo1.clearAnimation();
        TextView logo2 = (TextView) findViewById(R.id.bot_title);
        logo2.clearAnimation();

    }

    @Override
    protected void onResume() {
        super.onResume();

        // Start animating at the beginning so we get the full splash screen
        // experience
        startAnimating();
    }
}
