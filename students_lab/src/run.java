public class run {
    public static void main(String[] args) {
        student std1 = new student(" ali", "hashem", "11223", 12);
        student std2 = new student(" amir ali", "ghozat", "11224", 13);
        student std3 = new student(" hamid", "alavi", "11225", 14);

        std1.Print();
        std1.setId("11229");
        std1.Print();

        std2.Print();
        std2.setId("11221");
        std2.Print();

        std3.Print();
        std3.setId("11237");
        std3.Print();


        lab lab1 = new lab(10,"Friday");

        lab1.enrollStudent(std1);
        lab1.enrollStudent(std3);
        lab1.calculateAvg(lab1.getStudents());
        lab1.Print();


    }
}
