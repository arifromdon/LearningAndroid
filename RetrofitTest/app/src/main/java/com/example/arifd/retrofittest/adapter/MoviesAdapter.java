package com.example.arifd.retrofittest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.arifd.retrofittest.R;
import com.example.arifd.retrofittest.model.Result;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private List<Result> movies;
    private int rowLayout;
    private Context context;

    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;

        public MovieViewHolder(View v){
            super(v);
            moviesLayout = v.findViewById(R.id.movies_layout);
            movieTitle = v.findViewById(R.id.title);
            data = v.findViewById(R.id.subtitle);
            movieDescription = v.findViewById(R.id.description);
            rating = v.findViewById(R.id.rating);
        }
    }

    public MoviesAdapter(List<Result> movies, int rowLayout, Context context){
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder (MovieViewHolder holder, final int position){
        holder.movieTitle.setText(movies.get(position).getTitle());
        holder.movieDescription.setText(movies.get(position).getOverview());
        holder.data.setText(movies.get(position).getReleaseDate());
        holder.rating.setText(movies.get(position).getVoteAverage().toString());
    }

    @Override
    public int getItemCount(){
        return movies.size();
    }



}