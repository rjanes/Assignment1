package com.caloriecounter.assignment1;
/*
 * This is the user class that creates and saves a user.
 */
public class User {

	private String name;
	private double age, weight, height;
	//Constructor for User
	public User(String name, double age, double weight, double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
	//Returns All info on user
	public String toString(){
		return name;
	}
	
	//GETTERS
	public String getName(){
		return name;
	}
	
	public double getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	//END GETTERS
	
	//SETTERS
	public void setName(String name){
		this.name = name;
	}
	public void setAge(double age){
		this.age = age;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setHeight(double height){
		this.height = height;
	}
}

