import java.util.Random;

public class Lineman extends Player {

    public Lineman(String name) {

        super(name);

    }

    public void setOffenseBehavior() {

        offenseBehavior = new OBlockBehavior();

    }

    public void setDefenseBehavior() {

        //TODO add defensive behavior

    }
    
}
