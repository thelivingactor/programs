    class shaperectangle
    {
        private int length,width;
        int getlength()
        {
            return length;
        }
        int getwidth()
        {
            return width;
        }
        void getvaluesl(int x)
        {
            length=x;
        }
        void getvaluesw(int y)
        {
            width=y;
        }
        int area()
        {
            int a=length*width;
            return a;
        }

    }
    class get_set
    {
        public static void main(String args[])
        {
            shaperectangle o = new shaperectangle();
            o.getvaluesl(10);
            o.getvaluesw(25);
            System.out.println(""+o.area());

        }
    }