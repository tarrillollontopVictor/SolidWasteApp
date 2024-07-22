package com.solidWaste_backend.SolidWasteApp.dtos.request;

public class ImageRequest {
    private String img;
    private double latitude;
    private double longitude;

    // Getters y Setters
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}