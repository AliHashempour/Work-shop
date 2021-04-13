/*
 *
 * create a new students with a given name and id number
 *
 * */

public class student {
    //students first name
    private String firstName;
    //students last name
    private String lastName;
    //students id
    private String id;
    //students grade
    private int grade;

    /**
     * @param firstName student first name
     * @param lastName  student last name
     * @param id        student id
     * @param grade     student grade
     */
    public student(String firstName, String lastName, String id, int grade) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
        this.setGrade(grade);

    }

    /**
     * prints the information about students
     */
    public void Print() {
        System.out.println("First name:" + firstName + "\nID:" + id);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setId(String id) {
        this.id = id;

    }

    public void setGrade(int grade) {
        this.grade = grade;

    }

    /**
     * @return returns grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return returns first name
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * @return returns id
     */

    public String getId() {
        return id;
    }

    /**
     * @return returns last name
     */

    public String getLastName() {
        return lastName;
    }
}
