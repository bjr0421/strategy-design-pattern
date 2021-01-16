/**
 * Sack behavior for Defense players
 * @author Brooks Robinson
 */
public class SackBehavior implements DefenseBehavior{
    /**
     * Appends a sack behavior to the end of a player's name
     * @return a sack behavior
     */
    @Override
    public String play() {
        return "Sack the quarterback";
    }
}
