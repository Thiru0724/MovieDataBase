package com.actordb;

import java.util.HashSet;
import java.util.Set;

public class Actor {

	private int aid;
	private String aname;
	private char gender;
	private int age;
	private Set<Integer> movies=null;
	public Actor(int aid, String aname, char gender, int age) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.gender = gender;
		this.age = age;
		this.movies = new HashSet<Integer>();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int hashCode() {
		return aid;
	}
	public boolean equals(Object arg){
		return this.aid == arg.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + ", gender=" + gender + ", age=" + age + ", movies=" + movies
				+ "]";
	}
	
	public boolean addMovie(Integer movieId) {
		return movies.add(movieId);
	}
	
}
