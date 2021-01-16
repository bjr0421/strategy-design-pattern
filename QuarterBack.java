import java.util.Random;

public class QuarterBack extends Player {

    Random randy = new Random();

    public QuarterBack(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();


    }

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

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }

    public String toString() {
        return name;
    }
    
}
