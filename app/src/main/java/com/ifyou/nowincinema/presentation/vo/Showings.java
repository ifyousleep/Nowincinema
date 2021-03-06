package com.ifyou.nowincinema.presentation.vo;

/**
 * Created by Baranov on 17.04.2017.
 **/

public class Showings {

    private final Integer mId;
    private final String mMovieTitle;
    private final String mPlaceTitle;
    private final String mPosterUrl;
    private final Integer mMovieId;
    private final Integer mPlaceId;
    private final Integer mTime;
    private final Double mLat;
    private final Double mLon;
    private final String mAddress;

    public Showings(Integer id, String movieTitle, String placeTitle,
                    String posterUrl, Integer movieId, Integer placeId,
                    Integer time, Double lat, Double lon, String address) {
        mId = id;
        mMovieTitle = movieTitle;
        mPlaceTitle = placeTitle;
        mPosterUrl = posterUrl;
        mMovieId = movieId;
        mPlaceId = placeId;
        mTime = time;
        mLat = lat;
        mLon = lon;
        mAddress = address;
    }

    public String getAddress() {
        return mAddress;
    }

    public Integer getId() {
        return mId;
    }

    public String getMovieTitle() {
        return mMovieTitle;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public String getPosterUrl() {
        return mPosterUrl;
    }

    public Integer getMovieId() {
        return mMovieId;
    }

    public Integer getPlaceId() {
        return mPlaceId;
    }

    public Integer getTime() {
        return mTime;
    }

    public Double getLat() {
        return mLat;
    }

    public Double getLon() {
        return mLon;
    }
}
