package com.js.joke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class SplashScreen extends Activity {


    private static boolean splashLoaded=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!splashLoaded){
            setContentView(R.layout.splash);
            int secondsDelayed=1;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
            },secondsDelayed*500);

            splashLoaded=true;

        } else {
            Intent goToMainACtivity=new Intent(SplashScreen.this,MainActivity.class);
            goToMainACtivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainACtivity);
            finish();
        }
    }
}
