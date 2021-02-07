package structural.decorator;

public class AudioPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Воспроизвожу музыкальную дорожку");
    }
}
