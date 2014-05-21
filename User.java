class User {
	String id;
	Track[] tracks;
	int trackCount;

	User() {
		tracks = new Track[3];
		trackCount = 0;
	}

	boolean addTrack(Track t) {
		if (trackCount < tracks.length()) {
			tracks[trackCount] = t;
			trackCount++;
			return true;
		} else {
			return false;
		}
	}
}