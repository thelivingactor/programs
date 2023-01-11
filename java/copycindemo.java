class complex
{
private int real,img;
public complex()
{
    this.real=5;
    this.img=3;
}
public complex(int x,int y)
{
    this.real=x;
    this.img=y;
}
public complex(complex o2)
{
    this.real=o2.real;
    this.img=o2.img;

}
public String toString()
{
    return "("+real+"+"+img+"i)";
}

}
class copycindemo
{
    public static void main(String args[])
    {
        complex o=new complex();
        System.out.println(""+o);
        complex o2=new complex(1,2);
        System.out.println(""+o2);
        complex o3=new complex(o2);
        System.out.println(""+o3);
        complex[] arr = new complex[5];
        arr[0]=new complex(2,3);
        arr[1]=new complex(4,3);
        arr[2]=new complex(5,3);
        arr[3]=new complex(6,3);
        arr[4]=new complex(7,3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(""+arr[i]);
        }


    }
}