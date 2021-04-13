/***
 *
 *this class represents the persons
 */
public class Person {
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * the fname getter
     * @return
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * the lname getter
     * @return
     */

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


//    public static void main(String[] args) {
//        Person person = new Person("ali", "hm");
//        Person person1 = new Person("ali", "m");
//        System.out.println(person1);
//    }
}
