import java.util.Random;

public class Lineman extends Player {

    Random randy = new Random();

    public Lineman(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();

    }

    public void setOffenseBehavior() {

        offenseBehavior = new OBlockBehavior();

    }

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
