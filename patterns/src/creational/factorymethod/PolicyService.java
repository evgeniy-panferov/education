package creational.factorymethod;

/*
Фабричный метод - общий интерфейс для создания объектов в супер классе, позволяя подклассам изменять тип создаваемых объектов.
Решает проблему создания различных продуктов, без указания конкретных классов продуктов.

Фабричный метод задаёт метод, который следует использовать вместо вызова оператора new для создания объектов-продуктов.
Подклассы могут переопределить этот метод, чтобы изменять тип создаваемых продуктов.
 */

public class PolicyService {

    public static void main(String[] args) {
        InsurancePolicyFactory insurancePolicyFactory = new InsurancePolicyFactory();
        InsurancePolicy cargoPolicy = insurancePolicyFactory.insuranceFactory("Страхование груза");
        cargoPolicy.policyType();

        InsurancePolicy carPolicy  = insurancePolicyFactory.insuranceFactory("Автомобильная страховка");
        carPolicy.policyType();

        InsurancePolicy ololoPolicy  = insurancePolicyFactory.insuranceFactory("ололо");
        ololoPolicy.policyType();

    }

}
