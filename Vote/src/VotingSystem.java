

import java.util.*;

/***
 *
 *this class represents the voting system
 */
public class VotingSystem {
    // list of voting
    private ArrayList<Voting> votingList;

    /**
     * Constructor for voting system
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * create voting
     *
     * @param a  is question
     * @param a2 type of voting
     * @param a3 choises
     */
    public void creatVoting(String question, int type, ArrayList<String> choices) {
        Voting m = new Voting(type, question);
        votingList.add(m);
        for (int i = 0; i < choices.size(); i++) {
            m.creatPoll(choices.get(i));
        }
    }

    /**
     * print question
     */
    public void printVotingQustion() {
        for (int i = 0; i < votingList.size(); i++) {
            System.out.println(votingList.get(i).getQuestion());
        }
    }

    /**
     * print voting
     *
     * @param number of voting
     */

    public void printVoting(int a) {
        System.out.println(votingList.get(a).getQuestion());

        for (int i = 0; i < votingList.get(a).getPolls().size(); i++) {
            System.out.println(votingList.get(a).getPolls().get(i));
        }
    }

    /**
     * voting
     *
     * @param a      is person
     * @param number of voting
     * @param a3     his choises
     */

    public void vote(Person a, int a2, ArrayList<String> a3) {

        votingList.get(a2).vote(a, a3);
    }

    /**
     * create voting
     *
     * @param a is number of voting
     */
    public void getResult(int a) {
        votingList.get(a).printVotes();
    }
}

