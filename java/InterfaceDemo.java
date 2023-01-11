interface Animal
{
    void sound();
    void sleep();
}
class dog implements Animal
{
    public void sound()
    {
        System.out.println("woof");
    }
    public void sleep()
    {
        System.out.println("sleep at night");
    }
}
class InterfaceDemo
{
    public static void main(String args[])
    {
        dog o = new dog();
        o.sleep();
        o.sound();
    }
}