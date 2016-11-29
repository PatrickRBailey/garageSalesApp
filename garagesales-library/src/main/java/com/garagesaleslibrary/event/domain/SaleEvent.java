package com.garagesaleslibrary.event.domain;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.Date;

public class SaleEvent implements Serializable {
	
	private String id;
	private Date date;
	private String title;
	private String street;
	private String city;
	private String state;
	private String zip;
	private double latitude;
	private double longitude;
	private String description;
	private float rating;
	private double distance;
	private String imageFileName;
    private Bitmap image;

	@Override
	public String toString() {
		return street + "\n" + city + ", " + state + "\n" + distance + ", " + rating;

	}

	public SaleEvent() {
		super();
	}

	public SaleEvent(String id) {
		super();
		this.id = id;
	}
	
	// generated getters and setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}


}