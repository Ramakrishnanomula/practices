package com.ty.springboot_restapi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column       				// this @column makes every variable as a column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private long num;
	
	public Student() {
		super();
		
	}
	public Student(int id, String name, int age, long num, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.num = num;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", num=" + num + ", loc=" + loc + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	private String loc;
	

}
