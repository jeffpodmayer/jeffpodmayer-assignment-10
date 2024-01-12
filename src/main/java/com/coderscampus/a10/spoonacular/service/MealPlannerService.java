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
	
	
	RestTemplate rt = new RestTemplate(); 
	
	public ResponseEntity<DayResponse> fetchSpoonacularDataForDay() {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan)
							.queryParam("timeFrame", "day")
							.queryParam("targetCalories", "2500")
							.queryParam("diet", "vegetarian")
							.queryParam("exclude", "")
							.queryParam("apiKey", "52b2023f776e49889eebc7271c73ce40")
							.build()
							.toUri();
							
		ResponseEntity<DayResponse> dayResponse = rt.getForEntity(uri, DayResponse.class);
		return dayResponse;		
	}
	
	
	
	public ResponseEntity<WeekResponse> fetchSpoonacularDataForWeek() {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan)
				.queryParam("timeFrame", "week")
				.queryParam("targetCalories", "3000")
				.queryParam("diet", "ovovegetarian")
				.queryParam("exclude", "shellfish")
				.queryParam("apiKey", "52b2023f776e49889eebc7271c73ce40")
				.build()
				.toUri();
				
		ResponseEntity<WeekResponse> weekResponse = rt.getForEntity(uri, WeekResponse.class);
		return weekResponse;
	}
}

