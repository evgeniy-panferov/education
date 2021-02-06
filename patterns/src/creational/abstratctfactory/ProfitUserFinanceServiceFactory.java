package creational.abstratctfactory;

import creational.abstratctfactory.bank.BankService;
import creational.abstratctfactory.bank.ProfitUserBankService;
import creational.abstratctfactory.isurancecompany.InsuranceService;
import creational.abstratctfactory.isurancecompany.ProfitUserInsuranceService;

public class ProfitUserFinanceServiceFactory implements FinanceService {

    @Override
    public InsuranceService getInsuranceService() {
        return new ProfitUserInsuranceService();
    }

    @Override
    public BankService getBankService() {
        return new ProfitUserBankService();
    }
}
