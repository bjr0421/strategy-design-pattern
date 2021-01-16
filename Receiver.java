public class Receiver extends Player {

    public Receiver(String name) {

        super(name);
        //TODO add refs to off and def behavior

    }

    public void setOffenseBehavior() {

        offenseBehavior = new ReceiveBehavior();

    }

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }
    
}
