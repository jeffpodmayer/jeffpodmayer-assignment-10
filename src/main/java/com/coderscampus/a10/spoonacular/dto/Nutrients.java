package com.coderscampus.a10.spoonacular.dto;

public class Nutrients {
	private Double calories;
	private Double protien;
	private Double fat;
	private Double carbohydrates;

	public Nutrients(Double calories, Double protien, Double fat, Double carbohydrates) {
		this.calories = calories;
		this.protien = protien;
		this.fat = fat;
		this.carbohydrates = carbohydrates;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getProtien() {
		return protien;
	}

	public void setProtien(Double protien) {
		this.protien = protien;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

}
