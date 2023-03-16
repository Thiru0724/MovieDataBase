package directordb;

public class DirectorCreation {

	public Director creatDirector(int did, String dname, int dage, char gender) {
		Director d = new Director(did, dname, dage, gender);
		return d;
	}

}
