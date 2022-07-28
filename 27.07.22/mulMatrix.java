/* wap to implement multidimensional array and find the multiplication of two matrix.
by Divya                                                                                             */
import java.util.Scanner;
import static java.lang.System.*;
class mulMatrix{
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
            
        } 
        out.println("-----enter values of second matrix------ ");
        //reading values of second array
        for(int i=0;i<rows;i++)                                                   //for loop for rows
        {
            for(int j=0;j<cols;j++)                                              //for loop for columns
            {
                br[i][j]=obj.nextInt();
            }
        
        }
        obj.close();                                                                  //  closing scanner object
        out.println("----------Multiplication of two matrix --------");
        multiply(rows,cols,ar,br,cr);
    }
       //creating method for multiplication of matrix
        public static void multiply(int rows,int cols,int ar[][],int br[][] ,int cr[][]){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                cr[i][j]=0;
                for(int k=0;k<cols;k++){
                    cr[i][j]+=ar[i][k]+br[k][j];
                }
                out.print(cr[i][j]+" ");
            }
            out.println(" ");
            
        }
         
    }
       
}