/* Write a java program  to illustrate Calculator class with addition, subtraction, multiplication methods that can take any number of
 parameters to perform the operation, without using method/constructor overloading .
 by @Divya     
                                                                                                                               */
 //importing required packages used in program
 import java.util.Scanner;
 import static java.lang.System.*;
 //creating class calculator with main method
 class Calculator{
    public static void main(String args[]){
        //creating scanner object
        Scanner obj = new Scanner(System.in);
        out.println("Enter the length of the array");
        int len = obj.nextInt();
        int arr[];
        //creating array object to store 
         arr = new int[len];
        out.println("Enter "+len+" Element");
        //loop 
        for(int i=0;i<len;i++){
            arr[i]= obj.nextInt();
        }
        int start =arr[0];
        out.println("----------Select the required operation to perform calculation------------- ");
        out.println("To perform addition       : +\nTo perform substraction   : -\nTo perform multiplication : *\nTo perform division       : /");
        //storing selection in character choice
		char choice = obj.next().charAt(0);
		
		//using switch to perform user seleted operation
		switch(choice){
			case '+' : addition(arr);                                     
						break;
			case '-' : subtraction(start,arr);                             
						break;
			case '*' : multiplication(arr);
                         break;
			case '/' : division(start,arr);
						break;
			default : System.out.println("Invalid operation");
		}
		obj.close();
	 }
 //creating method1 to perform addition operation
 public static void addition(int ...args){
    int result=0;
    out.println("Addition of elements : ");
    //for each loop for adding values
    for(int x: args){
        out.println(x+" ");
        result +=x;
    }
    out.println("result is "+result+" ------ " );
 } 
 //creating method2 to perform subtraction operation
 public static void subtraction(int start,int ...args){
    int result=0;
    out.println("subtraction of elements ");
    //for each loop for subtracting  values
    for(int x: args){
        out.println(x+" ");
        if (result == 0 && start == 0){
				result -= x;
			}
			else if(result != 0){
				result -= x;
			}
			
			if (result == 0){
				result = start;
				start = 0;
			}
    }
    out.println("result is "+result+" ------" );
 } 
 
//creating method3 to perform multiplication operation
 public static void multiplication(int ...args){
    int result=1;
    out.println("Multiplication of elements  ");
    //for each loop to multiply  values
    for(int x: args){
        out.println(x+" ");
        result *=x;
    }
    out.println("result is "+result+" ------ " );
 } 
	
	//method 4 to perform division on any number of values using varargs	
	public static void division(int start,int ...args){
		int result = 0;
		System.out.println("Division of elements\n");
		
		//dividing values
		for(int x : args){
			System.out.println(x+" ");
			if(result != 0){
				result /= x;
			}
			if (result == 0){
				result = start;
				start = 0;
			}
			
		}
		
		System.out.println("result is "+result+" ------");
	}
    
 }


