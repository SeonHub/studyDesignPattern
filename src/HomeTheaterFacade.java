public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer streamingPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(
            Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popcornPopper
    ) {
        this.amplifier = amp;
        this.tuner = tuner;
        this.streamingPlayer = player;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = lights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movieName) {
        System.out.println("영화가 곧 시작됩니다.");
        System.out.println("영화명: " + movieName);
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setPlayer(this.streamingPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        streamingPlayer.on();
        streamingPlayer.play();
    }

    public void endMovie(){
        System.out.println("홈 시어터 종료중");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        streamingPlayer.stop();
        streamingPlayer.off();
    }


}
