/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Luke Kim
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p1 = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p1.add(new Song("Prom", "Sza", 196));
        p1.add(new Song("The Hills", "The Weeknd", 243));
        p1.add(new Song("Dandelions", "Ruth B.", 234));
        p1.add(new Song("Shower", "Becky G.", 206));
        p1.add(new Song("Tik Tok","Kesha", 200));
        p1.add(new Song("Shake It Off", "Taylor Swift", 219));
        p1.add(new Song("Amoeba", "Clairo", 213));
        


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p1.allSongs();

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p1.like(0);
        p1.like(3);
        p1.like(6);

        System.out.println("Printing the songs...\n");
        p1.allSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        p1.delete(1);

        System.out.println("Printing the songs...\n");
        p1.allSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p1.allLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
            //Note that the format should look something like minutes:seconds
        p1.totalDuration();
    
        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p1.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p1.allSongs();
    }
}
