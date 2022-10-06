package com.training.javabase;

public class Mobile {
	private String model;
	private String brand;
	
	
	private Features features;
	

	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", features=" + features + "]";
	}

}
