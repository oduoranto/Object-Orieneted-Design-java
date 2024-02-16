package oduor;

//an abstarct class it canot be used to create and object
//used so as to avoid code duplication
public abstract class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
