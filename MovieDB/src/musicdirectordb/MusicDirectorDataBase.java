package musicdirectordb;

import java.util.HashSet;
import java.util.Set;

public class MusicDirectorDataBase {

	private Set<MusicDirector> musicDirectorDB = new HashSet<MusicDirector>();



	public Set<MusicDirector> getMusicDirectorDB() {
		return musicDirectorDB;
	}
	
	public MusicDirector getById(int mid) {
		for(MusicDirector musicDirector : musicDirectorDB) {
			if(mid == musicDirector.getMid()) {
				return musicDirector;
			}
		}
		return null;
	}

	public void setMusicDirectorDB(Set<MusicDirector> musicDirectorDB) {
		this.musicDirectorDB = musicDirectorDB;
	}

	public boolean addMusicDirector(MusicDirector musicDirector) {
		return musicDirectorDB.add(musicDirector);
	}

	public void updateMusicDirectorAge(String mname , int mage) {

		for(MusicDirector musicDirector : musicDirectorDB) {
			if(mname.equals(musicDirector.getMname())) {
				musicDirector.setMage(mage);
				break;
			}
		}
	}

	public void DeleteMusicDirector(int mid) {
		for(MusicDirector musicDirector : musicDirectorDB) {
			if(mid == musicDirector.getMid()) {
				musicDirectorDB.remove(musicDirector);
				break;
			}
		}
	}

	public void viewMusicDirector() {
		for(MusicDirector musicDirector : musicDirectorDB) {
			System.out.println("MusicDirectorId:"+musicDirector.getMid()+"\t MusicDirectorName:"+musicDirector.getMname()+"\t MusicDirectorAge:"+musicDirector.getMage()+"\t MusicDirectorGender:"+musicDirector.getGender());
		}
	}
	
	public boolean addMovieToMusicDirector(Integer mid , Integer movieId) {
		boolean flag = false;
		for(MusicDirector musicDirector : musicDirectorDB) {
			if(mid == musicDirector.getMid()) {
				flag = musicDirector.addMovie(movieId);
			}
		}
		return flag;
	}
}
