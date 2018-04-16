package components;

public class Radio extends Component implements IPlayer{
    private double station;

    public Radio (String make, String model, int volume) {
        super(make, model, volume);
        this.station = 0;
    }

    public double getStation() {
        return station;
    }

    public void tune(double station) {
        this.station = station;
    }

    public String play (String nowPlaying){
        return "You are listening to " + nowPlaying + " on " + station + "!";
    }

    public String connect(){
        return "Radio is now connected.";
    }
}
