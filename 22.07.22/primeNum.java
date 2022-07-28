//Program to find the prime number upto n numbers.
import java.util.Scanner;                                            //importing scanner package
class primeNum
{
    public static void main(String[] args){
        int i,j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print the prime numbers ");      // n is limit
        int n = obj.nextInt();                                                                       //creating Scanner object
        System.out.println("Prime numbers are :");
       for( i=1;i<=n;i++)
        {

             int c=0;
            for(j=1;j<=i;j++)                 //can also be wriiten as j=2;j<i
            {
            if(i%j==0){
               c++;                                                                      //c is coefficient
            }
            }
        if (c==2)                                                  //if coef is =2 then its prime number 
        {
            System.out.println(i);
        }
        obj.close();  }
}
}
//java -verbose programname to check the time utilized by jvm.