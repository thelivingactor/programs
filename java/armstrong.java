import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        int num,n,temp,j=0;
        Scanner in = new Scanner(System.in);
        num=in.nextInt();
        n=num;
        while(n != 0)
        {
            temp =n%10;
            System.out.println(temp+"the given number is armstrong number"+n);
            j=j+(temp*temp*temp);
            System.out.println(j+"the given number is armstrong number"); 

            n=n/10;
            System.out.println(n+"the given number is armstrong number"); 

        }
        if(j==num)
        {
            System.out.println(num+"the given number is armstrong number");
        }
        
    }
}