package oduor;

public class HumanCustomer extends Customer{

    public HumanCustomer(String name) {
        super(name);
    }
//overriddes the getName() method on Customer superclass
String getName(){
        return  "--> I am " + getName()+ ", in need of customer service";
}
}
