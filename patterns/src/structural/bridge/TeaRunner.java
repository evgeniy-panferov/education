package structural.bridge;

import structural.bridge.color.BlackTea;
import structural.bridge.color.GreenTea;
import structural.bridge.country.India;
import structural.bridge.country.Japan;

/*
Bridge - структурный паттерн, который разделяет один или несколько классов на две отдельные иерархии абстракцию и реализацию.
Позволяет изменять их не зависимо друг от друга.
 */

public class TeaRunner {
    public static void main(String[] args) {
        Tea indianTea = new BlackTea(new India());
        Tea chineseTea = new GreenTea(new Japan());
        indianTea.typeOfTea();
        System.out.println("----------------------------");
        chineseTea.typeOfTea();
    }
}
