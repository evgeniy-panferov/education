package structural.bridge.color;

import structural.bridge.Tea;
import structural.bridge.country.Country;

public class BlackTea extends Tea {

    public BlackTea(Country country) {
        super(country);
    }

    @Override
    protected void typeOfTea() {
        System.out.println("Black tea!");
        country.getCountry();
    }
}
