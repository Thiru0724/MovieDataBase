package moviedb;

import com.actordb.Actor;

public class MovieOperation {

	final static private MovieDataBase movieDBRef = new MovieDataBase();
	
	public boolean insertMovie(Movie movie) {
		return movieDBRef.addMovie(movie);
	}
	
	public void listMovie() {
		movieDBRef.viewMovie();
	}
	
	public Movie getMoviesById(int movieId) {
		return movieDBRef.getMovieById(movieId);
	}
	
	public void DeleteMovieById(int movieid) {
		movieDBRef.DeleteMovie(movieid);
	}

}
