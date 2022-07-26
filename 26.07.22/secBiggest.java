/* wap to print the  second biggest number among all of the array elements values.
By : Divya Rani                                                                                                 */
import java.util.Scanner;                                                                  //importing required java packages
import static java.lang.System.*;
class biggestArray{
    public static void main(String args[])                                                //main method
    {
        Scanner obj = new Scanner(System.in);                                                //creating object scanner
        out.println("Enter the size of the array");
        int len =obj.nextInt();   
        //creating an array object.   
        int arr[]=new int[len];
        out.println("_________Enter array value__________");                        
         //reading the size of an array
        for(int i=0;i<len;i++)
        {
            arr[i]=obj.nextInt();
         }
        int res = secBiggest(len,arr);   
        out.println("The Second biggest number in array elements is  " +res);                     //calling secBiggest method in main method
     }
     public static int secBiggest(int len,int arr[]){
        
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            { 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          
        }
        
        return arr[arr.length-2];                                         //returning biggest value among all the array.
     }
    
}