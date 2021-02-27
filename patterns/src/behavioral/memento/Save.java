package behavioral.memento;

public class Save {
    private final String seatPosition;
    private final String owner;

    public Save(String seatPosition, String owner) {
        this.seatPosition = seatPosition;
        this.owner = owner;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public String getOwner() {
        return owner;
    }
}
