/* wap to check armstrong number for n digits 
Author : Divya Rani                               */
import java.util.Scanner;                                               //importing required java packages
import static java.lang.System.*;
import java.lang.Math;
class nArmstrongNum{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);                                //creating scanner object
        out.println("Enter the Number ");
        int n= obj.nextInt();
        boolean res= armstrong(n);                                            //method calling 
        if(res){
            out.println(n+ "  is Armstrong number");
        }
        else{
            out.println(n+ "  is not an Armstrong number");
        }
        obj.close();                                                      //closing scanner object
    } //armstrong method
    public static boolean armstrong(int n){
        int sum=0,digit=0,temp=n,num=n;
        //calculating number of digits
        while(num!=0){
            num=num/10;
            digit++;
        }//creating armstrong number
         while(n!=0){
            int rem=n%10;                                         //remainder
            sum+=(Math.pow(rem,digit));                            
            n=n/10;                                                //iteration
        }  
        //checking for armstrong
        if(temp==sum){
            return true;
        } else{
            return false;
        
        }    
    }
}
