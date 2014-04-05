import java.io.File;
import java.io.IOException;

class FileHandler {
	String musicFolder;

	boolean setMusicFolder(String name) {
		musicFolder = name;
		return true;
	}

	public static void printPaths(File folder){
		String n = folder.getName();
		if(!n.startsWith(".")) {
			System.out.println(folder.getAbsoluteFile());
			if(folder.isDirectory()) {
				String[] subNote = folder.list();

				for(String filename : subNote) {
					printPaths(new File(folder, filename));
				}
			}
		}

	}
}