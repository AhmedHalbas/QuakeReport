package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    String mURL;


    public EarthquakeLoader(@NonNull Context context, String URL) {
        super(context);

        mURL = URL;

    }


    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override

    public ArrayList<Earthquake> loadInBackground() {


        if (mURL == null) {
            return null;
        }


        // Perform the HTTP request for earthquake data and process the response.
        ArrayList<Earthquake> result = QueryUtils.fetchEarthquakesData(mURL);
        return result;


    }
}
