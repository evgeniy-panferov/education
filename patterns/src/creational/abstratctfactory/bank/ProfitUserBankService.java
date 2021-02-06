package creational.abstratctfactory.bank;

public class ProfitUserBankService implements BankService{

   public void getCredit(){
       System.out.println("Даем кредит под 3% годовых");
   }
    public void openDeposit(){
        System.out.println("Открываем депозит под 20% годовых");
    }

}
