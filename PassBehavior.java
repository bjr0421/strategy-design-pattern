import java.util.Random;

/**
 * Pass behavior for Offensive players
 * @author Brooks Robinson
 */
public class PassBehavior implements OffenseBehavior{
    Random randy = new Random();

    private String[] plays = {"slant route","out route","seem route","screen pass","hail mary"};

    /**
     * Appends a random pass behavior to the end of the player's name
     * @return random pass behavior
     */
    @Override
    public String play() {
        return "throws a " + plays[randy.nextInt(5)];
    }
}
