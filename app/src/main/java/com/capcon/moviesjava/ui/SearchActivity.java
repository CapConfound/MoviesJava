package com.capcon.moviesjava.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.capcon.moviesjava.R;
import com.capcon.moviesjava.adapter.SearchMoviesAdapter;
import com.capcon.moviesjava.model.Search;
import com.capcon.moviesjava.model.SearchResult;
import com.capcon.moviesjava.network.ApiClient;
import com.capcon.moviesjava.network.SearchService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    private EditText searchTitle;
    private RecyclerView rvMovies;
    private RecyclerView.LayoutManager layoutManager;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showError(String errorText){
        TextView error = findViewById(R.id.error_text);
        RecyclerView rv = findViewById(R.id.recycler_view);
        error.setVisibility(View.VISIBLE);
        error.setText(errorText);
        rv.setVisibility(View.INVISIBLE);
    }

    public void hideError(){
        TextView error = findViewById(R.id.error_text);
        RecyclerView rv = findViewById(R.id.recycler_view);
        error.setVisibility(View.INVISIBLE);
        rv.setVisibility(View.VISIBLE);
    }

    public void searchButtonPressed(View view) {

        searchTitle = (EditText) findViewById(R.id.edit_query);
        String query = searchTitle.getText().toString();
        rvMovies = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        rvMovies.setLayoutManager(layoutManager);
        SearchService service = ApiClient.getRetrofitInstance().create(SearchService.class);
        Call<SearchResult> call = service.getMovieInfo(query);
        call.enqueue(new Callback<SearchResult>() {
                         @Override
                         public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                             Log.w("Response body ", String.valueOf(response.body()));
                             Log.w("onResponse ", String.valueOf(response));
                             if(response.code()==200) {
                                 hideError();
                                 List<Search> movieList = response.body().getSearch();
                                 if(movieList != null){
                                     Log.w("list", String.valueOf(movieList.get(0).getPoster()));

                                     RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
                                     SearchMoviesAdapter adapter = new SearchMoviesAdapter(movieList, getApplication());
                                     recyclerView.setAdapter(adapter);
                                     recyclerView.setLayoutManager(new LinearLayoutManager(context));
                                 }
                                 else{
                                     showError("Response invalid");
                                 }
                             }
                         }

                         @Override
                         public void onFailure(Call<SearchResult> call, Throwable t) {
                             Log.w("onFailure ", t.getMessage());
                             Toast.makeText(SearchActivity.this,"Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                             showError("Response failed");
                         }
                     }
        );
    }
}
