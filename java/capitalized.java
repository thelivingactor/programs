class capitalized
{
    public static void main(String args[])
    {
        StringBuilder a = new StringBuilder("my name is khan");
        System.out.println(a);
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(0)>=97 && a.charAt(0)<=122)
            {
                int b = (int)a.charAt(0)-32;
                a.setCharAt(0,(char)b);
            }
            if(a.charAt(i)==32)
            {
                i++;
                if(a.charAt(i)>=97 && a.charAt(i)<=122)
                {
                int b = (int)a.charAt(i)-32;
                a.setCharAt(i,(char)b);
                }
            }
                else if(a.charAt(i)>=65 && a.charAt(i)<=90)
                {
                    int b = (int)a.charAt(i)+32;
                    a.setCharAt(i,(char)b);  
                }
        }
                    System.out.println(a);
                
            
    }

}