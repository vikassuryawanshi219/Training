package com.collegeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class University {
	@Id
	@GeneratedValue(generator = "university_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "university_id", sequenceName = "university_id")	
    private Integer UniversityId;
    private String universityName;
    private String universityCity;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id")
   private Set<College> collegeList;

public University() {
	super();
	// TODO Auto-generated constructor stub
}

public University(String universityName, String universityCity, Set<College> collegeList) {
	super();
	this.universityName = universityName;
	this.universityCity = universityCity;
	this.collegeList = collegeList;
}

public Integer getUniversityId() {
	return UniversityId;
}

public void setUniversityId(Integer universityId) {
	UniversityId = universityId;
}

public String getUniversityName() {
	return universityName;
}

public void setUniversityName(String universityName) {
	this.universityName = universityName;
}

public String getUniversityCity() {
	return universityCity;
}

public void setUniversityCity(String universityCity) {
	this.universityCity = universityCity;
}

public Set<College> getCollegeList() {
	return collegeList;
}

public void setCollegeList(Set<College> collegeList) {
	this.collegeList = collegeList;
}

@Override
public String toString() {
	return "University [universityName=" + universityName + ", universityCity=" + universityCity + ", collegeList="
			+ collegeList + "]";
}


   
}
