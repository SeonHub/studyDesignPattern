
public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        StreamingPlayer player = new StreamingPlayer(amp);
        Projector projector = new Projector(player);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        homeTheaterFacade.watchMovie("꼭두각시 서커스");
        homeTheaterFacade.endMovie();
    }
}