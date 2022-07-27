package co.grandcircus.weatherapilab.models;

public class WeatherData {
	
	private String[] temperature;
	private String[] pop;
	private String[] weather;
	private String[] text;
	
	
	public String[] getTemperature() {
		return temperature;
	}
	public void setTemperature(String[] temperature) {
		this.temperature = temperature;
	}
	public String[] getPop() {
		return pop;
	}
	public void setPop(String[] pop) {
		this.pop = pop;
	}
	public String[] getWeather() {
		return weather;
	}
	public void setWeather(String[] weather) {
		this.weather = weather;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	
	
	

}
