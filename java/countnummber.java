class countnummber
{
    public static void main(String args[])
    {
        StringBuilder a = new StringBuilder("Ram-age is 12@");
        System.out.println(a);
        int upper=0,lower =0,number =0,spaces=0;
        for( int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                upper++;
            }
            if(a.charAt(i)>=97 && a.charAt(i)<=122)
            {
                lower++;
            }
            if(a.charAt(i)==32)
            {
                spaces++;
            }
            if(a.charAt(i)>=48 && a.charAt(i)<=57)
            {
                number++;
            }


        }
        System.out.println(upper+" "+lower+","+spaces+" "+number);
    }
}