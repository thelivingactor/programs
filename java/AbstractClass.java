abstract class shape
{
    abstract void draw();
    void message()
    {
        System.out.println("message from shape");
    }
}
class rectangleshape extends shape
{
    void draw()
    {
    System.out.println("enter length and breadth");
    }
}
class AbstractClass
{
    public static void main(String args[])
    {
        rectangleshape o = new rectangleshape();
        o.draw();
        o.message();
    }
}