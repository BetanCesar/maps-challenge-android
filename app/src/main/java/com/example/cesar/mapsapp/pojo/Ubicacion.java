package com.example.cesar.mapsapp.pojo;

/**
 * Created by Cesar on 23/02/18.
 */

public class Ubicacion {
    public String city;
    public double lat, lon;

    public Ubicacion() {
    }

    public Ubicacion(String city, double lat, double lon) {
        this.city = city;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
