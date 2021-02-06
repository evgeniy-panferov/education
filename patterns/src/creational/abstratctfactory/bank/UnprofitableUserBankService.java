package creational.abstratctfactory.bank;

public class UnprofitableUserBankService implements BankService{

    public void getCredit(){
        System.out.println("Даем кредит под 30% годовых");
    }
    public void openDeposit(){
        System.out.println("Открываем депозит под 2% годовых");
    }

}
