class Gcd1
{
	public int Main(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		if(a<b)
		{
			return Main(a,b%a);
		}
		else{
		return Main(b,a%b);
	}
	}


	public static void main(String args[])
	{
       Gcd1 a = new Gcd1();
       System.out.println(a.Main(12,8));
	}
}