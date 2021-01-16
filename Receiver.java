public class Receiver extends Player {

    public Receiver(String name) {

        super(name);
        offenseBehavior = new ReceiverBehavior();
        defenseBehavior = null;

    }

    public void setOffenseBehavior() {

        offenseBehavior = new ReceiverBehavior();

    }

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }
    
}
