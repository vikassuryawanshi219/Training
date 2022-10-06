package com.mpokketapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.repository.IUserRepository;

@SpringBootTest
class SpringCapstoneprojectMpokketApplicationTests {
	@Autowired
	IUserRepository userRepository;
@Test
	public void createUser() {
	User u=new User();
	u.setUserId(2);
	u.setDob(LocalDate.of(1997, 11, 10));
	u.setMobileNo("9567893213");
	u.setUserType(UserType.ENTREPRENEUR);
	
	u.setUserName("bob");
	u.setAdharNo(1233748);
	u.setEmi(2600.0);
	u.setPrincipalAmount(50000.0);
	userRepository.save(u);
	assertNotNull(userRepository.findById(2).get());
		
	}

@Test
public void testGetAll() {
	List<User> userList=userRepository.findAll();
	assertThat (userList).size().isGreaterThan(0);
	
}
@Test
public void testUpdateUser() {
	User u=userRepository.findById(2).get();
	u.setUserType(UserType.STUDENT);
	
	userRepository.save(u);
	assertNotEquals(UserType.EMPLOYEE, userRepository.findById(2).get());
}


}
