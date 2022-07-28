    /* wap in java to print the number of duplicates values in array
    by Divya                                                                                                 */
    import java.util.Scanner;
    import static java.lang.System.*;   
    class duplicates
    {
        public static void main(String args[])
        {
        //creating scanner object 
        Scanner obj = new Scanner(System.in);
        out.println("Enter the size of the array: ");
        int len = obj.nextInt();
        
        //creating an array object
        int ar[] = new int[len];
        out.println("Enter "+len+" elements :");
        
        for (int i=0; i<len;i++)                                       // for loop for storing  user's input value
        {
            ar[i] = obj.nextInt();
        }
            out.println(" --------Duplicate elements---------") ;
            duplicateElements(len,ar);                                                          //calling sorting method
    
        obj.close();                                                       //closing scanner objec
        }  
     // creating separate method for  printing duplicate element                                                   
        public static void duplicateElements(int len,int ar[])
        { 
            int count=0;
        for(int i=0;i<len;i++)
           {
        for(int j=i+1;j<len;j++)
               {
        if(ar[i]==ar[j])
                   {
            
            out.println(ar[j]+" is the duplicate element.");
            ++count;
                   }
        out.println("duplicate element =  "+count);
                }
           }
        }
}