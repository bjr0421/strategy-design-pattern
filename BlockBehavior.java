import java.util.Random;

public class BlockBehavior implements DefenseBehavior{

    Random randy = new Random();

    private String[] plays = {"kick","punt","pass","catch"};

    public String play() {

        return " block a " + plays[randy.nextInt(4)];

    }
    
}
