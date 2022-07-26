/*program to check for palindrome number 
Author : Divya Rani    */
import java.util.Scanner;                             //importing java package
public class palindrome{
    public static void main(String args[])            //main method
    {       
        Scanner obj= new Scanner(System.in);           //scanner object
        System.out.println("Enter a number ");
        int n = obj.nextInt();
        boolean res=palindrome(n);                    //method calling
        if(res){
            System.out.println(n+"  is palindrome number");
                }
        else {
            System.out.println(n+"  is not a palindrome number");
        }
        obj.close();                                  //close scanner object.

    } //logic for reversing a number
    public static boolean palindrome( int n){
        int rem,rev_num=0,temp=n;
        while(n>0){
            rem=n%10;                                    //remainder
            rev_num = rev_num*10+rem;                   //reverse number
            n/=10  ;                                    //iteration
        }
        //checking for palindrome
        if(rev_num==temp){
            return true;
        } 
        else{
            return false;
        
        }    

    }
    
}