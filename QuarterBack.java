import java.util.Random;

/**
 * The Quarterback, a type of Player
 * @author Brooks Robinson
 */
public class QuarterBack extends Player {

    Random randy = new Random();

    /**
     * Constructs the name and behaviors of a Quarterback player
     * @param name name of player
     */
    public QuarterBack(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();


    }

    /**
     * Sets the offensive behavior randomly to run or pass
     */
    public void setOffenseBehavior() {

        RunBehavior run = new RunBehavior();
        PassBehavior pass = new PassBehavior();
        
        int r = randy.nextInt(2);

        if(r == 1) {
            offenseBehavior = run;
        } else {
            offenseBehavior = pass;
        }

        

    }

    /**
     * Sets the defensive behavior to null
     */
    public void setDefenseBehavior() {

        defenseBehavior = null;

    }
    
}
