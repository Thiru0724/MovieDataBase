package moviedb;

import java.util.Map;
import java.util.Set;

import com.actordb.Actor;

import directordb.Director;
import musicdirectordb.MusicDirector;

public class Movie {

	private int  movieid;
	private String title;
	private String duration;
	private Map<Actor, Role> actors;
	private Map<Director, Role> directors;
	private Map<MusicDirector, Role> musicDirectors;


	public Movie(int movieid, String title, String duration, Map<Actor, Role> actors, Map<Director, Role> directors,
			Map<MusicDirector, Role> musicDirectors) {
		super();
		this.movieid = movieid;
		this.title = title;
		this.duration = duration;
		this.actors = actors;
		this.directors = directors;
		this.musicDirectors = musicDirectors;
	}


	public int getMovieid() {
		return movieid;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public Map<Actor, Role> getActors() {
		return actors;
	}


	public void setActors(Map<Actor, Role> actors) {
		this.actors = actors;
	}


	public Map<Director, Role> getDirectors() {
		return directors;
	}


	public void setDirectors(Map<Director, Role> directors) {
		this.directors = directors;
	}


	public Map<MusicDirector, Role> getMusicDirectors() {
		return musicDirectors;
	}


	public void setMusicDirectors(Map<MusicDirector, Role> musicDirectors) {
		this.musicDirectors = musicDirectors;
	}


	public int hashCode() {
		return movieid;
	}
	
	public boolean equals(Object arg) {
		return this.movieid == arg.hashCode();
	}
}
