class rectangle{
    int length,breadth;
    rectangle()
    {
        length =5;
        breadth=10;
    }
    int area()
    {
        int a = length*breadth;
        return a;
    }
}
class constructor
{
    public static void main(String args[])
    {
        rectangle o = new rectangle();
        System.out.println(""+o.area());
    }
}