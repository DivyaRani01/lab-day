/* write a program in java to print the book detaitls along with authors details 
@ Divya                                                                */

//importing required packages 
import java.util.Scanner;
import static java.lang.System.*;
//creating main class library with main method
class library
{
    public static void main(String args[])
    {
       //creating scanner object  
       Scanner n = new Scanner(System.in);
       out.println("Enter the book name ");
       String bookname = n.nextLine();
       out.println("Enter the Author's name ");
       String name = n.next();
       out.println("Enter Author city name :");
	   String city = n.next();
	   out.println("Enter Author state name :");
		String state = n.next();
	   out.println("Enter Book Id number :");
		int id = n.nextInt();
	   out.println("Enter Author Address Pincode :");
		int pincode = n.nextInt();
        //creating object bookAuthor of class Author
		Author bookAuthor = new Author(pincode,name,city,state);
		//creating object title1 of class bookEntry
		bookEntry title1 = new bookEntry(id,bookname,bookAuthor);
		//calling bookDetail method from class bookEntry
		title1.bookDetail();
		n.close();
    }
}
//creating Author class to store author name and address
class Author{
	int pinCode;
	String authorName,cityName,stateName;
	
	//creating constructer that take author details as parameter
	Author(int pin,String name,String city,String State)
    {
		pinCode = pin;
		authorName = name;
		cityName = city;
		stateName = State;
	}
}

//Creating another class for book
class bookEntry{
	int bookId;
	String bookName;
	
	//Aggregating from class Author
	Author  bookAuthor;
	//creating constructer that take book details as parameter
	bookEntry(int id,String Name,Author writer){
		//Attribute of book
		bookId = id;
		bookName = Name;
		bookAuthor = writer;
	}
	
	//creating method of class book
	public void bookDetail(){
		/*
			printing Book details with Author details 
			using aggregation with class Author
		*/
		out.println("-----------Details----------------");
		out.println("Book Name : "+bookName+"\nBook Id : "+bookId+"\nAuthor Name : "+bookAuthor.authorName+"\nAuthor address : \n"+bookAuthor.cityName+",\n"+bookAuthor.stateName+",\npin-"+bookAuthor.pinCode);
		out.println("---------Thank you---------------");
	}
}