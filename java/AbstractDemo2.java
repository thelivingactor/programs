abstract class mobile
{
    void voicecall()
    {
        System.out.println("you can make a call");
    }
    abstract void camera();
    abstract void display();
}
class samsung extends mobile
{
    void camera()
    {
        System.out.println("16mp");
    }
    void display()
    {
        System.out.println("6.3 inch");
    }
}
class nokia extends mobile
{
    void camera()
    {
        System.out.println("64mp");
    }
    void display()
    {
        System.out.println("6.4 inch");
    }
    void fingerprint()
    {
        System.out.println("has a fingerprint sensor");
    }
}
class  AbstractDemo2
{
    public static void main(String args[])
    {
        samsung o = new samsung();
        o.camera();
        o.display();
        nokia o2 = new nokia();
        o2.camera();
        o2.display();
        o2.fingerprint();
    }
}