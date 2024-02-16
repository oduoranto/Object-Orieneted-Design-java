package Oduor;

public class Snake extends Animal implements Predator,Prey{
    public Snake(String type) {
        super(type);
    }

    @Override
    public void chase() {
        System.out.println(getType() + " is chasing a mouse down its burrow");
    }

    @Override
    public void run() {
        System.out.println(getType() + " is running away from the hawk");
    }
}
