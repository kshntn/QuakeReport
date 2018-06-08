package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;


    public Earthquake(double Magnitude, String Location, long timeInMilliseconds) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = timeInMilliseconds;
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
}
