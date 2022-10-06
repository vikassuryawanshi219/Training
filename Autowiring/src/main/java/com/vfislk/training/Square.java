package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape {

	@Override
	public void calcArea(int length, int breath) {
		double area= length*breath;
		System.out.println("area of Square"+area);


	}

}
