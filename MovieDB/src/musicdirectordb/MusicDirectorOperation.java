package musicdirectordb;

import java.util.Set;

public class MusicDirectorOperation {

	final static private MusicDirectorDataBase musDirDBRef = new MusicDirectorDataBase();
	
	public boolean insertMusicDirector(MusicDirector musicDirector) {
		return musDirDBRef.addMusicDirector(musicDirector);
	}
	
	public void listMusicDirector() {
		musDirDBRef.viewMusicDirector();
	}
	
	public MusicDirector getMusicDirectorById(int mid) {
		return musDirDBRef.getById(mid);
	}
	
	
	public void updateByAge(String mname , int mage) {
		musDirDBRef.updateMusicDirectorAge(mname, mage);
	}
	
	public void DeleteMusicDirectorById(int mid) {
		musDirDBRef.DeleteMusicDirector(mid);
	}

	public Set<MusicDirector> getSetOfMusicDirector(){
		return musDirDBRef.getMusicDirectorDB();
	}
	public boolean updateMovieInMusicDirector(Integer mid , Integer movieId) {
		return musDirDBRef.addMovieToMusicDirector(mid, movieId);
	}
}
