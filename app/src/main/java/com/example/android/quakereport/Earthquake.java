package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mURL;


    public Earthquake(Double Magnitude, String Location, Long timeInMilliseconds, String URL) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mURL = URL;
    }


    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getURL() {
        return mURL;
    }
}
