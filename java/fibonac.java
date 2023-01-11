class fibonac
{
	public static int fib(int n)
	{
		if(n==0 ||n==1)
		{
			return n;

		}
		else
		{
			return fib(n-1)+fib(n-2);
		}

	}

	public static void main(String args[])
	{
		fibonac f = new fibonac();
		System.out.println(f.fib(4)); 
	}

}