public abstract class Player {

    protected String name;
    private boolean defense;

    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String name) {

        this.name = name;

    }

    public void setDefenseBehavior() {

        defenseBehavior.play();

    }

    public void setOffenseBehavior() {

        offenseBehavior.play();

    }

    public String play() {
        if(defense == true) {
            return offenseBehavior.play();
        } else {
            return defenseBehavior.play();
        }
    }

    public void turnover() {

        if(defense == true) {
            defense = false;
        } else {
            defense = true;
        }

    }

}