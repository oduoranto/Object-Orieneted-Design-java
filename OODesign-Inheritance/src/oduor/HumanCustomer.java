package oduor;

public class HumanCustomer extends Customer{

    public HumanCustomer(String name) {
        super(name);
    }

String getName(){
        return  "--> I am " + getName()+ ", in need of customer service";
}
}
