import java.util.Scanner;
import java.lang.Math;
public class grperfectsqr {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        float n = scanner.nextFloat();
        do
        {
            n++;
            if((Math.sqrt(n))%1==0.0)
            {
                System.out.println("the next perfect square is"+n);
                break;
            }
        }while(n>0);
    }
}

