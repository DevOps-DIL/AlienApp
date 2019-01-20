package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;



import org.hibernate.envers.Audited;

@Entity
@Audited(withModifiedFlag=true)
public class Coche {
	@Id
	private int id;
	
	private String name;
	
	private String color;
	
	private int year;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return year;
	}
	public void setAge(int age) {
		this.year = age;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + ", age=" + year + "]";
	}

	
}
