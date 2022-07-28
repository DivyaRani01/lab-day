/* wap to create a customer class and implement a customer management system.
by Divya                                                                                      */
import java.util.Scanner;                                                                     //importing scanner from utility package
class customerMng{
    public static void main(String args[])                                                    // creating main method
    {
        int amount=5000,accountNumber = 4556783,accountBalance=70000;
        String customerName="Ram";
        customerDetails customer1 = new customerDetails();
	    customer1.setAccountDetail(accountNumber,customerName,accountBalance);
	    customer1.getAmount();

	    customer1.depositAmount(amount);                                       //  calling getAmount METHOD
	    customer1.getAmount();
	    customer1.withdrawAmount(amount);
	    customer1.getAmount();

    }
}
class customerDetails                                                            //creating subclass
{
    private int accnumber, accBalance;
    private String accHolderName;
    //creating method to set details of customer
    public void setAccountDetail(int accountNumber,String customerName,int accountBalance)
    {
        accnumber = accountNumber ;
        accHolderName = customerName;
        accBalance = accountBalance;

    }
    //creating the method for adding amount in account
    public void depositAmount(int amount)
    {   
        System.out.println("You are depositing. "+amount);
        accBalance += amount;
    }
    //creating method to withdraw the amount
     public void withdrawAmount(int Amount)
    {
	     System.out.println("You are withdrawing "+Amount);	
 	     accBalance -= Amount;
	
    }
    //creating get method to display the account information
    public void getAmount()
    {
	System.out.println(accHolderName+", Sir You Have "+accBalance+" in Your Account");
    }
}