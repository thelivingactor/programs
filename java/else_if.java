import java.util.Scanner;
class else_if{
	public static void main(String args[])
	{
		int mark;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the mark");
		mark=in.nextInt();
		if(mark>90)
		{
			System.out.println("s grade");
		}
		else if(mark>80&&mark>90)
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("i dont care");
		}
	}
}	
		