package directordb;

import java.util.HashSet;
import java.util.Set;

public class DirectorDataBase {

	private Set<Director> directorDB = new HashSet<Director>();
	
	
	
	public Set<Director> getDirectorDB() {
		return directorDB;
	}
	
	public Director getById(int did) {
		for(Director director : directorDB) {
			if(did == director.getDid()) {
				return director;
			}
		}
		return null;
	}

	public void setDirectorDB(Set<Director> directorDB) {
		this.directorDB = directorDB;
	}

	public boolean addDirector(Director director) {
		return directorDB.add(director);
	}
	
public void updateDirectorAge(String dname , int dage) {
		
		for(Director director : directorDB) {
			if(dname.equals(director.getDname())) {
				director.setDage(dage);
				break;
			}
		}
	}
	
	public void DeleteDirector(int did) {
		for(Director director : directorDB) {
			if(did == director.getDid()) {
				directorDB.remove(director);
				break;
			}
		}
	}
	
	public void viewDirector() {
		for(Director director : directorDB) {
			System.out.println("DirectorId:"+director.getDid()+"\t DirectorName:"+director.getDname()+"\t DirectorAge:"+director.getDage()+"\t DirectorGender:"+director.getGender());
		}
	}
	
	
	public boolean addMovieToDirector(Integer did , Integer movieId) {
		boolean flag = false;
		for(Director director : directorDB) {
			if(did == director.getDid()) {
				flag = director.addMovie(movieId);
			}
		}
		return flag;
	}
}
