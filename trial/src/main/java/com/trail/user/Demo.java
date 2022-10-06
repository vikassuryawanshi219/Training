package com.trail.user;

import java.util.List;
import java.util.Scanner;

import com.trial.service.Delivery;

public class Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Delivery delivery = new Delivery();

		String msg = delivery.greetMessage("priya");
		System.out.println(msg);

		System.out.println("whic food you want??");
		String type = sc.next();

		List<String> typeOfFood = delivery.ShowFood(type);
		System.out.println(typeOfFood);
	}

}
