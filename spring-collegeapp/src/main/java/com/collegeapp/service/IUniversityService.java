package com.collegeapp.service;


import com.collegeapp.model.University;

public interface IUniversityService {
	
	University addUniversity(University university);
	void updateUniversity(University university);
	University getUniversityById(int universityId);
	void deleteUniversity(int universityId);


}
