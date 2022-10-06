package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {
	
	// Autowire by Type
	@Autowired
	@Qualifier("square")
	IShape shape;
	
	// Autowire by name
	@Autowired
	IShape rectangle;
	
    //	Autowire by Constructor
	IShape triangle;
	
	public NewShapeFactory(IShape triangle) {
	super();
	this.triangle = triangle;
}


	public void printArea(String choice,int length,int breath) {
		 System.out.println("Printing area");
		 if(choice.equals("s"))
		 shape.calcArea(length, breath);
		 if(choice.equals("r"))
		 rectangle.calcArea(length, breath);
		 if(choice.equals("t"))
		 triangle.calcArea(length, breath);
	 }

}
