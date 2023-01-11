import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        int  i,n;
        BigInteger c;
        c=new BigInteger("1");
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            c=c*i;
            
        }
        System.out.println(c);
    }
}