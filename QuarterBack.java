import java.util.Random;

public class QuarterBack extends Player {

    Random randy = new Random();

    RunBehavior run = new RunBehavior();
    PassBehavior pass = new PassBehavior();
    OffenseBehavior o;


    public QuarterBack(String name) {

        super(name);
        //OffenseBehavior oBehavior;
        offenseBehavior = o;
        defenseBehavior = null;


    }

    public void setOffenseBehavior() {

        //RunBehavior run = new RunBehavior();
        //PassBehavior pass = new PassBehavior();
        
        int r = randy.nextInt(2);

        if(r == 1) {
            o = run;
        } else {
            o = pass;
        }

        

    }

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }

    public String toString() {
        return name;
    }
    
}
