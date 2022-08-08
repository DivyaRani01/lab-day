/* Write a java program to Read array of integers and a a target from the user and the return indices of the two numbers such they add
 upto the target
 by Divya                                                                                                                                  */

 //importing required packages
import java.util.Scanner;
import static java.lang.System.*;
//creating class calc  with main method
class calc{
    public static void main(String args[])
    {   //creating scanner object 
        Scanner obj = new Scanner(System.in);
        out.println("Enter the length of the array");
        int len = obj.nextInt();
        //creating array as arr
        int[] arr;
        arr = new int[len];
        out.println("Enter "+len+" Elements ");
        //loop to store array values
        for(int i=0;i<len;i++){
            arr[i]=obj.nextInt();
        }
        out.println("Enter the sum of two elements");
        int target = obj.nextInt();
        //creating another object
        find search = new find();
		out.println("-------------Result---------------");
		
		// calling Sum method from find class using find object
		search.Sum(arr,len,target);
        //closing scanner object
		obj.close();

    

    }
}
//creating a class called find to find the all possible solution 
class find
{
    //creating a method Sum 
    public static void Sum(int arr[],int len,int target)
    {
        int length = len;
        //transversing the array
        for(int i=0;i<length;i++)
        {
            for (int j=i+1;j<length;j++)
            {
                //comparing 
                if(target == arr[i]+arr[j])
                {
                    out.println("Element: ["+arr[i]+","+arr[j]+"]");
					out.println("Index :["+i+","+j+"]");
                }
            }
        }

    }
}