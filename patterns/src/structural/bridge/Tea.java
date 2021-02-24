package structural.bridge;

import structural.bridge.country.Country;

public abstract class Tea {
    protected Country country;

    protected Tea(Country country) {
        this.country = country;
    }

    protected abstract void typeOfTea();
}
