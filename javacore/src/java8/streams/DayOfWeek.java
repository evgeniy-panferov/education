package java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum DayOfWeek {
    MONDAY("work"),
    TUESDAY("work"),
    WEDNESDAY("work"),
    THURSDAY("work"),
    FRIDAY("work"),
    SATURDAY("day off"),
    SUNDAY("day off");

    private String typeOfDay;

    DayOfWeek(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }

    public static void main(String[] args) {
        Stream.of(DayOfWeek.values())
                .forEach(day -> System.out.println(day.name() + " - " + day.getTypeOfDay()));
    }
}
