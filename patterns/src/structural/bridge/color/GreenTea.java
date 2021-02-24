package structural.bridge.color;

import structural.bridge.Tea;
import structural.bridge.country.Country;

public class GreenTea extends Tea {

    public GreenTea(Country country) {
        super(country);
    }

    @Override
    protected void typeOfTea() {
        System.out.println("Green tea!");
        country.getCountry();
    }
}
