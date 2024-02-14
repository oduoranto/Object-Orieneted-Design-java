package oduor;

public class BusinessCustomer extends  Customer{

    public BusinessCustomer(String name) {
        super(name);
    }

    String getName(){
        return "--> Hi, I am a business owner";
    }
}
