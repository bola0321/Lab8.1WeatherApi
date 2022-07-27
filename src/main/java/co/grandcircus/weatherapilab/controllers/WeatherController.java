package co.grandcircus.weatherapilab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.weatherapilab.models.LatitudeAndLongitude;
import co.grandcircus.weatherapilab.service.WeatherApiService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherApiService apiService;
	
	@PostMapping("/weatherResult")
	public String weatherResult(LatitudeAndLongitude userEntry, Model model) {
		String latitude = userEntry.getLatitude();
		String longitude = userEntry.getLongitude();
		System.out.println(latitude);
		System.out.println(longitude);
		model.addAttribute("weather", apiService.getWeatherInfoReponse(latitude, longitude));
		return "weather";
	}
	
	@RequestMapping("/")
	public String submitLongLat(Model model) {
		
		return "submission";
	}
	

}


//TODO: Allow user to set latitude and longitude