package com.collegeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.collegeapp.model.Address;
import com.collegeapp.model.College;
import com.collegeapp.model.Department;
import com.collegeapp.model.University;
import com.collegeapp.service.ICollegeService;
import com.collegeapp.service.IUniversityService;

@SpringBootApplication
public class SpringCollegeappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCollegeappApplication.class, args);
	}
	@Autowired
    ICollegeService collegeService;
	@Autowired
	IUniversityService universityService;
	@Override
	public void run(String... args) throws Exception {
		
//		Department depart1=new Department("Java", "Ram");
//		Department depart2=new Department("python", "Shyam");
//		Department depart3=new Department("spring", "Sita");
//		Department depart4=new Department("aws", "john");
//		Set<Department> departmentList=new HashSet<>(Arrays.asList(depart1,depart2));
//		Set<Department> departmentList2=new HashSet<>(Arrays.asList(depart3));
//		Set<Department> departmentList3=new HashSet<>(Arrays.asList(depart4));
//		Address address=new Address("Bhopal","MP",465033);
//		Address address2=new Address("Bengalore","Karnataka",679245);
//	Address add3=new Address("indore","MP",465678);
////		
//		College coll1=new College("IIT Bhopal", departmentList2,address);
//	College coll2=new College("IIT Bengalore",  departmentList,address2);
//	    College coll3=new College("SGSIT",  departmentList3,add3);
//	    
//	   Set<College> collegelist=new HashSet<>(Arrays.asList(coll1,coll2));
//	  Set<College> collegelist2=new HashSet<>(Arrays.asList(coll3));
//	    
//	   University university=new University("RGPV", "Bhopal",collegelist);
//	 University university2=new University("IIT", "Delhi",collegelist2);
//	    
// //  collegeService.addCollege(coll1);
// //      collegeService.addCollege(coll2);
//  //      collegeService.addCollege(coll3);
////	    
//    universityService.addUniversity(university);
//    universityService.addUniversity(university2);
////	    
//	    
	  University university=new University()  
	    
	}

}
