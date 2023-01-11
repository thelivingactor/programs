import java.util.Scanner;
class dec2bin
{
    public static int[] decimal_binary(int n)
    {
        int [] arr = new int[1000];
        int i=0;
        while(n>0)
        {
             arr[i] =n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.println(+arr[j]);
        }
        return arr;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
    System.out.println("enter the number");
    int n = in.nextInt();
        System.out.println("");
        int b[]=decimal_binary(n);
    }
}