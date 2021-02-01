package behavioral.chainofresponsibility;

public abstract class InsuredUserFilter {

    private InsuredUserFilter next;

    public InsuredUserFilter linkWith(InsuredUserFilter next) {
        this.next = next;
        return next;
    }

    public abstract boolean doFilter(User user);

    public InsuredUserFilter getNext(){
        return this.next;
    }

}
