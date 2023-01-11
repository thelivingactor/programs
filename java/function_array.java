import java.util.Scanner;
import java.util.Arrays;
class function_array
{
public static int[] sortarray()
{
    Scanner in = new Scanner(System.in);
    System.out.println("enter the limit");
    int n = in.nextInt();
    int []a = new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    Arrays.sort(a);
    return (a);

}
public static void main(String args[])
{
    int arr[] = sortarray();
    for(int b:arr)
    {
        System.out.println(" "+Arrays.toString(arr));
    }

}
}
