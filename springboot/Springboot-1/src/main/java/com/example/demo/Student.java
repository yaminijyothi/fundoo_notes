package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private String name;
private int id;
private String cource;

public String getCource() {
	return cource;
}
public void setCource(String cource) {
	this.cource = cource;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
