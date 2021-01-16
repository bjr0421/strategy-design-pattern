import java.util.Random;

/**
 * The Lineman, a type of Player
 * @author Brooks Robinson
 */
public class Lineman extends Player {

    Random randy = new Random();

    /**
     * Constructs the name and behaviors of a Lineman player
     * @param name name of player
     */
    public Lineman(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();

    }

    /**
     * Sets the offense behavior to offensive block
     */
    public void setOffenseBehavior() {

        offenseBehavior = new OBlockBehavior();

    }

    /**
     * Sets the defense behavior randomly to block, strip, or sack
     */
    public void setDefenseBehavior() {

        BlockBehavior block = new BlockBehavior();
        StripBehavior strip = new StripBehavior();
        SackBehavior sack = new SackBehavior();

        int r = randy.nextInt(3);

        if(r == 1) {
            defenseBehavior = block;
        } else if (r == 2) {
            defenseBehavior = strip;
        } else {
            defenseBehavior = sack;
        }

    }
    
}
