/**
 * A football player
 * @author Brooks Robinson
 * 
 */
public abstract class Player {

    protected String name;
    private boolean defense;

    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    /**
     * Creates a new Player with the given name
     * @param name The name of the Player
     */
    public Player(String name) {

        this.name = name;

    }

    /**
     * Allows a Player to set a defense behavior
     * @param def The defense behavior of the player
     */
    public void setDefenseBehavior(DefenseBehavior def) {

        defenseBehavior = def;

    }

    /**
     * Allows a Player to set a offense behavior
     * @param off The offense behavior of the player
     */
    public void setOffenseBehavior(OffenseBehavior off) {

        offenseBehavior = off;

    }

    /**
     * Prints the behavior that the player has been given, however, does not print a behavior for an offense player when 
     * defensive plays are being listed
     * @return the defensive behavior, the offense behavior, or "is not playing" depending on the Player's role
     */
    public String play() {
        
        if(defense == true) {
            if(defenseBehavior == null){
                return "is not playing";
            }
            return defenseBehavior.play();
        } else {
            return offenseBehavior.play();
        }
        
    }

    /**
     * Changes the defense boolean depending on whether or not the team of Players is playing
     * offense or defense
     */
    public void turnover() {

        if(defense == true) {
            defense = false;
        } else {
            defense = true;
        }

    }

}