package com.mindtree.pkg.CustomerApplication.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	 private int id;
	 private String name;
	 private int age;
	 public Customer(int id,String name,int age) {
		 super();
		 this.id=id;
		 this.name=name;
		 this.age=age;
	 }
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id= Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public String toString() {
		return "Employee[id="+id+",name="+name+",age="+age+"]";
		
	}

		
	}