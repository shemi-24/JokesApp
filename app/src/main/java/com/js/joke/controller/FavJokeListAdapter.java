package com.js.joke.controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.js.joke.R;
import com.js.joke.model.Joke;
import com.js.joke.view.FavJokeViewHolder;

import java.util.List;
import java.util.zip.Inflater;

public class FavJokeListAdapter extends RecyclerView.Adapter<FavJokeViewHolder> {

    private List<Joke> mJokeList;
    private Context mcontext;

    public Context getMcontext() {
        return mcontext;
    }

    public FavJokeListAdapter(List jokeList,Context context){
        mcontext=context;
        mJokeList=jokeList;
    }

    @NonNull
    @Override
    public FavJokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.fav_joke_item,parent,false);
        return new FavJokeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavJokeViewHolder holder, int position) {

        String jokeText=mJokeList.get(position).getJokeText();
        holder.getTxtFavJoke().setText(jokeText);
        holder.getImgShareButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                //Actual data to share
                String shareBody=jokeText;
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Mama Joke!");
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                mcontext.startActivity(Intent.createChooser(intent,"Share Via"));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mJokeList.size();
    }
}
