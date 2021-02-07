package structural.decorator;

public class ThreeDPlayer extends DecoratorPlayer {

    public ThreeDPlayer(Player player) {
        super(player);
    }

    @Override
    public void play() {
        player.play();
        System.out.println("Делаю 3D эффект");
    }
}
