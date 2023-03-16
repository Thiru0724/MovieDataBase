package com.actordb;

public class TestActor {

	public static void main(String[] args) {
		
		ActorCreation ac = new ActorCreation();
		Actor a1 = ac.createActor(101, "Prabash", 'm',40);
		
		ActorOperation aop = new ActorOperation();
		 
		aop.insertActor(a1);
		
		a1 = ac.createActor(102, "MaheshBabu", 'm', 42);
		
		aop.insertActor(a1);
		
		aop.listActor();
		System.out.println();
		
		aop.updateByAge("Prabash", 41);
		
		aop.listActor();
		System.out.println();
		
		aop.DeleteActorById(101);
		
		aop.listActor();
		
	}
}
