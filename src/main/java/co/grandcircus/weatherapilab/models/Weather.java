package co.grandcircus.weatherapilab.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
	private Location location;
	private WeatherTime time;
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	private WeatherData data;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public WeatherTime getTime() {
		return time;
	}
	public void setTime(WeatherTime time) {
		this.time = time;
	}
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	public WeatherData getData() {
		return data;
	}
	public void setData(WeatherData data) {
		this.data = data;
	}
	

}
