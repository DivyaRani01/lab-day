/* wap to implement multidimensional array and find the addition of two matrix.
by Divya                                                                                             */
import java.util.Scanner;
import static java.lang.System.*;
class addMatrix{
    public static void main(String args[])
    {
         int rows,cols;
        Scanner obj= new Scanner(System.in);                                  //creating Scanner object 
        out.println("Enter number of rows : ");
        rows = obj.nextInt();
        out.println("Enter number of columns : ");
        cols = obj.nextInt();
        //creating array with specified size
        int ar[][] = new int [rows][cols];
        int br[][] = new int [rows][cols];
        int cr[][] = new int [rows][cols];
        out.println("------enter values of first matrix----- ");
        //reading values of first array
        for(int i=0;i<rows;i++)                                                   //for loop for rows
        {
            for(int j=0;j<cols;j++)                                              //for loop for columns
            {
                ar[i][j]=obj.nextInt();
            }
            out.print(" ");
        } 
        out.println("-----enter values of second matrix------ ");
        //reading values of second array
        for(int i=0;i<rows;i++)                                                   //for loop for rows
        {
            for(int j=0;j<cols;j++)                                              //for loop for columns
            {
                br[i][j]=obj.nextInt();
            }
            out.print(" ");
        }
        //adding first and second array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                cr[i][j]=ar[i][j]+br[i][j];
            }
            
        }
        out.println("----------Addition of two matrix --------");
        //printing values of the addition result
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                out.print(cr[i][j]+" ");
            }
           out.println(" ");
        }
        obj.close();                                                                    //closing scanner object
    }
}