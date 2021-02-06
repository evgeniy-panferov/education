package creational.abstratctfactory;

import creational.abstratctfactory.bank.BankService;
import creational.abstratctfactory.bank.UnprofitableUserBankService;
import creational.abstratctfactory.isurancecompany.InsuranceService;
import creational.abstratctfactory.isurancecompany.UnprofitableUserInsuranceService;

public class UnprofitableUserFinanceFactory implements FinanceService {
    @Override
    public InsuranceService getInsuranceService() {
        return new UnprofitableUserInsuranceService();
    }

    @Override
    public BankService getBankService() {
        return new UnprofitableUserBankService();
    }
}
