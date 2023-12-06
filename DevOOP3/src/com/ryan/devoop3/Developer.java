package com.ryan.devoop3;

import java.util.ArrayList;

public class Developer {

	    private static int devCount;
	    private static double totalSalary;
	    private String name;
	    private int age;
	    private double salary;
	    private ArrayList<String> languages = new ArrayList<String>();
	    
	    // ------------ constructors ------------------
	    public Developer(){
	        Developer.devCount++;
	    }
	    
	    public Developer(String name) {
	    	this.name = name;
	    	Developer.devCount++;
	    }

	    public Developer(int age, double salary){
	        this.name = "no name";
	        this.age = age;
	        this.salary = salary;
	        Developer.totalSalary += salary;
	        Developer.devCount++;
	    }

	    public Developer(String name, int age, double salary){
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        Developer.totalSalary += salary;
	        Developer.devCount++;
	    }
	    
	 // ------------ other class methods --------------------
	    public void displayStatus(){
	        System.out.println("name: " + this.name);
	        System.out.println("salary: " + this.salary);
	        System.out.println("age: " + this.age);
	        System.out.println("languages: " + this.languages);
	    }

	    public void addLanguage(String language){
	        this.languages.add(language);
	    }

		public static int getDevCount() {
			return devCount;
		}

		public static void setDevCount(int devCount) {
			Developer.devCount = devCount;
		}

		public static double getTotalSalary() {
			return totalSalary;
		}

		public static void setTotalSalary(double totalSalary) {
			Developer.totalSalary = totalSalary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public ArrayList<String> getLanguages() {
			return languages;
		}

		public void setLanguages(ArrayList<String> languages) {
			this.languages = languages;
		}

	    
}
