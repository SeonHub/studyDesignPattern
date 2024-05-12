public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(){};

    public void on(){
        System.out.println("Turn on Amplifier");
    }

    public void off(){
        System.out.println("Turn off Amplifier");
    }

    public void setPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStereoSound(){
        this.player.setSurroundAudio();
    }

    public  void setSurroundSound(){
        this.player.setSurroundAudio();
    }

    public void setVolume(Number number){
        System.out.println("Setting volume to "+number);
    }

    public String toString(){
        return null;
    }

}
