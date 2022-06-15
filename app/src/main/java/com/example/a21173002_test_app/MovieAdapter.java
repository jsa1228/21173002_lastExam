package com.example.a21173002_test_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return  new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item){
        items.add(item);
    }
    public void setItems(ArrayList<Movie> items){
        this.items = items;
    }
    public Movie getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView moviename;
        TextView moviecode;
        TextView peopleCount;
        TextView movierank;
        TextView moviedate;
        public ViewHolder (View itemView){
            super(itemView);
            moviename = itemView.findViewById(R.id.moviename);
            moviecode = itemView.findViewById(R.id.moviecode);
            peopleCount = itemView.findViewById(R.id.peopleCount);
            movierank = itemView.findViewById(R.id.movierank);
            moviedate = itemView.findViewById(R.id.moviedate);


        }
        public void setItem(Movie item) {
            moviename.setText(item.movieNm);
            moviecode.setText(item.movieCd);
            peopleCount.setText(item.audiCnt);
            movierank.setText(item.rank);
            moviedate.setText(item.audiAcc);
        }
    }
}
