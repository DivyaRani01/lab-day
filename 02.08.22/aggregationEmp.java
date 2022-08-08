/* 
Write a java program to print employee details using aggregation between the classes.
@ Divya                                                                                           
 */
import java.util.Scanner;         //importing java package for scanner class.
import static java.lang.System.*;        //importing suystem package 
class aggregation{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        out.println("Enter your name ");
        String name = n.nextLine();
        out.println("Enter your employee id ");
        int id = n.nextInt();
        out.println("Enter your city Name");
        String city= n.next();
        out.println("Enter your state Name ");
        String state = n.next();
        out.println("Enter your address Pincode");
        int pinCode = n.nextInt();

//creating object adr1 of class address
         Address adr1 = new Address(pinCode,city,state);
//creating emp1 as object of class employee
         Employee emp1 = new Employee(id,name,adr1);
//calling getdetail method from class employee
         emp1.getDetail();
         n.close();

    }
}

//creating Addressclass to store the employee details
   class Address{
      String stateName; 
      String cityName;
      int pinCode;
//creating constructor that takes address details as parameter. 
    Address(int pin,String city,String state){
        //attributes of address class
        pinCode = pin;
        cityName= city;
        stateName= state;
        
    }
  }
//creating employee class   
    class Employee
    {
        int employeeId;
         String employeeName,employeeAddress;

        Address adr;                                                //aggregating with class Address
 //creating constructor that takes employee details as parameter. 
    Employee(int id, String name,Address addr){
        employeeId = id;
        employeeName = name;
        adr = addr;
        
    }
//creating get method to print the details of the employee  with address details using aggregration with class address
public void getDetail(){
    out.println("------------Employee details-----------------");
    out.println("Hello  "+employeeName+"\nYour Employee id is "+employeeId+"\nYour Address is "+adr.cityName+" ,\n"+adr.stateName+"\nYour pincode is "+adr.pinCode);
    out.print(".........Thank you and Have a nice day...........!");
}

 }
