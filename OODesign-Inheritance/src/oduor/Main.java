package oduor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        String name;

            System.out.print("Hi, Please enter your name.\n-->");
             name = sc.nextLine();
            System.out.print("Enter your operation;\n" +
                    "1.---> Human\n" +
                    "2.---> Business\n---> ");

        int choice = sc.nextInt();
        if(choice == 1){
            HumanCustomer humanCust1 = new HumanCustomer(name);
            System.out.println(humanCust1.getName());
        }
        else if(choice ==2){
            BusinessCustomer bizCustomer1 = new BusinessCustomer(name);
            System.out.println(bizCustomer1.getName());
        }

    }
}
