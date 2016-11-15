package edu.cvtc.web.model;

public class Movie {

	private String title;
	private String director;
	private Integer lengthInMinutes;
	
	public Movie(String title, String director, Integer lengthInMinutes) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public Integer getLengthInMinutes() {
		return lengthInMinutes;
	}
	
}
