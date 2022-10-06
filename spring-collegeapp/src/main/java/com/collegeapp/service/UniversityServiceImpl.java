package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.model.University;
import com.collegeapp.repository.IUniversityRepository;
@Service
public class UniversityServiceImpl implements IUniversityService {
	
	@Autowired
    IUniversityRepository universityRepository;
	
	@Override
	public University addUniversity(University university) {
	
		return universityRepository.save(university);
	}

	@Override
	public void updateUniversity(University university) {
		universityRepository.save(university);

	}

	@Override
	public University getUniversityById(int universityId) {
	
		return universityRepository.findById(universityId).get();
	}

	@Override
	public void deleteUniversity(int universityId) {
		universityRepository.deleteById(universityId);

	}

}
