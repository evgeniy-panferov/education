package structural.decorator;

/*
Декоратор - паттерн, который позволяет на лету добавлять новое поведение, помещая их в классы обертки.
Примеры из java InputStream, OutputStream и их подклассы.
 */
public class DecoratorClient {

    public static void main(String[] args) {
        Player player = new ThreeDPlayer(new VideoPlayer(new AudioPlayer()));
        player.play();
    }

}
