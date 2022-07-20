class conditionalOperator {
    public static void main(String args[]){
        int a=33, b=72,c=98, d=22, larger, largest;
        larger=(a>b)?(a>c?a:c):(b>c?b:c);
        largest=(a>b && a>c && a>d)?a : (b>c && b>d?b:(c>d?c:d));
        System.out.println("larger number among "+a+" , "+b+" and "+c+" is "+larger);
        System.out.println("largest number among  "+a+" , "+b+", "+c+ " and "+d+" is "+largest);


    }
}