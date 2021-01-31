package creational.factorymethod;

public class MedicalPolicy implements InsurancePolicy{

    @Override
    public void policyType() {
        System.out.println("Медицинская страховка");
    }
}
