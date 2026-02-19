public class Playlist {

    private BagInterface<Song> songs;

    /*
     * Constructor for the playlist class. Initializes the songs bag to an ArrayBag,
     * which is a simple implementation of a bag that uses an array to store its
     * elements.
     * The ArrayBag class is not included in this folder, but it provides basic
     * functionalities
     * such as adding, removing, and checking if the bag is empty.
     */
    public Playlist() {
        songs = new ArrayBag<>();
    }

    /**
     * Method that adds a song to the playlist.
     * 
     * @param s The song to be added to the playlist.
     * @return true if the song was successfully added, false otherwise.
     */

    /*
     * NOTE: The addSong method accepts a parameter. This parameter is of type Song,
     * which is
     * a class that represents a song with a title and an artist. (look at Song.java
     * for more details). The addSong method adds the given song to the songs bag
     * and returns true if the song was successfully added, or false if it was not.
     * 
     * The argument that is passed as the paramter is also going to be passed into
     * the bag's add method,
     * which will return true if the song was succesfully added to the bag, or false
     * if it was not.
     * The addSong method then returns this value to indicate whether the song was
     * added to the playlist or not.
     */
    public boolean addSong(Song s) {
        return songs.add(s);
    }

    /**
     * Method that removes a song from the playlist. This method does not take any
     * parameters and returns a Song object representing the removed song. The
     * removeSong method calls the remove method of the songs bag, which removes and
     * returns an arbitrary song from the bag. If the bag is empty, it may return
     * null or throw an exception depending on the implementation of the ArrayBag
     * class.
     * 
     * @return The removed song, or null if the playlist is empty.
     */

    /*
     * Just like the add method, the removeSong method isn't really doing all the
     * work. The remove method is the one doing all the work
     * and the type of remove method we get is based on whicever bag we implement.
     * So in this case, it'd be ArrayBag's remove method.
     * The remove method will return a result to removeSong which in turn is
     * returned to the client.
     * This is a perfect example of encapsulation.
     * 
     */

    public Song removeSong() {
        return songs.remove();
    }

    /**
     * Method that checks if the playlist is empty. This method does not take any
     * parameters and returns a boolean value indicating whether the playlist is
     * empty or not. The isEmpty method calls the isEmpty method of the songs bag,
     * which checks if the bag contains any songs. If the bag is empty, it returns
     * true; otherwise, it returns false.
     * 
     * @return true if the playlist is empty, false otherwise.
     */

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    /**
     * Method that prints all the songs in the playlist. This method does not take
     * any parameters and does not return any value. The printAllSongs method
     * iterates through all the songs in the songs bag and prints their titles and
     * artists to the console. It also includes some formatting for better
     * readability.
     * Note: The toArray method of the songs bag is used to get an array of all the
     * songs in the bag, which allows for easy iteration and printing of each song's
     * details.
     */

    public void printAllSongs() {
        System.out.println("=====================================");
        System.out.println("            YOUR PLAYLIST          ");
        System.out.println("=====================================");

        Object[] array = songs.toArray();

        // Using object due to runtime error that occurs when we try to use Song as the
        // type.
        for (Object obj : array) {
            Song s = (Song) obj;

            System.out.printf("Title : %s%n", s.getTitle());
            System.out.printf("Artist: %s%n", s.getArtist());
            System.out.println("-------------------------------------");
        }
    }

    /**
     * Method that counts the number of songs by a specific artist in the playlist.
     * This method takes a String parameter representing the artist's name and
     * returns an integer value indicating how many songs by that artist are in the
     * playlist. The countArtist method iterates through all the songs in the songs
     * bag and compares the artist of each song with the given artist parameter. If
     * a match is found, it increments a counter. Finally, it returns the total
     * count of songs by that artist.
     * 
     * @param artist The name of the artist to count songs for.
     * @return The number of songs by the specified artist in the playlist.
     */

    public int countArtist(String artist) {
        int count = 0;

        for (Object obj : songs.toArray()) {
            Song s = (Song) obj;
            if (s.getArtist().equals(artist)) {
                count++;
            }
        }

        return count;
    }

}