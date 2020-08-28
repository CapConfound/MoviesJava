package com.capcon.moviesjava.network;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://www.omdbapi.com/";


    public static Retrofit getRetrofitInstance() {


        if (retrofit == null) {
            Interceptor interceptor;
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public okhttp3.Response intercept(Chain chain) throws IOException {
                            Request original = chain.request();
                            HttpUrl httpUrl = original.url();

                            HttpUrl newHttpUrl = httpUrl.newBuilder().addQueryParameter("apikey", "8e102e39").build();

                            Request.Builder requestBuilder = original.newBuilder().url(newHttpUrl);

                            Request request = requestBuilder.build();
                            return chain.proceed(request);
                        }
                    })
                    .build();
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            SearchService service = retrofit.create(SearchService.class);
        }
        return retrofit;
    }
}
