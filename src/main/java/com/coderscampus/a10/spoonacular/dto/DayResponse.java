package com.coderscampus.a10.spoonacular.dto;

public class DayResponse {
	private Meals meals;
	private Nutrients nutrients;

	public DayResponse(Meals meals, Nutrients nutrients) {
		this.meals = meals;
		this.nutrients = nutrients;
	}

	public Meals getMeals() {
		return meals;
	}

	public void setMeals(Meals meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}
