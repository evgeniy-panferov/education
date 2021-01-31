package structural.adapter;
/*
Адаптер выступает прослойкой между двумя объектами, превращая вызовы одного в вызовы понятные другому.
Паттерн можно встретить в java коде, особенно там, где где требуется конвертация разных типов данных или совместная работа
классов с разными интерфейсами.
Адаптер - позволяет объектам с несовместимыми интерфейсами работать вместе.
 */
public class AdapterClient {


    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);

        if(roundHole.fits(roundPeg)){
            System.out.println("Все норм");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(22);

       // roundHole.fits(smallSquarePeg) не компилируется

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if(roundHole.fits(smallSquarePegAdapter)){
            System.out.println("Все норм");
        }

        if(roundHole.fits(largeSquarePegAdapter)){
            System.out.println("Все норм");
        }

    }
}
