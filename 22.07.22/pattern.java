/*Program to print the pattern *
                               * *
                               * * *
                               * * * *
                               * * * * * upto n numbers*/
import java.util.Scanner;
class pattern{
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        System.out.println("______________pattern  is__________________________");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){                                                    //nested for loop
                System.out.print(" * " );
                
            }
            System.out.println();                                                      //for next line
        }
        
    }
}
