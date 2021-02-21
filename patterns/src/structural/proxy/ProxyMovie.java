package structural.proxy;

public class ProxyMovie implements Movie {

    private String path;
    private RealMovie realMovie;

    public ProxyMovie(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (realMovie == null) {
            realMovie = new RealMovie("c:/user/films/matrix.avi");
        }
        realMovie.display();
    }
}
