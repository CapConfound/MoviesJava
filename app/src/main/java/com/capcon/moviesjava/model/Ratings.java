package com.capcon.moviesjava.model;

import com.google.gson.annotations.SerializedName;

public class Ratings {

    @SerializedName("Source")
    private String ratingSource;
    @SerializedName("Value")
    private String ratingValue;


    public String getRatingSource() {
        return ratingSource;
    }

    public void setRatingSource(String ratingSource) {
        this.ratingSource = ratingSource;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }
}
