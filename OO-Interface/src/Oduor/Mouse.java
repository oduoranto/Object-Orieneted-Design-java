package Oduor;

public class Mouse extends Animal implements Prey{

    public Mouse(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println(getType() + " is running away from a Snake");
    }
}
