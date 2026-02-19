public class PlaylistDemo {

    public static void main(String[] args) {
        Playlist songs = new Playlist();

        songs.addSong(new Song("Blinding Lights", "The Weeknd"));
        songs.addSong(new Song("Faint", "Linkin Park"));
        songs.addSong(new Song("Burried Alive", "Avenged Sevenfold"));
        songs.addSong(new Song("Instant Crush", "Daft Punk"));
        // Adding another Daft Punk song for countArtist testing.
        songs.addSong(new Song("Infinity Repeating (2013 demo)", "Daft Punk"));

        // Priniting out playlist
        songs.printAllSongs();

        // Print how many songs we have from Daft Punk
        int artistCount = songs.countArtist("Daft Punk");
        System.out.println();
        System.out.println("=====================================");
        System.out.println("   COUNTING SONGS BY SPECIFIC ARTIST ");
        System.out.println("=====================================");
        System.out.println("Daft Punk appears " + artistCount + " times.");
        System.out.println();

        // remove every song from the bag until there are no longer anymore
        System.out.println("=====================================");
        System.out.println("        REMOVING ALL SONGS           ");
        System.out.println("=====================================");

        while (!songs.isEmpty()) // Will keep going as long as boolea condition is true (while not empty)
        {
            Song s = songs.removeSong();
            System.out.println("Removed: " + s.getTitle() + " - " + s.getArtist());
        }

        System.out.println("-------------------------------------");

        // lets test out if our bag truly did get removed
        boolean isEmpty = songs.isEmpty();
        // If it is empty, say that there are no songs in our playlist
        if (isEmpty) {
            System.out.println("No songs in your playlist!");
        // else, print out the songs (shoulnt be the case as our playlist is now empty)
        } else {
            songs.printAllSongs();
        }
    }
}