package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double Magnitude, String Location, long timeInMilliseconds, String url) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmUrl() {
        return mUrl;
    }
}
