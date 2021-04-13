import ir.huri.jcal.JalaliCalendar;

import java.util.Calendar;
import java.util.Objects;

/***
 *
 *this class represents the vote
 */
public class Vote {
    private Person person;
    private String date;

    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /***
     * the person getter
     * @return
     */
    public Person getPerson() {
        return person;

    }

    /**
     * the date getter
     * @return
     */
    public String getDate() {
        return date;

    }


    /**
     * chek is equal or not
     *
     * @return if correct return true and not false
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(date, vote.date);
    }
    /**
     * hashcode for voting
     *
     * @return hashing for each object
     */

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }

//    public static void main(String[] args) {
//        JalaliCalendar jalaliCalendar = new JalaliCalendar();
//        Person person = new Person("A", "S");
//        Vote vote = new Vote(person, jalaliCalendar.toString());
//        System.out.println(vote.getDate());
//
//    }
}
