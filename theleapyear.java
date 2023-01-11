
import java.util.Scanner;
public class theleapyear {
    public static void main(String args[])
    {
        int year;
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if(year%4==0||(year%100==0&&year%400==0))
        {
            System.out.println("it is leap year");
        }
        else
        {
            System.out.println("it's not a leap year");
        }
        in.close();
    }
}
        
