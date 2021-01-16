import java.util.Random;

/**
 * Receiver behaviors for Receiver players
 * @author Brooks Robinson
 */
public class ReceiverBehavior implements OffenseBehavior{

    Random randy = new Random();

    private String[] plays = {"slant route","out route","seem route","screen pass","hail mary"};

    /**
     * Appends a random receiver behavior to the end of a player's name
     * @return a random receiver behavior
     */
    public String play() {

        return "runs a " + plays[randy.nextInt(5)];

    }
    
}
