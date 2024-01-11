package com.coderscampus.a10.spoonacular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.coderscampus.a10.spoonacular.dto.DayResponse;
import com.coderscampus.a10.spoonacular.dto.WeekResponse;

public class MealPlannerService {
	
	@Autowired
	private ResponseEntity<WeekResponse> weekResponse; 
	
	@Autowired
	private ResponseEntity<DayResponse> dayResponse; 
}
