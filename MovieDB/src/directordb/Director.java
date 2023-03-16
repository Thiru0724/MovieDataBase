package directordb;

import java.util.HashSet;
import java.util.Set;

public class Director {

	private int did;
	private String dname;
	private int dage;
	private char gender;
	private Set<Integer> movies=null;
	public Director(int did, String dname, int dage, char gender) {
		super();
		this.did = did;
		this.dname = dname;
		this.dage = dage;
		this.gender = gender;
		this.movies = new HashSet<Integer>();
				
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDage() {
		return dage;
	}
	public void setDage(int dage) {
		this.dage = dage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int hashCode() {
		return did;
	}
	public boolean equals(Object arg) {
		return this.did == arg.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "Director [did=" + did + ", dname=" + dname + ", dage=" + dage + ", gender=" + gender + ", movies="
				+ movies + "]";
	}
	
	public boolean addMovie(Integer movieId) {
		return movies.add(movieId);
	}
	
	
}
