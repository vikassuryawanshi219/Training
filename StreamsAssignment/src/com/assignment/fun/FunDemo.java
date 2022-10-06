package com.assignment.fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
		Function<String,List<String>> fun=(str)->{
			List<String> list=new ArrayList<String>();
			String[] string=str.split("");
					for(String value:string){
						list.add(value);
					}
					return list;
		};
		
		System.out.println(fun.apply("java is fun"));

	}
	

}
