package structural.adapter;

/*
 * Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия вместе.
 */

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        return Math.sqrt(Math.pow(squarePeg.getWidth()/2,2)*2);
    }
}
