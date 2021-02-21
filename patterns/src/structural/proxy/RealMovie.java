package structural.proxy;

public class RealMovie implements Movie {
    private String path;

    public RealMovie(String path) {
        this.path = path;
        load();
    }

    public void load() {
        System.out.println("load film");
    }

    @Override
    public void display() {
        System.out.println("display film");
    }
}
