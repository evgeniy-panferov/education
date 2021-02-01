package behavioral.chainofresponsibility;

public class User {
    private String name;
    private boolean swindler;
    private Long profit;

    public boolean isSwindler() {
        return swindler;
    }

    public void setSwindler(boolean swindler) {
        this.swindler = swindler;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
