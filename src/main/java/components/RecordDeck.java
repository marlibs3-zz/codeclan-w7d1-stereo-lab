package components;

public class RecordDeck extends Component implements IPlayer {
    private double speed;

    public RecordDeck (String make, String model, int volume) {
        super(make, model, volume);
        this.speed = 60.5;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String play (String nowPlaying){
        return "You are listening to " + nowPlaying + " on vinyl.";
    }

    public String connect(){
        return "Record deck is now connected.";
    }

}
