package co.grandcircus.weatherapilab.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.weatherapilab.models.Weather;

@Service
public class WeatherApiService {

	private RestTemplate restTemplate = new RestTemplate();
	
	
	
	public Weather getWeatherInfoReponse(String latitude, String longitude) {
		String url = "https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		
		Weather response = restTemplate.getForObject(url, Weather.class,latitude, longitude);
		return response;
	}


}
