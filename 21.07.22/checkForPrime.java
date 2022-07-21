//WAP to print the prime number
class checkForPrime
{
    public static void main(String args[])
    {
        int n=6,coef=0;                                                              //initialization
        for(int i=1;i<=n;i++)                                                         //for iterative loop
        {
            if(n%i==0)
            {
                coef++;
            }
        }
    if(coef==2)
    {
        System.out.println(n+"is prime");
    }
    else
    {
        System.out.println(n+"is not a prime");
    }
}
}