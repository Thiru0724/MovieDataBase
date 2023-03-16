package musicdirectordb;

public class MusicDirectorCreation {

	public MusicDirector createMusicDirector(int mid, String mname, int mage, char gender) {
		MusicDirector md = new MusicDirector(mid, mname, mage, gender);
		return md;
	}
}
