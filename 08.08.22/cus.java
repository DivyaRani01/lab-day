/*
	Program to create a package of customer class with bankServices methods
	@ Divya 
*/

//creating package
package com.bankServices;
//import java.lang.System.*;

class cus{
	//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
	//method to store information
	public void createAccount(String name,int num,int bal){
		userName = name;
		accountNum = num;
		balance = bal;	
	}
	
	//creating depositAmount method to add amount
	public void depositAmount(int amount){
		if(amount > -1){
			balance += amount;
			out.println(" "+userName+" your current balance after depositing Rs."+amount+" is : "+balance);
		}
		else {
			out.println("---Invalid Amount.------");
		}
	}
	
    //creating withdrawAmount method to delete amount from balance
	public void withdrawAmount(int amount){
		if(amount>balance){
			out.println("--Account Balance is not enough to Withdraw Amount.");
		}
		else{
			balance -= amount;
		    out.println("-------------"+userName+" your current balance after withdrawing Rs."+amount+" is : "+balance);
		}
	}
	//creating getAmount method to check balance
	public void checkAmount(){
		out.println("----------------"+userName+" your current balance is : "+balance);
	}
	
	//Creating method getDetail to display information of User
	public void getDetail(){
		out.println("-----Account Detail------");
		out.println("Account Holder  NAME : "+ userName +"\nAccount Number : "+accountNum+"\nAccount Balance: Rs."+balance+"/-");
		
	}
}