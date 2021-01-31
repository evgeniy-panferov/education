package creational.factorymethod;

public class InsurancePolicyFactory {

    public InsurancePolicy insuranceFactory(String policyType) {
        if (policyType == null) {
            return new UnknownPolicy();
        }
        if (policyType.equals("Страхование груза")) {
            return new CargoPolicy();
        }
        if (policyType.equals("Медицинский полис")) {
            return new MedicalPolicy();
        }
        if (policyType.equals("Автомобильная страховка")) {
            return new CarPolicy();
        }
        return new UnknownPolicy();
    }
}
