/**
 * Strip behavior for Defense players
 * @author Brooks Robinson
 */
public class StripBehavior implements DefenseBehavior{
    /**
     * Appends the strip behavior to the end of the player's name
     * @return a strip behavior
     */
    @Override
    public String play() {
        return "Strip a ball from runners hands";
    }
}
