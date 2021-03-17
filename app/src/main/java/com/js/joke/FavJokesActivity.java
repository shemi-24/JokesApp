package com.js.joke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.js.joke.fragments.FavJokesFragment;

public class FavJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_jokes);
        FavJokesFragment mFavJokeFragment=FavJokesFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fav_jokes_container,mFavJokeFragment).commit();
    }
}