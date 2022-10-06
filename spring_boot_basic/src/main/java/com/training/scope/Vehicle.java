package com.training.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:application.properties")
@Scope("prototype")
public class Vehicle {
	
private String name;
private String brand;
private double price;
public String getName() {
	return name;
}
@Value("${vehicle.vehiclename}")
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
@Value("${vehicle.vehiclebrand}")
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
@Value("${vehicle.vehicleprice}")
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", brand=" + brand + ", price=" + price + "]";
}
}
