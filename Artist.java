class Artist {
	String name;
	ArrayList<Album> albums;

	Artist(String name) {
		this.name = name;
		albums = new ArrayList<Album>();
	}

	void addAlbum(Album a) {
		albums.add(a);
	}

	int nrOfAlbums() {
		return albums.size();
	}
}