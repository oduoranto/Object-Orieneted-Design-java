package oduor;

public abstract class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
