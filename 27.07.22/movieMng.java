/* wap in java to create a movie management system
by Divya                                                                                */
import java.util.Scanner;
import static java.lang.System.*;                                 //importing required java packages
class movieMng{
    public static void main(String args[]){                      //main method
        //scanner object
        Scanner obj=new Scanner(System.in);
        out.println("Enter movie name ");
        String movieName =obj.next();
        out.println("Enter Start time ");
        int startTime =obj.nextInt();
        out.println("Enter End name ");
        int endTime =obj.nextInt();
        out.println("Enter movie Price");
        int moviePrice =obj.nextInt();

        movie show= new movie();                                  //creating object show

        show.setDetail(movieName,startTime,endTime,moviePrice);
    
	show.getDetail();                                         //calling getdetail method
	obj.close();                                              //closing scanner object
}
}

class movie{
	// instance variable
	String Name;
	int Start,End,Price;
	
	
	public void setDetail(String name,int start,int end,int price){                              //method setdetail
		Name= name;
		Start = start;
		End = end;
		Price = price;	
	}
	public void getDetail(){
		
        out.println("Movie Name : "+ Name );
		out.println("Screen Time : "+Start+":00 pm - "+End+":00 pm");
		out.println("Movie Price : Rs."+Price+"/-");
	}
}
    