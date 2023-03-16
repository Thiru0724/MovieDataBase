package moviedb;

import java.util.Map;
import java.util.Set;

import com.actordb.Actor;

import directordb.Director;
import musicdirectordb.MusicDirector;

public class MovieCreation {

	
	public Movie  createMovie(int movieid, String title, String duration, Map<Actor, Role> actors, Map<Director, Role> directors,
			Map<MusicDirector, Role> musicDirectors) {
	
		Movie m = new Movie(movieid, title, duration, actors, directors, musicDirectors);
		return m;
	}
}
