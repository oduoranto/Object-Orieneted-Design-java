package Oduor;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************************");
        Mouse mouse = new Mouse("Wood mouse");
        mouse.run();

        System.out.println("*************************");
        Hawk hawk = new Hawk("Red-tailed hawk");
        hawk.chase();

        System.out.println("*************************");
        Snake snake = new Snake("Cobra");
        snake.chase();
        snake.run();
    }
}
