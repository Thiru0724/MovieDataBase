package musicdirectordb;

import java.util.HashSet;
import java.util.Set;

public class MusicDirector {

	private int mid;;
	private String mname;
	private int mage;
	private char gender;
	private Set<Integer> movies=null;
	public MusicDirector(int mid, String mname, int mage, char gender) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mage = mage;
		this.gender = gender;
		this.movies = new HashSet<Integer>();
				
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int hashCode() {
		return mid;
	}
	public boolean equals(Object arg) {
		return this.mid == arg.hashCode();
	}
	
	@Override
	public String toString() {
		return "MusicDirector [mid=" + mid + ", mname=" + mname + ", mage=" + mage + ", gender=" + gender + ", movies="
				+ movies + "]";
	}
	
	public boolean addMovie(Integer movieId) {
		return movies.add(movieId);
	}
	
	
	
}
