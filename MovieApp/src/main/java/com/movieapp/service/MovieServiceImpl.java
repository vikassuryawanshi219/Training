package com.movieapp.service;


import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLanguage(String language) {
	if (language.equals("hindi")) {
		return Arrays.asList("Krrish","Ra.one");
	}
	else if
		(language.equals("punjabi")) {
		return Arrays.asList("udada punjab");
				}
	else if
		(language.equals("urdu"))
		return Arrays.asList("alamhar");
	else 
	    
		return Arrays.asList("Avengers");
}

}
