import java.util.Scanner;
class fibonocci
{
    public static void main(String args[])
    {
        int n,j,temp=0,i=1,c=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(j=0;j<=n;j++)
        {
            System.out.println(c);
                c=temp+i;
              
                i=temp;
                temp=c;
            

        }
    }
}