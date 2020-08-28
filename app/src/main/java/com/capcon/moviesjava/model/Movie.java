package com.capcon.moviesjava.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    @SerializedName("Title")
    private String movieTitle;

    @SerializedName("Year")
    private Integer movieYear;

    @SerializedName("Rated")
    private String movieRated;

    @SerializedName("Released")
    private String movieReleased;

    @SerializedName("Runtime")
    private String movieRuntime;

    @SerializedName("Genre")
    private String movieGenre;

    @SerializedName("Director")
    private String movieDirector;

    @SerializedName("Writer")
    private String movieWriter;

    @SerializedName("Actors")
    private String movieActors;

    @SerializedName("Plot")
    private String moviePlot;

    @SerializedName("Language")
    private String movieLanguage;

    @SerializedName("Country")
    private String movieCountry;

    @SerializedName("Awards")
    private String movieAwards;

    @SerializedName("Poster")
    private String moviePoster;

    @SerializedName("Ratings")
    private List<Ratings> movieRatings;

    @SerializedName("Metascore")
    private Integer movieMetascore;

    @SerializedName("imdbRating")
    private double movieImdrRating;

    @SerializedName("imdbVotes")
    private String movieImdbVotes;

    @SerializedName("imdbID")
    private String movieImdbId;

    @SerializedName("Type")
    private String movieType;

    @SerializedName("DVD")
    private String movieDvd;

    @SerializedName("BoxOffice")
    private String movieBoxOffice;

    @SerializedName("Production")
    private String movieProduction;

    @SerializedName("Website")
    private String movieWebsite;

    @SerializedName("Response")
    private String movieResponse;

    public double getMovieImdrRating() {
        return movieImdrRating;
    }

    public Integer getMovieMetascore() {
        return movieMetascore;
    }

    public Integer getMovieYear() {
        return movieYear;
    }

    public List<Ratings> getMovieRatings() {
        return movieRatings;
    }

    public String getMovieActors() {
        return movieActors;
    }

    public String getMovieAwards() {
        return movieAwards;
    }

    public String getMovieBoxOffice() {
        return movieBoxOffice;
    }

    public String getMovieCountry() {
        return movieCountry;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public String getMovieDvd() {
        return movieDvd;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getMovieImdbId() {
        return movieImdbId;
    }

    public String getMovieImdbVotes() {
        return movieImdbVotes;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public String getMoviePlot() {
        return moviePlot;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public String getMovieProduction() {
        return movieProduction;
    }

    public String getMovieRated() {
        return movieRated;
    }

    public String getMovieReleased() {
        return movieReleased;
    }

    public String getMovieResponse() {
        return movieResponse;
    }

    public String getMovieRuntime() {
        return movieRuntime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public String getMovieWebsite() {
        return movieWebsite;
    }

    public String getMovieWriter() {
        return movieWriter;
    }

    public void setMovieActors(String movieActors) {
        this.movieActors = movieActors;
    }

    public void setMovieAwards(String movieAwards) {
        this.movieAwards = movieAwards;
    }

    public void setMovieBoxOffice(String movieBoxOffice) {
        this.movieBoxOffice = movieBoxOffice;
    }

    public void setMovieCountry(String movieCountry) {
        this.movieCountry = movieCountry;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public void setMovieDvd(String movieDvd) {
        this.movieDvd = movieDvd;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setMovieImdbId(String movieImdbId) {
        this.movieImdbId = movieImdbId;
    }

    public void setMovieImdbVotes(String movieImdbVotes) {
        this.movieImdbVotes = movieImdbVotes;
    }

    public void setMovieImdrRating(double movieImdrRating) {
        this.movieImdrRating = movieImdrRating;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public void setMovieMetascore(Integer movieMetascore) {
        this.movieMetascore = movieMetascore;
    }

    public void setMoviePlot(String moviePlot) {
        this.moviePlot = moviePlot;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public void setMovieProduction(String movieProduction) {
        this.movieProduction = movieProduction;
    }

    public void setMovieRated(String movieRated) {
        this.movieRated = movieRated;
    }

    public void setMovieRatings(List<Ratings> movieRatings) {
        this.movieRatings = movieRatings;
    }

    public void setMovieReleased(String movieReleased) {
        this.movieReleased = movieReleased;
    }

    public void setMovieResponse(String movieResponse) {
        this.movieResponse = movieResponse;
    }

    public void setMovieRuntime(String movieRuntime) {
        this.movieRuntime = movieRuntime;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void setMovieWebsite(String movieWebsite) {
        this.movieWebsite = movieWebsite;
    }

    public void setMovieWriter(String movieWriter) {
        this.movieWriter = movieWriter;
    }

    public void setMovieYear(Integer movieYear) {
        this.movieYear = movieYear;
    }

    public int get(int position) {
        return position;
    }
}
