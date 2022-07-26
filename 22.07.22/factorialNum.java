//program to find the factorial of a given number
import java.util.Scanner;
class factorialNum{
    public static void main(String args[])
    {
         int fac=1; 
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number for which you want to print the factorial : ");
        int n = obj.nextInt();
       // int n=8, fac=1;                                 initilize the value
                                                         
        for(int i=1;i<=n;i++){                                              //for loop 
            fac = fac *i;

        }
System.out.println("factorial of "+n+ " is "+fac);
        

    }
}