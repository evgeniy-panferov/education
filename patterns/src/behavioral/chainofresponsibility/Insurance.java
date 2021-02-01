package behavioral.chainofresponsibility;

public class Insurance {
    private InsuredUserFilter insuredUserFilter;

    public void setInsuredUserFilter(InsuredUserFilter insuredUserFilter) {
        this.insuredUserFilter = insuredUserFilter;
    }

    public void insure(User user){

        if(insuredUserFilter.doFilter(user)){
            System.out.println(user.getName() + " Поздравляем вы застрахованы");
        } else {
            System.out.println(user.getName() + " Вы нам не подходите. Не пройдена проверка безопасности, вы можете нанести убытки нашей СК");
        }
    }
}
