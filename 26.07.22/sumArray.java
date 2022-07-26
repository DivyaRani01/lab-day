/* Wap in java to print the sum of all the elements of the array.
Author by : Divya Rani                                                                       */
import java.util.Scanner;
import static java.lang.System.*;                                    //importing required packages as per requirement
public class sortDescending
{

public static void main(String args[])                                //main method
{
	//creating scanner object 
	Scanner obj = new Scanner(System.in);
	out.println("Enter the size of the array: ");
	int len = obj.nextInt();
	
	//creating an array object
	int arr[] = new int[len];
	out.println("Enter "+len+" elements :");
	
	for (int i=0; i<len;i++)                                       // for loop for storing  user's input value
	{
		arr[i] = obj.nextInt();
	}
	int sum = totalSumOfArray(len,arr);    
    out.println("The sum of all the elements of array values is  "+sum);                                                                //calling sorting method
   obj.close();                                                  //closing scanner object
}
public static int totalSumOfArray(int len, int arr[]){
    int total=0;
    for(int k:arr){                                      //for each loop 
        total+=k;
    }
    return total;                                         //returning the sum of elements
}
}