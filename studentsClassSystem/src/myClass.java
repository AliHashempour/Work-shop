import java.util.ArrayList;

/**
 * this class represents a class with teacher name and some students
 */
public class myClass {
    //teacher name
    private String teacherName;
    //a list of students
    private ArrayList<Student> students;

    /**
     * constructor for teacher name and students
     * */
    public myClass(String teacherName) {
        this.teacherName = teacherName;
        students = new ArrayList<Student>();

    }

    /**
     *
     * @return returns teacher name
     */
    public String getTeacherName() {
        return teacherName;

    }

    /**
     * you can set teacher name
     * @param teacherName  the name
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;

    }

    /**
     * adds a student to the list
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * a list of all students with the grades
     */

    public void listOfAll() {
        for (int i = 0; i < students.size(); i++) {
            System.out.print((i + 1) + ":");
            System.out.println("\n" + "name: " + students.get(i).getName() +
                    "\t\tgrade: " + students.get(i).getGrade());

        }
    }

    /**
     * calculates the average of the class
     */

    public void classAverage() {
        float sum = 0;
        float avg = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getGrade();
        }
        avg = sum / students.size();
        System.out.println("\nthe average is:\t" + avg);
    }

    /**
     * prints the best grade
     */

    public void bestGrade() {
        float max = students.get(0).getGrade();
        for (int i = 1; i < students.size(); i++) {
            if (max < students.get(i).getGrade()) {
                max = students.get(i).getGrade();
            }

        }
        System.out.println("\nbest grade is:\t" + max);
    }

    /**
     * prints the worst grade
     */

    public void worstGrade() {
        float min = students.get(0).getGrade();
        for (int i = 1; i < students.size(); i++) {
            if (min > students.get(i).getGrade()) {
                min = students.get(i).getGrade();
            }

        }
        System.out.println("\nworst grade is:\t" + min);
    }


    public static void main(String[] args) {
        Student std1 = new Student("ali", 32f);
        Student std2 = new Student("amir", 29f);
        Student std3 = new Student("mahdi", 23f);

        myClass class1 = new myClass("soltan");

        class1.addStudent(std1);
        class1.addStudent(std2);
        class1.addStudent(std3);

        class1.listOfAll();
        class1.classAverage();
        class1.bestGrade();
        class1.worstGrade();

    }

}
