package com.coderscampus.a10.spoonacular.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.a10.spoonacular.dto.DayResponse;
import com.coderscampus.a10.spoonacular.dto.WeekResponse;

@Service
public class MealPlannerService {

	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealPlan;
	
	@Value("${spoonacular.api.key}")
	private String apiKey;
	
	RestTemplate rt = new RestTemplate(); 
	
	public ResponseEntity<DayResponse> fetchSpoonacularDataForDay() {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan)
							.queryParam("apiKey", apiKey)
							.queryParam("timeFrame", "day")
							.queryParam("targetCalories", "1500")
							.queryParam("diet", "vegetarian")
							.queryParam("exclude", "shellfish")	
							.build()
							.toUri();
							
		ResponseEntity<DayResponse> dayResponse = rt.getForEntity(uri, DayResponse.class);
		return dayResponse;		
	}
	
	
	
	public ResponseEntity<WeekResponse> fetchSpoonacularDataForWeek() {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan)
							.queryParam("apiKey", apiKey)
							.queryParam("timeFrame", "week")
							.queryParam("targetCalories", "2000")
							.queryParam("diet", "vegetarian")
							.queryParam("exclude", "olives")
							.build()
							.toUri();
				
		ResponseEntity<WeekResponse> weekResponse = rt.getForEntity(uri, WeekResponse.class);
		return weekResponse;
	}
}

