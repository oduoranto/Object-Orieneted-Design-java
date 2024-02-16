package oduor;

public class BusinessCustomer extends  Customer{

    //constuctor
    public BusinessCustomer(String name) {
        super(name);
    }
//overrides the getName() method on Customer
    String getName(){
        return "--> Hi, I am a business owner";
    }
}
