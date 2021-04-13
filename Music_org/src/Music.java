/**
 * this class represents a music
 */
public class Music {
    private int year;
    private String name;

    /**
     * constructor for file name and year
     * @param filename passing the name of the file
     * @param year passing the year
     */

    public Music(String filename, int year) {
        this.name = filename;
        this.year = year;
    }

    /**
     * we can recieve the file name
     * @return name of the file
     */

    public String getName() {
        return name;
    }

    /**
     * we cam set the file name
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * we can get the year
     * @return  the year
     */

    public int getYear() {
        return year;
    }

    /**
     * we can set the year
     * @param year
     */

    public void setYear(int year) {
        this.year = year;
    }
}
