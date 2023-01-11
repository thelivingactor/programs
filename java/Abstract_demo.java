abstract class Welcome
{
	abstract void welcome();
}
class Teacher extends Welcome
{ 
	void welcome(){
	System.out.println("welcome Teacher");
    }
}
class Student extends Welcome
{ 
	void welcome() {
	System.out.println("welcome Student");
    }
}
public class Abstract_demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Teacher t1 = new Teacher();

		Welcome w1[] = new Welcome[4];
		w1[0]= new Student();
		w1[1]= new Teacher();
 
		for(Welcome w : w1 )
		{
			w.welcome();
		}

	}
}