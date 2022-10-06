package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void calcArea(int length, int breath) {
		double area= 0.5*(length*breath);
		System.out.println("area of Triangle "+area);


	}

}
