/* Write a java program to manage and store details of the movies.
@ Divya                                                                                    */

//importing required packages to be used in our program
import java.util.Scanner;
import static java.lang.System.*;
//creating class theater with main method
class theater{
    public static void main(String args[])
    {   //creating scanner object 
        Scanner n = new Scanner(System.in);
        out.println("Enter the Movie Name ");
        String movieName = n.next();
        out.println("Enter the start time of the Movie");
        int startTime = n.nextInt();
        out.println("Enter the end time of the Movie");
        int endTime = n.nextInt();
        out.println("Enter the Movie Price ");
        int price = n.nextInt();
        //creating object show of class movie
        movie show = new movie();
        out.println("Choose the required operation :");
	    out.println("to add details enter   : add \nto print details enter : print");
	   String choice = n.next();
	
	switch(choice){
		//callng addDetail method of movie class using show object
		case "add": show.addDetail(movieName,startTime,endTime,price);
					break;
		case "Add": show.addDetail(movieName,startTime,endTime,price);
					break;
		case "ADD": show.addDetail(movieName,startTime,endTime,price);
					break;
					
		//callng printDetail method of movie class using show object			
		case "print": show.printDetail(movieName,startTime,endTime,price);
					break;
		case "Print": show.printDetail(movieName,startTime,endTime,price);
					break;
		case "PRINT": show.printDetail(movieName,startTime,endTime,price);
					break;
		default : System.out.println("Invalid choise...");
	}
    //closing scanner object here closing n
	n.close();

  }
}
//creating another class called movie
class movie{
    //instance variables
    String Name;
    int Start ,End,Price;
    //creating addDetail method to store data of movies
    public void addDetail(String name,int start,int end,int price)
    {
        Name = name ;
        Start = start;
        End = end;
        Price = price;
        out.println("-----------Movie details added successfully.--------------");
        
    }
    //creating a method to print all the movie details.
    public void printDetail(String movieName, int startTime,int endTime , int price)
    {
        out.println("------------Printing Details-----------");
        out.println("Movie Name "+movieName+"\n----Movie Timmings---- ");
        out.println("Start time "+startTime+":00 pm \nEnd time "+endTime+":00pm \nMovie price : Rs."+price);
        out.println("Thank you ");

    }
}
