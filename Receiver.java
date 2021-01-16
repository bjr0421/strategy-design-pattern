/**
 * The Receiver, a type of Player
 * @author Brooks Robinson
 */
public class Receiver extends Player {

    /**
     * Constructs the name and behaviors of a Receiver player
     * @param name name of player
     */
    public Receiver(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();

    }

    /**
     * Sets the offensive behavior to a receiver's behavior
     */
    public void setOffenseBehavior() {

        offenseBehavior = new ReceiverBehavior();

    }

    /**
     * Sets the defense behavior to null
     */
    public void setDefenseBehavior() {

        defenseBehavior = null;

    }
    
}
