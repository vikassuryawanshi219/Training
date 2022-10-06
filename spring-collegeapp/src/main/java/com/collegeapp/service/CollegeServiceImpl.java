package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.model.College;
import com.collegeapp.repository.ICollegeRepository;

@Service
public class CollegeServiceImpl implements ICollegeService {
    @Autowired
	ICollegeRepository collegeRepository;
	@Override
	public College addCollege(College college) {
		
		return collegeRepository.save(college);
	}

	@Override
	public void updateHotel(College college) {
		collegeRepository.save(college);

	}

	@Override
	public College getCollegeById(int collegeId) {
		
		return collegeRepository.findById(collegeId).get();
	}

	@Override
	public void deleteCollege(int collegeId) {
		collegeRepository.deleteById(collegeId);

	}

}
