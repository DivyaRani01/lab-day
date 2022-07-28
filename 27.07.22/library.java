/* wap for library management by using objects , methods abd subclasses  
by Divya                                                                */
//creating main class
class library{            
    public static void main(String args[])
    {
        bookShell book1=new bookShell();
        book1.setBook(101,"Blue umbrella" ,81);
        bookShell book2=new bookShell();
        book2.setBook(102,"Mindset",150);
        book1.getBook();
        book2.getBook();

    }
}
//creating subclass
class bookShell                                                             
{                                        
      private int bookNum,bookPrice;                                                                        //instance variables as private to add security.
     private String bookName;
//adding new book to bookShell
    public void setBook(int bNum,String bName,int bPrice){
        bookNum = bNum;
        bookName = bName;
        bookPrice=bPrice;
    }
    //print details of book
    public void getBook(){
        System.out.println(bookNum+" is the book whose named is "+bookName+"and its price is Rs."+bookPrice);
    }
}