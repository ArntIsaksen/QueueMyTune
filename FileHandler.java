import java.io.File;
import java.io.IOException;

class FileHandler {
	String musicFolder;

	boolean setMusicFolder(String name) {
		// Add directory check.
		musicFolder = name;
		return true;
	}

	public static void printPaths(File folder){
		String n = folder.getName();
		// If the name of the folder doesn't start with a "."
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