import java.util.Random;

/**
 * Run behaviors for Offensive players
 * @author Brooks Robinson
 */
public class RunBehavior implements OffenseBehavior{

    Random randy = new Random();

    private String[] plays = {"drive (up the gut)","draw","pitch","reverse"};

    /**
     * Appends a random run behavior to the end of a player's name
     * @return a random run behavior
     */
    public String play() {

        return "runs a " + plays[randy.nextInt(4)];

    }
    
}
