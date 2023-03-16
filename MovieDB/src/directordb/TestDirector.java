package directordb;

public class TestDirector {

	public static void main(String[] args) {
		
		DirectorCreation dc = new DirectorCreation();
		
		Director d1 = dc.creatDirector(201, "Rajamouli", 50, 'm');
		
		DirectorOperation dop = new DirectorOperation();
		
		dop.insertDirector(d1);
		
		d1 = dc.creatDirector(202, "purijaganadh", 45, 'm');
		
		dop.insertDirector(d1);
		
		dop.listDirector();
	}
}
