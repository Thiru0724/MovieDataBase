package com.actordb;

public class ActorCreation {

	public Actor createActor(int aid, String aname, char gender, int age) {
		Actor actor = new Actor(aid, aname, gender, age);
		return actor;
	}
}
