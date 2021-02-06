package creational.abstratctfactory.isurancecompany;

public class UnprofitableUserInsuranceService implements InsuranceService {

    public void insure() {
        System.out.println("Страхуем за 1000000 рублей");
    }

}
