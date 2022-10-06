package com.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.product.basic.Product;



public class ProductController {
	
	@RequestMapping("/showForm")
	public String addForm() {
		
	return "addform";
	}
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProduct(Product product) {
		
	return "success";

}
}