package com.example.mapApp;
import java.io.Serializable;

public class PlaceMarket implements Serializable {

    private double lat;
    private double lng;


    public PlaceMarket(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public PlaceMarket() {  }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
