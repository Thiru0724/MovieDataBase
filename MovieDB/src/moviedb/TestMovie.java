package moviedb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.actordb.Actor;
import com.actordb.ActorCreation;
import com.actordb.ActorOperation;

import directordb.Director;
import directordb.DirectorCreation;
import directordb.DirectorOperation;
import musicdirectordb.MusicDirector;
import musicdirectordb.MusicDirectorCreation;
import musicdirectordb.MusicDirectorOperation;

public class TestMovie {

	public static void main(String[] args) {
		Set<Actor> m1actors = new HashSet<Actor>();
		Set<Director> m1directors = new HashSet<Director>();
		Set<MusicDirector> m1musicDirectors = new HashSet<MusicDirector>();
		
		ActorCreation ac = new ActorCreation();
		Actor a1 = ac.createActor(101, "prabash", 'm', 40);
		ActorOperation aop = new ActorOperation();
		aop.insertActor(a1);
		a1 = ac.createActor(102, "rana", 'm', 38);
		aop.insertActor(a1);
		a1 = ac.createActor(103, "Anushka", 'f', 39);
		aop.insertActor(a1);
		a1 = ac.createActor(104, "Thamana", 'f', 35);
		aop.insertActor(a1);
		
//Movie1 set of actors storing 		
//		for(Actor actor : aop.getSetOfActors()) {
//			if(actor.getAid()==101 || actor.getAid()==102 || actor.getAid()==103) {
//				m1actors.add(actor);
//			}
//		}
		
		Map<Actor, Role> map1 = new HashMap<Actor, Role>();
		map1.put(aop.getActorById(101), Role.Hero);
		map1.put(aop.getActorById(102), Role.villain);
		map1.put(aop.getActorById(103), Role.Heroine);
		
		DirectorCreation dc = new DirectorCreation();
		Director d1 = dc.creatDirector(201, "Rajamouli", 45, 'm');
		DirectorOperation dop = new  DirectorOperation();
		dop.insertDirector(d1);
		Map<Director, Role> map2 = new HashMap<Director, Role>();
		map2.put(dop.getDirectorById(201), Role.Director);
		
		MusicDirectorCreation mdc = new MusicDirectorCreation();
		MusicDirector md1 = mdc.createMusicDirector(301, "Kiravani", 45, 'm');
		MusicDirectorOperation mdop = new MusicDirectorOperation();
		mdop.insertMusicDirector(md1);
		Map<MusicDirector, Role> map3 = new HashMap<MusicDirector, Role>();
		map3.put(mdop.getMusicDirectorById(301), Role.MusicDirector);
		
		
		MovieCreation mc = new MovieCreation();
		Movie m1 = mc.createMovie(401, "Bahubali", "2.5 hours", map1, map2, map3);
		MovieOperation mop = new MovieOperation();
		mop.insertMovie(m1);
		
		Movie m = mop.getMoviesById(401);
		if(m != null) {
			Map<Actor , Role> actorMap  = m.getActors();
			Set<Actor> actors = actorMap.keySet();
			for(Actor actor : actors) {
				actor.addMovie(m.getMovieid());
			}
			
		    Map<Director, Role> directorMap = m.getDirectors();
		    Set<Director> directors = directorMap.keySet();
		    for(Director director : directors) {
		    	director.addMovie(m.getMovieid());
		    }
		    
		    Map<MusicDirector, Role> musicDirectorMap = m.getMusicDirectors();
		    Set<MusicDirector> musicdirectors = musicDirectorMap.keySet();
		    for(MusicDirector musicDirector : musicdirectors) {
		    	musicDirector.addMovie(m.getMovieid());
		    }
		    		
		}
			
		mop.listMovie();
		
				
	}
}
