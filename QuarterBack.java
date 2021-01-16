import java.util.Random;

public class QuarterBack extends Player {

    Random randy = new Random();

    public String[] off = {};

    public QuarterBack(String name) {

        super(name);

    }

    public void setOffenseBehavior() {

        RunBehavior run = new RunBehavior();
        PassBehavior pass = new PassBehavior();
        //String[] option = {run,pass};

        //TODO figure out how to randomize behavior

    }

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }

    public String toString() {
        return name;
    }
    
}
