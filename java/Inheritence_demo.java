class Employee
{
	String name ;
	double salary;
	Employee(String n,double s)
	{
		salary =s;
		name=n;
	}
	void setName(String nam)
	{
		name=nam;
	}
	String getName()
	{
		return name;
	}
	void setSalary(double sal)
	{
		salary = sal;
	}
	double getSalary()
	{
		return salary;
	}
	void salaryRaise(double r)
	{
		salary += (salary*(r/100));
	}
}


class Inheritence_demo
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("nandha",1000);
		System.out.println(e1.getSalary());
		e1.salaryRaise(10);
		System.out.println(e1.getSalary());

	}
}