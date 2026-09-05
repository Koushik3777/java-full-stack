 package day6;
 import java.util.*;
class customer {
    public String name;
    public int age;
    public String address;
    public String contact;

    public customer(){
        //default constructor
    }
    public customer(String name, int age, String address, String contact){
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    void greeting(){
        System.out.println("HELLO, GREETINGS OF THE DAY !!");
    }
}
public class customerObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer[] customers = new customer[2];
        System.out.println("ENTER THE CUSTOMERS DATA : ");
        for(int i=0; i<2; i++){
            System.out.print("ENTER NAME : ");
            String name = sc.nextLine();
            System.out.print("ENTER AGE : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("ENTER ADDRESS : ");
            String address = sc.nextLine();
            System.out.print("ENTER CONTACT : ");
            String contact = sc.nextLine();
            customers[i] = new customer(name, age, address, contact);
        }

        for(customer c : customers){
            System.out.println("NAME : "+c.name+" AGE : " + c.age+" ADDRESS : "+ c.address+" CONTACT : "+ c.contact+" ");
        }
    }
}
