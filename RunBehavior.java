import java.util.Random;

public class RunBehavior implements OffenseBehavior{

    Random randy = new Random();

    private String[] plays = {"drive (up the gut)","draw","pitch","reverse"};

    public String play() {

        return "runs a " + plays[randy.nextInt(4)];

    }
    
}
