package com.coderscampus.a10.spoonacular.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.a10.spoonacular.dto.DayResponse;
import com.coderscampus.a10.spoonacular.dto.WeekResponse;
import com.coderscampus.a10.spoonacular.service.MealPlannerService;

@RestController
public class MealPlannerController {

	@Autowired
	private MealPlannerService mealPlannerService;

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return mealPlannerService.fetchSpoonacularData("week", numCalories, diet,exclusions, WeekResponse.class);
		 
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return mealPlannerService.fetchSpoonacularData("day", numCalories, diet, exclusions, DayResponse.class);
		
	}

}