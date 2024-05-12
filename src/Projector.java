public class Projector {
    StreamingPlayer player;

    public Projector(StreamingPlayer player){
        this.player = player;
    }

    public void on(){
        System.out.println("Shut ON!!");
    }

    public void off(){
        System.out.println("Shut OFF!!");
    }

    public void tvMode(){
        System.out.println("It is TV Mode~");
    }

    public void wideScreenMode(){
        System.out.println("It is Wide Screen Mode~");
    }

    public String toString(){
        return player.toString();
    }
}
