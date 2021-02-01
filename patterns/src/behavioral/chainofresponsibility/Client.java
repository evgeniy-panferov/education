package behavioral.chainofresponsibility;
/*
chain of responsibility - Позволяет передать по цепочке методов какое-либо значение, которое нужно обработать.
 */
public class Client {

    private Insurance insurance;
    private InsuredUserFilter insuredUserFilter;

    {
        insurance = new Insurance();
        insuredUserFilter = new SwindlerFilter();
        insuredUserFilter
                .linkWith(new UnprofitableFilter());
        insurance.setInsuredUserFilter(insuredUserFilter);
    }

    public static void main(String[] args) {
        User swindler = new User();
        swindler.setSwindler(true);
        swindler.setName("Плохой человек");

        User unluckyUser = new User();
        unluckyUser.setProfit(-12L);
        unluckyUser.setName("Человек, которому не везет");

        User user = new User();
        user.setName("Вася");
        user.setSwindler(false);
        user.setProfit(11111111111L);

        Client client = new Client();
        client.insure(swindler,unluckyUser,user);
    }

    public void insure(User ... users){
        for (User user:users) {
            insurance.insure(user);
        }
    }
}
