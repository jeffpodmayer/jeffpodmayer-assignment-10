package com.coderscampus.a10.spoonacular.dto;

public class Meals {
	private Long id;
	private String imageType;
	private String title;
	private Integer readyInMinutes;
	private Integer servings;
	private String sourceURL;

	public Meals(Long id, String imageType, String title, Integer readyInMinutes, Integer servings, String sourceURL) {
		this.id = id;
		this.imageType = imageType;
		this.title = title;
		this.readyInMinutes = readyInMinutes;
		this.servings = servings;
		this.sourceURL = sourceURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSourceURL() {
		return sourceURL;
	}

	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}

}
