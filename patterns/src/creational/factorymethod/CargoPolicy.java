package creational.factorymethod;

public class CargoPolicy implements InsurancePolicy{

    @Override
    public void policyType() {
        System.out.println("Полис на страхование груза");
    }

}
