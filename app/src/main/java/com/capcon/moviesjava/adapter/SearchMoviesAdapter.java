package com.capcon.moviesjava.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.capcon.moviesjava.R;
import com.capcon.moviesjava.model.Search;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;


public class SearchMoviesAdapter extends RecyclerView.Adapter<SearchMoviesAdapter.ViewHolder> {

    private List<Search> movieSearchResult;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView posterImage;
        public TextView movieTitle;
        public TextView movieYear;

        public ViewHolder(View itemView) {
            super(itemView);
            posterImage = itemView.findViewById(R.id.recycler_poster_view);
            movieTitle = itemView.findViewById(R.id.recycler_title_view);
            movieYear = itemView.findViewById(R.id.recycler_year_view);

            Log.e("ViewHolder: ", "сработало");
        }

    }



    public SearchMoviesAdapter(List<Search> movieSearchResult, Context context) {
        this.context = context;
        this.movieSearchResult = movieSearchResult;
    }

    @NotNull
    @Override
    public SearchMoviesAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
//---------------------------------------------------------------------------------------------------------------------
        View movieView = inflater.inflate(R.layout.recycler_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(movieView);
        Log.e("onCreateViewHolder: ", "сработало");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int position) {

        Search movieList = movieSearchResult.get(position);

        Log.e("movies: ", String.valueOf(movieSearchResult));

        viewHolder.movieTitle.setText(movieList.getTitle());
        viewHolder.movieYear.setText(movieList.getYear());
//        viewHolder.countryName.setText(movieList);

//        TextView textTitle = viewHolder.movieTitle;
//        TextView textYear = viewHolder.movieYear;

        //Нужная хрень
//        textTitle.setText(movieList.getTitle());
//        textYear.setText(movieList.getYear());

//        Picasso.with(context)
//                .load(movieList.getPoster())
//                .placeholder(R.drawable.placeholder)
//                .error(R.drawable.placeholder)
//                .into(viewHolder.posterImage);
        //тоже очень нужная хрень
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(movieList.getPoster())
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(viewHolder.posterImage);
        Log.d("dssadda", "dsfsdf");
    }

    @Override
    public int getItemCount() {
        return movieSearchResult.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }







}
