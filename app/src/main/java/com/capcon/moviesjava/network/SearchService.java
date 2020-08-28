package com.capcon.moviesjava.network;

import com.capcon.moviesjava.R;
import com.capcon.moviesjava.model.Movie;
import com.capcon.moviesjava.model.Search;
import com.capcon.moviesjava.model.SearchResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {
    @GET("/")
    Call<SearchResult> getMovieInfo(@Query("s") String movie_title);
}
