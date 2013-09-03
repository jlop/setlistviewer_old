package jlop.onstage.setlistviewer.datamodel;

public class SongPart {
	
	private ISongPage _songPage;
	private ISound _sound;
	
	public void show() {
		_songPage.show();
		_sound.setSound();
	}

}
