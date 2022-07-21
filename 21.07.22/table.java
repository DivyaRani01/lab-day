//Program to print he table by taking input from the user
import java.util.Scanner;                                         //import util pacakage from java library
class table
{
    public static void main(String args[])                                      //main method
    {                       
        Scanner obj = new Scanner(System.in);                      // object for scanner
        System.out.println("Enter a number for which you want to print the table");
        int x= obj.nextInt();
        System.out.println("Enter a number upto which you want to print the table");
        int y= obj.nextInt();
        for(int i=1;i<=y;i++)
        {
            System.out.println(x+" X "+i+" = "+(x*i));
           
        }
        obj.close();                                                    //close the scanner obj
     }
}