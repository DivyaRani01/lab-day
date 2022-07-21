//Program to print leap year btw 1947 to 2022
class leapYear{
    public static void main(String arg[]){                                                             //main method
        int i;
        for(i=1947;i<=2022;i++){                                                                      //for loop
            if((i%4==0) && (i%100!=0) || (i%400==0))                                         //cond if i either divisible by 4 or satisfaiedone of the cond.
            {
                System.out.println(i+"  is a leap year");
            }
            
        }
    }
}