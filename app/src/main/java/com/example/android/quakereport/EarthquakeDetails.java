package com.example.android.quakereport;

public class EarthquakeDetails {

    // These variables will contain the detail of Magnitude, Location and Time
    private final double mMagnitude;
    private final String mLocation, mURL;
    private final long mTime;

    /**
     * This method will contain the value of a single earthquake.
     *
     * This method will be called in other class to get an earthquake data.
     *
     * @param magnitude This will hold the Magnitude data.
     * @param location This will hold the Location data.
     * @param time This will hold the Time of Earthquake.
     */
    public EarthquakeDetails (double magnitude, String location, long time, String URL) {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
        mURL = URL;
    }

    /**
     * This method will give the value access to the other classes.
     *
     * @return This will return Magnitude value.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * This method will give the value access to the other classes.
     *
     * @return This will return Location value
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * This method will give the Time access to the other classes.
     *
     * @return This will return Time value.
     */
    public long getTime() {
        return mTime;
    }

    public String getURL() {
        return mURL;
    }
}
