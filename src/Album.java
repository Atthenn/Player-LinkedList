import java.util.ArrayList;

public class Album {

    ArrayList<Song> songs;

    public Album(){
        this.songs = new ArrayList<Song>();

    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }
}
