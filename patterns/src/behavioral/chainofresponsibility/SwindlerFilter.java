package behavioral.chainofresponsibility;

public class SwindlerFilter extends InsuredUserFilter {

    @Override
    public boolean doFilter(User user) {

        if (user.isSwindler()) {
            System.out.println(user.getName() + " Мошенник, осторожно!");
            return false;
        } else if (this.getNext() == null) {
            return true;
        }
        return this.getNext().doFilter(user);
    }
}
