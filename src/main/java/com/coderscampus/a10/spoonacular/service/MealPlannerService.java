package com.coderscampus.a10.spoonacular.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.a10.spoonacular.dto.DayResponse;
//import com.coderscampus.a10.spoonacular.dto.WeekResponse;

@Service
public class MealPlannerService {

//	@Autowired
//	private ResponseEntity<WeekResponse> weekResponse; 
	
	@Autowired
	private ResponseEntity<DayResponse> dayResponse; 
	
	RestTemplate rt = new RestTemplate(); 
	
	public ResponseEntity<DayResponse> fetchSpoonacularDataForDay() {
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
							.queryParam("timeFrame", "week")
							.queryParam("tragetCaloies", "2500")
							.queryParam("diet", "vegetarian")
							.queryParam("exclude", "shellfish")
							.queryParam("apiKey", "52b2023f776e49889eebc7271c73ce40")
							.build()
							.toUri();
							
		dayResponse = rt.getForEntity(uri, DayResponse.class);
		return dayResponse;
			
	}
}
