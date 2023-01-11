import java.util.Scanner;
class bin_dec
{
public static int bin2dec(int n)
{
    int i=0,result=0;
    while(n!=0){
    int remainder = n%10;
        result+=remainder*Math.pow(2,i);
        n=n/10;
        i++;
    }
    return result;
}
public static void main(String args[])
{ 
    System.out.println(bin2dec(1100));
}
}