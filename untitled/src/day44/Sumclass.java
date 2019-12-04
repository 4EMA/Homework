package day44;


    class Sum {


        public int sum(int x, int y)
        {
            return (x + y);
        }


        public int sum(int x, int y, int z)
        {
            return (x + y + z);
        }


        public double sum(double x, double y)
        {
            return (x + y);
        }


        public static void main(String args[])
        {
            Sum a = new Sum();
            System.out.println(a.sum(5, 10));
            System.out.println(a.sum(5, 10, 20));
            System.out.println(a.sum(12.5, 8.5));
        }
    }

