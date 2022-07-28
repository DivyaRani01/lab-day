/* Wap in java to print two Dimensional array and also print the elements
by Divya                                                                                                           */
import java.util.Scanner;                                              //importing java packages 
import  static java.lang.System.*;
class twoDim{
    public static void main(String args[]){
        int rows,cols;
        Scanner obj= new Scanner(System.in);                                  //creating Scanner object 
        out.println("Enter number of rows : ");
        rows = obj.nextInt();
        out.println("Enter number of columns : ");
        cols = obj.nextInt();
        //creating array with specified size
        int arr[][] = new int [rows][cols];
        //reading values of an array
        for(int i=0;i<rows;i++)                                                   //for loop for rows
        {
            for(int j=0;j<cols;j++)                                              //for loop for columns
            {
                arr[i][j]=obj.nextInt();
            }
        }
        //calling display method
        display(rows,cols,arr);
        obj.close();                                                    //closing scanner object

        }
        //creating method for displaying elements of array
        public static int display(int rows,int cols,int arr[][])
        {
            for(int i=0;i<rows;i++)                                                   //for loop for displaying rows
        {
            for(int j=0;j<cols;j++)                                              //for loop for displaying columns
            {
                out.println(arr[i][j]+" ");
            }
            out.println(" ");
        }

        }
}