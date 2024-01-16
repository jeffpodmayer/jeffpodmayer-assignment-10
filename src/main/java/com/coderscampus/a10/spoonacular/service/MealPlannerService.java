package com.coderscampus.a10.spoonacular.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MealPlannerService {

	@Value("${spoonacular.urls.base}")
	private String baseUrl;
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealPlan;
	
	@Value("${spoonacular.api.key}")
	private String apiKey;
	
	RestTemplate rt = new RestTemplate(); 
	
	public <T> ResponseEntity <T> fetchSpoonacularData(String timeFrame, String numCalories, String diet, String exclude, Class <T> responseType){
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan)
				  .queryParam("apiKey", apiKey)
				  .queryParam("timeFrame", timeFrame)
				  .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
				  .queryParamIfPresent("diet", Optional.ofNullable(diet))
				  .queryParamIfPresent("exclude", Optional.ofNullable(exclude))
				  .build()
				  .toUri();
		
		return rt.getForEntity(uri, responseType);
	}
}

