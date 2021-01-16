public abstract class Player {

    protected String name;
    private boolean defense;

    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String name) {

        this.name = name;

    }

    public void setDefenseBehavior(DefenseBehavior def) {

        defenseBehavior = def;

    }

    public void setOffenseBehavior(OffenseBehavior off) {

        offenseBehavior = off;

    }

    public String play() {
        
        if(defense == true) {
            if(defenseBehavior == null){
                return " is not playing";
            }
            return defenseBehavior.play();
        } else {
            return offenseBehavior.play();
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