package com.mpokketapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class ApiErrors {
LocalDateTime tiestamp;
String message;
int status;
List<String> error;
public ApiErrors() {
	super();
	// TODO Auto-generated constructor stub
}
public ApiErrors(LocalDateTime tiestamp, String message, int status, List<String> error) {
	super();
	this.tiestamp = tiestamp;
	this.message = message;
	this.status = status;
	this.error = error;
}
public LocalDateTime getTiestamp() {
	return tiestamp;
}
public void setTiestamp(LocalDateTime tiestamp) {
	this.tiestamp = tiestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public List<String> getError() {
	return error;
}
public void setError(List<String> error) {
	this.error = error;
}
@Override
public String toString() {
	return "ApiErrors [tiestamp=" + tiestamp + ", message=" + message + ", status=" + status + ", error=" + error + "]";
}


}
