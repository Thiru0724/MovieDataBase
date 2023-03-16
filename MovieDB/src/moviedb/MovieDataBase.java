package moviedb;

import java.util.HashSet;
import java.util.Set;

public class MovieDataBase {

	private Set<Movie> movieDB = new HashSet<Movie>();
	
	public boolean addMovie(Movie movie) {
		return movieDB.add(movie);
	}
	
	public Movie getMovieById(int movieId) {
		for(Movie movies : movieDB) {
			if(movieId == movies.getMovieid()) {
				return movies;
			}
		}
		return null;
	}
	

	
	public void DeleteMovie(int movieid) {
		for(Movie movie : movieDB) {
			if(movieid == movie.getMovieid()) {
				movieDB.remove(movie);
				break;
			}
		}
	}
	
	public void viewMovie() {
		for(Movie movie : movieDB) {
			System.out.println("MovieId:"+movie.getMovieid()+"\n MovieTittle:"+movie.getTitle()+"\n MovieDuration:"+movie.getDuration()+"\n MovieActors:"+movie.getActors()+"\n MovieDirectors:"+movie.getDirectors()+"\n MovieMusicdirector:"+movie.getMusicDirectors());
		}
	}

}
