import java.util.ArrayList;

public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    //AN Arraylist of favorites
    private ArrayList<Music> favorite;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<Music>();
        favorite = new ArrayList<Music>();
        player = new MusicPlayer();

    }

    /**
     * Add a file to the collection.
     *
     * @param filename The file to be added.
     */
    public void addFile(String filename, int year) {
        files.add(new Music(filename, year));
    }

    /**
     * add to favorite
     */

    public void addFavorite(String filename, int year) {
        favorite.add(new Music(filename, year));
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }


    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (int i = 0; i < files.size(); i++) {
            System.out.print((i + 1) + ":");
            System.out.println(files.get(i).getName());
        }

    }

    /**
     * show a list of favorite
     */
    public void favotiteList() {
        for (int i = 0; i < favorite.size(); i++) {
            System.out.print((i + 1) + ":");
            System.out.println(favorite.get(i).getName());
        }

    }


    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        files.remove(index);

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();


    }

    /**
     * search in file too find the name
     *
     * @param name of the music
     */

    public void search(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equals(name)) {
                System.out.println("\n" + "song name: " + files.get(i).getName());
                System.out.println("year: " + files.get(i).getYear());
                System.out.println();
            }
        }
    }
    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        boolean isThere = false;
        for (int i = 0; i < files.size(); i++) {
            if (files.indexOf(i) == index) {
                isThere = true;
                break;
            }
        }
        return isThere;
    }
}
