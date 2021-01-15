public abstract class Player {

    protected String name;
    private boolean defense;

    DefenseBehavior defenseBehavior;
    OffenseBehavior offenseBehavior;

    public Player(String name) {

        this.name = name;

    }

    public void setDefenseBehavior() {

        defenseBehavior.play();

    }

    public void setOffenseBehavior() {

        offenseBehavior.play();

    }

    //public String play(); 
    //TODO Figure out how to use a String method or what to do with it for this assignment

}