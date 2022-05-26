import java.util.Date;

public class Score {
    String firstName;
    String lastName;
    int score;
    Date playDate;

    public Score(String firstName, String lastName, int score, Date playDate) {
        this.playDate = playDate;

        System.out.println(firstName + " " + lastName + " " + score + " " + playDate);

    }
}