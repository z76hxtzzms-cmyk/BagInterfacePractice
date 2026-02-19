public class Playlist {

    private BagInterface<Song> songs;

    public Playlist() {
        songs = new ArrayBag<>(); // Array bag will not be in this folder.
    }

    public boolean addSong(Song s) {
        return songs.add(s);
    }

    public Song removeSong() {
        return songs.remove();
    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public void printAllSongs() {
        System.out.println("Now Printing Your Playlist");
        System.out.println("==========================");
        for (Song s : songs.toArray()) {
            System.out.println("Title: " + s.getTitle() + "\nArtist: " + s.getArtist());
            System.out.println("-----------------------------------------------------");
        }
    }

    public int countArtist(String artist) {
        int count = 0;
        for (Song s : songs.toArray()) {
            if (s.getArtist().equals(artist))
                count++;
        }
        return count;
    }

}