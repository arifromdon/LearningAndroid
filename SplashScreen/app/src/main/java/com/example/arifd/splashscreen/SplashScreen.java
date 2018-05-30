package com.example.arifd.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class SplashScreen extends AppCompatActivity {
    private static final int SplashDuration = 2000;
    private Handler handler = new Handler();

    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();

        handler.postDelayed(mEndSplash, SplashDuration);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        mEndSplash.run();
        return super.onTouchEvent(event);
    }

    private Runnable mEndSplash = new Runnable() {
        @Override
        public void run() {
            if (!isFinishing()){
                handler.removeCallbacks(this);

                startActivity(new Intent(
                        SplashScreen.this, MainActivity.class
                ));
                finish();
            }
        };
    };
}
