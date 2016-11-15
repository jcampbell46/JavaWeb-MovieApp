package edu.cvtc.web.view;

import java.util.List;

import edu.cvtc.web.model.Movie;

public class MovieView {

	public static String buildHTML(List<Movie> movies) {
		final StringBuilder out = new StringBuilder();
		
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>Movie List</title>\n\t</head>\n\t<body>");
		out.append("\n\t\t<nav>");
		out.append("\n\t\t\t<ul>");
		out.append("\n\t\t\t\t<li><a href='Home'>Home</a></li>");
		out.append("\n\t\t\t\t<li><a href='SortByTitle'>Sort By Title</a></li>");
		out.append("\n\t\t\t\t<li><a href='SortByDirector'>Sort By Director</a></li>");
		out.append("\n\t\t\t\t<li><a href='SortByLength'>Sort By Length</a></li>");
		out.append("\n\t\t\t</ul>");
		out.append("\n\t\t</nav>");
		out.append("\n\t\t<br><br>");
		out.append("\n\t\t<h1>Movie List</h1>");
		
		for(final Movie movie : movies) {
			
			out.append("\n\t\t<div class='movie'>");
			out.append("\n\t\t\t<h2>" + movie.getTitle() + "</h2>");
			out.append("\n\t\t\t<p>Directed by: " + movie.getDirector() + "   Length: " + movie.getLengthInMinutes() + " minutes</p>");
			out.append("\n\t\t</div>");
			
		}
		
		out.append("\n\t\t<p>&copy; Copyright 2016 Jordan Campbell</p>\n\t</body>\n</html>");
		
		return out.toString();
	}
	
}
