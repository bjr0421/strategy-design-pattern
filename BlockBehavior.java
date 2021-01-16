import java.util.Random;

/**
 * Blocking behaviors for Defense players
 * @author Brooks Robinson 
 */
public class BlockBehavior implements DefenseBehavior{
    Random randy = new Random();

    private String[] plays = {"kick","punt","pass","catch"};

    /**
     * Appends a random blocking behavior to the end of a player's name
     * @return a random blocking behavior
     */

    @Override
    public String play() {
        return "block a " + plays[randy.nextInt(4)];
    }
    
}
