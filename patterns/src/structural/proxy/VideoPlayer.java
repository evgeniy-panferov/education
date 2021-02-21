package structural.proxy;

/*
Данный пример, реализация виртуального заместителя.
Прокси - структурный прокси, который позволяет подставлять вместо реальных объектов специальные объекты заменители.
Позволяют сделать что-то до или после вызова передачи вызова оригинальному объекту.
 */
public class VideoPlayer {
    public static void main(String[] args) {
        Movie movie = new ProxyMovie("c:/user/films/matrix.avi");
        movie.display();
    }
}
