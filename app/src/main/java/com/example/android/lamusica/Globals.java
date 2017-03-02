package com.example.android.lamusica;

/**
 * Created by stevenyang on 3/2/17.
 */

public class Globals {
    private static Globals instance;
    private static String artist;

    private Globals(){}


    public void setArtist(String s) {
        Globals.artist = s;
    }

    public String getArtist() {
        return Globals.artist;
    }

    public static synchronized Globals getInstance() {
        if (instance == null) {
            instance = new Globals();
        }
        return instance;
    }
}
