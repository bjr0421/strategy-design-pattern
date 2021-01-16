import java.util.Random;

public class PassBehavior implements OffenseBehavior{

    Random randy = new Random();

    private String[] plays = {"slant route","out route","seem route","screen pass","hail mary"};

    public String play() {

        return " throws a " + plays[randy.nextInt(5)];

    }
    
}
