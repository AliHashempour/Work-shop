/**
 * this class represents a student with name and grade
 */
public class Student {
    private String name;
    private float Grade;

/**
 * constructor for student name and grade
 * */

    public Student(String name, float grade) {
        this.name = name;
        this.Grade = grade;
    }

    /**
     * we can recieve the student name
     * @return returns the name
     */

    public String getName() {
        return name;
    }

    /**
     * sets  the student name
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * we can recieve the student grade
     * @return returns the grade
     */
    public float getGrade() {
        return Grade;
    }

    /**
     * sets the student grade
     * @param grade
     */

    public void setGrade(float grade) {
        Grade = grade;
    }

}
