package com.actordb;

import java.util.HashSet;
import java.util.Set;

public class ActorDataBase {

	private Set<Actor> actDB = new HashSet<Actor>();



	public Set<Actor> getActDB() {
		return actDB;
	}

	public void setActDB(Set<Actor> actDB) {
		this.actDB = actDB;
	}

	public boolean addActor(Actor actor) {
		return actDB.add(actor);
	}

	public Actor getById(int aid) {
		for(Actor actor : actDB) {
			if(aid == actor.getAid()) {
				return actor;
			}
		}
		return null;
	}

	public void updateActorAge(String aname , int age) {

		for(Actor actor : actDB) {
			if(aname.equals(actor.getAname())) {
				actor.setAge(age);
				break;
			}
		}
	}

	public void DeleteActor(int aid) {
		for(Actor actor : actDB) {
			if(aid == actor.getAid()) {
				actDB.remove(actor);
				break;
			}
		}
	}

	public void viewActors() {
		for(Actor actor : actDB) {
			System.out.println("ActorId"+actor.getAid()+"\t ActorName:"+actor.getAname()+"\t ActorAge:"+actor.getAge()+"\t ActorGender:"+actor.getGender());
		}
	}

	public boolean addMovieToActor(Integer aid , Integer movidId) {
		boolean flag = false;
		for(Actor actor : actDB) 
		{
			if(aid == actor.getAid()) 
			{
				flag = actor.addMovie(movidId);
			}
		}
		return flag;
	}
}
