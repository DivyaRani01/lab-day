//Program to find the prime number upto n numbers.
import java.util.Scanner;
class primeNum
{
    public static void main(String[] args){
        int i,j,c=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print the prime numbers ");
        int n = obj.nextInt();
        System.out.println("Prime numbers are :");
       for( i=2;i<n;i++)
        {
            
            for(j=2;j<i;j++){
            if(i%j==0){
               c++;
            }
            }
        if (c==0)
        {
            System.out.print(i);
        }

    }
}
}