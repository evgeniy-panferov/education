package creational.abstratctfactory;

import creational.abstratctfactory.bank.BankService;
import creational.abstratctfactory.isurancecompany.InsuranceService;

/*
Абстрактная фабрика - позволяет создавать создавать семейства связанных классов, не привязываясь к конкретным классам создаваемых объектов.
Основное отличие от других фабрик, работает с семействами классов
Задает интерфейс создания всех возможных продуктов, где каждая конкретная реализация фабрики порождает продукты одной из вариаций.
Создание продуктов происходит через вызовы методов фабрики.
 */
public class Client {

    public static void main(String[] args) {
    FinanceService financeService = getFinancialService("unprofitable");
        BankService bankService = financeService.getBankService();
        InsuranceService insuranceService = financeService.getInsuranceService();
        bankService.getCredit();
        insuranceService.insure();
    }


    public static FinanceService getFinancialService(String type) {
        return switch (type) {
            case "profit" -> new ProfitUserFinanceServiceFactory();
            case "unprofitable" -> new UnprofitableUserFinanceFactory();
            default -> throw new RuntimeException("Unsupported type");
        };
    }
}
