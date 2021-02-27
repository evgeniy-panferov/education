package behavioral.memento;

/*
Memento(снимок) - поведенческий паттерн, который позволяет сохранить и загрузить прошлое состояние объекта, не раскрывая его внутренней реализации.
 */

public class SeatUserRunner {
    public static void main(String[] args) {
        CarSeat carSeat = new CarSeat();
        carSeat.setPositionAndOwner("First Postion", "Husband");
        Save save = carSeat.save();

        System.out.println(carSeat);

        SeatMemory seatMemory = new SeatMemory();
        seatMemory.setSave(save);

        carSeat.setPositionAndOwner("Second Position", "Wife");
        System.out.println(carSeat);

        System.out.println("Возвращаем первое положение\n");

        carSeat.setPositionFromMemory(save);
        System.out.println(carSeat);
    }
}
