class box
{
    float length;
    float breadth;
    public box()
    {
        length=10;
        breadth=20;
    }
    public box(float x,float y)
    {
        length=x;
        breadth=y;
    }
    public box(float x)
    {
        length=breadth=x;
    }
    float area()
    {
        float a=length*breadth;
        return a;
    }
}
class constructor_overloading
{
    public static void main(String args[])
    {
        box o = new box();
        System.out.println(""+o.area());
        box o2 = new box(5,3);
        System.out.println(""+o2.area());
        box o3 = new box(3);
        System.out.println(""+o3.area());
    }
}