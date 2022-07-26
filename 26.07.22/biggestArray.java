/* wap to print the biggest number among all of the array elements values.
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
              findMax(len,arr);                         //calling findMax method in main method
     }
     public static int findMax(int len,int arr[]){
        int max=arr[0];      //assuming 0th element is biggest
        //checking for the biggest element
        for(int i=0;i<len;i++)
        {
           if(max<arr[i]){
            max=arr[i];
           }

        }
        out.println("The biggest number in array elements is  "+max);
        return max;                                         //returning biggest value among all the array.
     }
    
}