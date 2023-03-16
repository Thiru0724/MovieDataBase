package com.actordb;

import java.util.Set;

public class ActorOperation {
	final static private  ActorDataBase actorDBRef = new ActorDataBase();
	
	public boolean insertActor(Actor actor) {
		return actorDBRef.addActor(actor);
	}
	
	public void listActor() {
		actorDBRef.viewActors();
	}
	
	public void updateByAge(String aname , int age) {
		actorDBRef.updateActorAge(aname, age);
	}
	
	public void DeleteActorById(int aid) {
		actorDBRef.DeleteActor(aid);
	}
	
	public Actor getActorById(int aid) {
		return actorDBRef.getById(aid);
	}
	
	public Set<Actor> getSetOfActors(){
		return actorDBRef.getActDB();
	}
	
	public boolean updateMovieInActor(Integer aid , Integer movieId) {
		return actorDBRef.addMovieToActor(aid, movieId);
	}

}
