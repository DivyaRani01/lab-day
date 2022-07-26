/* WAP in java  to print all elements of  array in ascending order 
by : Divya Rani                                                                       */
import java.util.Scanner;
import static java.lang.System.*;                                    //importing required packages as per requirement
public class ascendingArray
{

public static void main(String args[])
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
	sorting(len,arr);                                                                    //calling sorting method
  
    obj.close();                                                               //closing scanner object
}

//method to sort array elements in ascending order
public static void sorting(int len,int arr[])
{
	for(int i=0;i<len;i++)
	{
		for(int j= i+1;j<len;j++)
		{
			if(arr[i]>arr[j])                            // swapping 
			{
				int temp = arr[i];               
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
	out.println("____________Sorted Array in Ascending order__________");
	
	
	for(int k: arr)
	{
		out.println(k+" ");
	}
}
}