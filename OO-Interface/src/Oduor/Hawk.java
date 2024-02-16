package Oduor;

public class Hawk extends  Animal implements Predator {
    public Hawk(String type) {
        super(type);
    }

    @Override
    public void chase() {
        System.out.println(getType() + " is chasing a rabbit");
    }
}
