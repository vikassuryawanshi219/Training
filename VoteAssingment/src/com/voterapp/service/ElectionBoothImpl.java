package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {
	private String[] localities= {"bhopal","indoor","bangalore"};

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InvalidVoterException {
		try{
			checkAge(age);
		
		checkLocality( locality);
		checkVoterId( vid);
		}
		catch(InvalidVoterException e) {
			throw e;
		}
		return true;
	}

	private boolean checkAge(int age) throws UnderAgeException{
	if (age>18) {
		return true;
	}
	else {
		throw new UnderAgeException("you are under age");
		
	}
}
	private boolean checkLocality(String locality) throws LocalityNotFoundException{
		for(String place:localities) {
			if (locality.equals(place)) {
				return true;
			}
			
		}throw new LocalityNotFoundException("location not found");
	}

	private boolean checkVoterId(int vid) throws NoVoterIDException{
		if (vid<100||vid>9999) {
			throw new NoVoterIDException("voter id number not valid");
			
		}
	 return true;
	}
}
