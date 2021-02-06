package creational.abstratctfactory;

import creational.abstratctfactory.bank.BankService;
import creational.abstratctfactory.isurancecompany.InsuranceService;

public interface FinanceService {
    InsuranceService getInsuranceService();

    BankService getBankService();
}
