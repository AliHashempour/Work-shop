public class lab {
    private student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public lab(int capacity, String day) {
        this.capacity = capacity;
        this.day = day;
        students = new student[capacity];
        currentSize = 0;

    }

    /**
     * @param std a student object
     */

    public void enrollStudent(student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;

        } else {
            System.out.println("lab is full!!!");
        }

    }

    /**
     * prints the information
     */

    public void Print() {
        System.out.println("AVRAGE IS: " + getAvg() + "\ncapacity is:" + capacity + "\ntodat is:" + day);
    }

    /**
     * @param std an array of students
     */

    public void calculateAvg(student[] std) {
        int sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum = sum + std[i].getGrade();

        }
        avg = sum / currentSize;

    }


    /**
     * @return returns the calculated average
     */

    public int getAvg() {
        return avg;
    }


    public void setStudents(student[] students) {
        this.students = students;
    }

    public student[] getStudents() {
        return students;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
