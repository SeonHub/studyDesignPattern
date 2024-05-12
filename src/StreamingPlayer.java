public class StreamingPlayer {
    Amplifier amplifier;

    public StreamingPlayer (Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("on~~");
    }

    public void off(){
        System.out.println("off~~");
    }

    public void pause(){
        System.out.println("pause~~");
    }

    public void play(){
        System.out.println("play~~");
    }

    public void setSurroundAudio(){
        System.out.println("setSurroundAudio~~");
    }

    public void setTwoChannelAudio(){
        System.out.println("setTwoChannelAudio~~");
    }

    public void stop(){
        System.out.println("stop~~");
    }

    public String toString(){
        return amplifier.toString();
    }
}
