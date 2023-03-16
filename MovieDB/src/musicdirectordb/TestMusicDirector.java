package musicdirectordb;

public class TestMusicDirector {

	public static void main(String[] args) {


		MusicDirectorCreation mdc = new MusicDirectorCreation();
		
		MusicDirector m1 = mdc.createMusicDirector(301, "Thaman", 38, 'm');
		
		MusicDirectorOperation mdop = new MusicDirectorOperation();
		
		mdop.insertMusicDirector(m1);
		
        m1 = mdc.createMusicDirector(302, "DeviSriPrasad", 37, 'm');
        
        mdop.insertMusicDirector(m1);
        
        mdop.listMusicDirector();
        System.out.println();
        
        mdop.updateByAge("Thaman", 40);
        
        mdop.listMusicDirector();
        System.out.println();
        
        mdop.DeleteMusicDirectorById(302);
        
        mdop.listMusicDirector();
		
	}
}
