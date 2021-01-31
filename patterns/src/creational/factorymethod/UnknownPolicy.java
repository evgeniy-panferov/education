package creational.factorymethod;

public class UnknownPolicy implements InsurancePolicy {
    @Override
    public void policyType() {
        System.out.println("Неизвестный тип полиса");
    }
}
