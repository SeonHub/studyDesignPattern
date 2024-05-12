public class Tuner {
    Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("Tuner is On");
    }

    public void off(){
        System.out.println("Tuner is Off");
    }

    public void setAm(){
        System.out.println("Set the AM");
    }

    public void setFm(){
        System.out.println("Set the FM");
    }

    public void setFrequency(){
        System.out.println("Set the Frequency");
    }

    public String toString(){
        return "this is Tuner";
    }
}
