/* WAP To check a number is armstrong number or not
author : Divya Rani*/
import java.util.Scanner;
public class armstrongNum{
    public static void main(String[] args){            //main method
        Scanner obj=new Scanner(System.in);           //scanner object
        System.out.println("Enter a number");
        int n=obj.nextInt();                          //reading input
        boolean res=armstrongNum(n);                  //method calling
        if(res){
            System.out.println(n+"  is armstrong number");
                }
        else {
            System.out.println(n+"  is not a armstrong number");
        }
        obj.close();                                 //closing scanner

    }
    //Creating armstrong number
    public static boolean armstrongNum(int n){
        int sum=0,orgNum=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }  
        //checking for armstrong
        if(orgNum==sum){
            return true;
        } else{
            return false;
        
        }    
    }
}