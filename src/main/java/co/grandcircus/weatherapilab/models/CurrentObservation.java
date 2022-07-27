package co.grandcircus.weatherapilab.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {
	private String latitude;
	private String longitude;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Temp")
	private String temp;
	@JsonProperty("Weather")
	private String weather;
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}


}
