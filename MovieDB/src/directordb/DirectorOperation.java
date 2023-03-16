package directordb;

import java.util.Set;

public class DirectorOperation {

	final static private DirectorDataBase directorDBRef = new DirectorDataBase();
	
	public boolean insertDirector(Director director) {
		return directorDBRef.addDirector(director);
	}
	public Director getDirectorById(int did) {
		return directorDBRef.getById(did);
	}
	
	
	public void listDirector() {
		directorDBRef.viewDirector();
	}
	
	public void updateByAge(String dname , int dage) {
		directorDBRef.updateDirectorAge(dname, dage);
	}
	
	public void DeleteDirectorById(int did) {
		directorDBRef.DeleteDirector(did);
	}
	
	public Set<Director> getSetOfDirectors() {
		return directorDBRef.getDirectorDB();
	}
	
	public boolean updateMovieInDirector(Integer did , Integer movieId) {
		return directorDBRef.addMovieToDirector(did, movieId);
	}

}
