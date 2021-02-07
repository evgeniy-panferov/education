package structural.decorator;

public abstract class DecoratorPlayer implements Player {

    protected Player player;

    public DecoratorPlayer(Player player) {
        this.player = player;
    }
}
