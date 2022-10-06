package com.training.javabase;

public class Features {
String os;
String processor;
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
@Override
public String toString() {
	return "Features [os=" + os + ", processor=" + processor + "]";
}
}
