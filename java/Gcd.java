class Gcd
{
	int i =0;
	public int Main(int num1,int num2)
	{
		if(((num1%(Math.max(num1,num2)-i)==0)  && (num2%(Math.max(num1,num2)-i)==0)))
		{
			return Math.max(num1,num2)-i;
		}
		else
		{
			i++;
			return Main(num1,num2); 
		}
	}


	public static void main(String args[])
	{
		Gcd g = new Gcd();
		System.out.println(g.Main(48,18));
	}
}