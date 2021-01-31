package creational.factorymethod;

public class CarPolicy implements InsurancePolicy {
    @Override
    public void policyType() {
        System.out.println("Автомобильная страховка");
    }
}
