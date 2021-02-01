package behavioral.chainofresponsibility;

public class UnprofitableFilter extends InsuredUserFilter {

    @Override
    public boolean doFilter(User user) {
        if (user.getProfit() < 0) {
            System.out.println(user.getName() + " Убыточный клиент");
            return false;
        } else if (this.getNext() == null) {
            return true;
        }
        return this.getNext().doFilter(user);
    }
}
