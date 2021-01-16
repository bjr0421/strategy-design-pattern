public class Receiver extends Player {

    public Receiver(String name) {

        super(name);
        setOffenseBehavior();
        setDefenseBehavior();

    }

    public void setOffenseBehavior() {

        offenseBehavior = new ReceiverBehavior();

    }

    public void setDefenseBehavior() {

        defenseBehavior = null;

    }
    
}
