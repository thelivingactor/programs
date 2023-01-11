abstract class testdemo
{
    abstract void display();
}
class outerdemo
{
    public void outerdisplay(){
    testdemo o = new testdemo()
    {
        void display()
        {
            System.out.println("TEST DISPLAY");
        }
    };
    o.display();

}
}

class anonymousinnerclass
{
    public static void main(String[] args) 
    {
       outerdemo o2 = new outerdemo();
       o2.outerdisplay(); 
       
    }
}