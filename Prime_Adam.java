import java.util.*;
class Prime_Adam
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Prime_Adam ob=new Prime_Adam();
        System.out.println("Enter range");
        System.out.print("From"+" ");
        int m=sc.nextInt();
        System.out.print("to"+" ");
        int n=sc.nextInt();
        if(m<n)
        {
            ob.adam_prime(m,n);//to find Prime_Adam integers between m & n
        }
        else
            System.out.println("Invalid Input");
    }//main()
    void adam_prime(int m,int n)
    {
        int c=0;//to calculate frequency
        int k=0;
        System.out.println("The prime_adam integers are:");
        for(int i=m+1;i<n;i++)
        {
            for(int j=1;j<=i;j++)//checking prime no.
            {
                if(i%j==0)
                {
                    k++;
                }
            }
            if(k==2)
            {
                int rev=0;
                int num=i;
                int d=0;
                while(num>0)
                {
                    d=num%10;
                    rev=rev*10+d;
                    num=num/10;
                }
                int sqnum=i*i;
                int SquareRev=rev*rev;
                int SquareNum=0;
                d=0;
                while(sqnum>0)
                {
                    d=sqnum%10;
                    SquareNum=SquareNum*10+d;
                    sqnum=sqnum/10;
                }
                if(SquareNum==SquareRev)
                {
                    System.out.print(i+" ");
                    c++;
                }
            }
        }
        System.out.println("\n"+"Frequency of prime_Adam integers:"+c);
    }//adam_prime()
}