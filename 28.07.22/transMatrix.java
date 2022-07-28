/* wap in java to print the transpose of the matrix by using multidimensional array .
by Divya                                                                                         */
import java.util.Scanner;
import static java.lang.System.*;                              //importing required packages 
class transMatrix
{
    public static void main(String args[])                     //creating main method
    {
        //creating scanner object for user's input.
        Scanner obj = new Scanner(System.in);                  
        out.println("Enter the number of rows");
        int rows = obj.nextInt();
        out.println("Enter the number of columns");
        int cols = obj.nextInt();
        //creating array with specified size
        int arr[][] = new int[rows] [cols];
        
        out.println("Enter the values of the matrix");
        //reading values of the array
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               arr[i][j]=obj.nextInt();
                
            }
        }

        //printing values of the above matrix
        out.println("----The above matrix before transpose------- ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
              out.print(arr[i][j]+" ");
            }
            out.println(" ");
        }       
       //printing  transpose values of the above matrix
        out.println("-----The above matrix after transpose ------");
        for(int i=0;i<cols;i++)                                    //for loop for column     
        {
            for(int j=0;j<rows;j++)                                 //for loop for rows    
            {
              out.print(arr[j][i]+" ");                             //switching the values of rows with that of column.
            }
            out.println(" ");
        }
    }
    
}
