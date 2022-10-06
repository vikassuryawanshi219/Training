package com.collegeapp.service;

import com.collegeapp.model.College;

public interface ICollegeService {
	
	College addCollege(College college);
	void updateHotel(College college);
	College getCollegeById(int collegeId);
	void deleteCollege(int collegeId);


}
