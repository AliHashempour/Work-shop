import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/***
 *
 *this class represents the voting operatoin
 */
public class Voting {
    // type og voting
    private int type;
    // question of question
    private String question;
    // voters who attend in voting
    private ArrayList<Person> voters;
    // choise to person who voted this choise
    private HashMap<String, HashSet<Vote>> polls;

    /**
     * Constructor for card
     *
     * @param n for declare type of voting
     * @param m question of voting
     */
    public Voting(int n, String m) {
        this.type = n;
        this.question = m;
        this.voters = new ArrayList<Person>();
        this.polls = new HashMap<String, HashSet<Vote>>();

    }

    /**
     * give question
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * give choise & add to polls
     *
     * @param choise
     */
    public void creatPoll(String a) {
        polls.put(a, new HashSet<Vote>());
    }

    /**
     * give person & his choises & add to voting
     *
     * @param person a & his choises n
     */
    public void vote(Person person, ArrayList<String> choices) {

        if (choices.get(0) == "random") {
            Random r = new Random();
            int t = r.nextInt(getPolls().size());
            choices.remove(0);
            choices.add(getPolls().get(t));

        }
        voters.add(person);
        if (type == 1 && choices.size() > 1) {
            System.out.println("you must choose one chise ");
        } else {
            System.out.println("vote submitted ");
            JalaliCalendar j = new JalaliCalendar();
            Vote v = new Vote(person, j.toString());
            for (int i = 0; i < choices.size(); i++) {
                for (String key : polls.keySet()) {
                    if (choices.get(i) == key) {
                        polls.get(key).add(v);
                    }
                }
            }
        }

//
    }

    /**
     * give person who voted
     */
    public void getVoters() {
        for (int i = 0; i < voters.size(); i++) {
            System.out.println(voters.get(i).toString());
        }
    }

    /**
     * print result of voting
     */
    public void printVotes() {
        for (int i = 0; i < getPolls().size(); i++) {
            System.out.print(getPolls().get(i) + " = " + polls.get(getPolls().get(i)).size() + " ( ");
            for (Vote obj : polls.get(getPolls().get(i))) {
                System.out.print(obj.getPerson().toString() + " voted in " + obj.getDate() + ", ");
            }
            System.out.println(")");
        }
    }

    /**
     * give choises
     *
     * @return choises
     */
    public ArrayList<String> getPolls() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String key : polls.keySet()) {
            arrayList.add(key);
        }

        return arrayList;
    }


//    public static void main(String[] args) {
//
//        Voting voting = new Voting(1, "chera?");
//        Person person = new Person("a", "s");
//
//        JalaliCalendar j = new JalaliCalendar();
//        Vote vote = new Vote(person, j.toString());
//        System.out.println(voting.getPolls());
//    }
}