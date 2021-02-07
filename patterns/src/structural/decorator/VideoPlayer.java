package structural.decorator;

public class VideoPlayer extends DecoratorPlayer {

    public VideoPlayer(Player player) {
        super(player);
    }

    @Override
    public void play() {
        player.play();
        System.out.println("Воспроизвожу видеоряд");
    }
}
