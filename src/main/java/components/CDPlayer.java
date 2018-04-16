package components;

public class CDPlayer extends Component implements IPlayer{
    private int numOfCDs;

    public CDPlayer (String make, String model, int volume) {
        super(make, model, volume);
        this.numOfCDs = 0;
    }

    public int getNumOfCDs() {
        return numOfCDs;
    }

    public void setNumOfCDs(int numOfCDs) {
        this.numOfCDs = numOfCDs;
    }

    public String play (String nowPlaying){
        return "You are listening to " + nowPlaying + "!";
    }

    public String connect(){
        return "CD player is now connected.";
    }
}
