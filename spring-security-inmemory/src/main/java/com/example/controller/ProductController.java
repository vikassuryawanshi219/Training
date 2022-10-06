package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/")
    public String welcome(){
	return "welcome online store";
	
}
	
	@GetMapping("/products")
    public List<String> show(){
	return Arrays.asList("laptope","mobile");
	
}
	@GetMapping("/admin/add-product")
    public String add() {
		
	return "product added";
	
}
	@GetMapping("/admin/delete-product")
    public String delete() {
		
	return "product deleted";
	
}
	@GetMapping("/products/{type}")
    public List<String> showBYType(@PathVariable("type")String type) {
		if(type.equalsIgnoreCase("sports"))
				
	        return Arrays.asList("bat","ball");
		else
			return Arrays.asList("laptope","mobile");
	
}
	
}
