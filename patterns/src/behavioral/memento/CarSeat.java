package behavioral.memento;

public class CarSeat {
    private String seatPosition;
    private String owner;

    public void setPositionAndOwner(String seatPosition, String owner) {
        this.seatPosition = seatPosition;
        this.owner = owner;
    }

    public Save save() {
        return new Save(seatPosition, owner);
    }

    public void setPositionFromMemory(Save save) {
        seatPosition = save.getSeatPosition();
        owner = save.getOwner();
    }

    @Override
    public String toString() {
        return "Seat Position: " + seatPosition + "\n" +
                "Owner: " + owner + "\n";
    }
}
