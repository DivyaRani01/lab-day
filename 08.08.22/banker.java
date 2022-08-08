/*Writs a Program to create customer bank account and get customer details
                                                                                                                       */

package com.bankServices;

//Importing scanner class to get user input
import java.util.Scanner;
//importing systemclass from lang package
import static java.lang.System.*;

//Importing user defined package
import com.bankServices.*;

public class banker{
	
public static void main(String args[]){
	
	// scanner object
	Scanner obj = new Scanner(System.in);
	out.println("Enter Account Holder name : ");
	String userName = obj.next();
	out.println("Enter Account Number :");
	int accountNum = obj.nextInt();
	out.println("Enter Account Balance : ");
	int balance = obj.nextInt();
	int amount;
	out.println("-----------Select an option--------- ");
	out.println("To Deposit Amount, Enter  : add\nTo Withdraw Amount, Enter : get");
	String choice = obj.next();
	
	//creating an object
	cus user = new cus();
	//calling method of create account
	user.createAccount(userName,accountNum,balance);
	
	//Using switch case to perform user selected operation
	switch (choice){
		case "add":
		case "Add":
		case "ADD":
			user.checkAmount();
			out.println("Enter Amount to Deposit :");
			amount = obj.nextInt();
			user.depositAmount(amount); 
			break;
			
		case "get":
		case "Get":
		case "GET":
			user.checkAmount();
			out.println("Enter Amount to Withdraw ");
			amount = obj.nextInt();
			user.withdrawAmount(amount); //calling withdrawAmount method 
			break;
			
		default :
			out.println("Invalid ");
	}		
	
	user.getDetail();
	obj.close();
}
}