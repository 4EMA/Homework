package day41Homework;

public class Homework1 {
    //    What will be the output of the following Java program?
//    class X
//    {
//        //Class X Members
//    }
//
//    class Y
//    {
//        //Class Y Members
//    }
//
//    class Z extends X, Y
//    {
//        //Class Z Members
//    }

//      Compile error - You cannot extend from more than one class

//
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        int i = 10;
//    }
//
//    class B extends A
//    {
//        int i = 20;
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            A a = new B();
//
//            System.out.println(a.i);
//        }
//    }

//    will print 10 since its getting the value from class A not B.

//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        {
//            System.out.println(1);
//        }
//    }
//
//    class B extends A
//    {
//        {
//            System.out.println(2);
//        }
//    }
//
//    class C extends B
//    {
//        {
//            System.out.println(3);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }

//    will print 1 2 3 at new lines since b inherits a and c inherits b.

//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        String s = "Class A";
//    }
//
//    class B extends A
//    {
//        String s = "Class B";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class C extends B
//    {
//        String s = "Class C";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//
//            System.out.println(c.s);
//        }
//    }

//    will print class A, class B, class C due to printing all the super classes

//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        static
//        {
//            System.out.println("THIRD");
//        }
//    }
//
//    class B extends A
//    {
//        static
//        {
//            System.out.println("SECOND");
//        }
//    }
//
//    class C extends B
//    {
//        static
//        {
//            System.out.println("FIRST");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }

//    will print THIRD SECOND FIRST

//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        public A()
//        {
//            System.out.println("Class A Constructor");
//        }
//    }
//
//    class B extends A
//    {
//        public B()
//        {
//            System.out.println("Class B Constructor");
//        }
//    }
//
//    class C extends B
//    {
//        public C()
//        {
//            System.out.println("Class C Constructor");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }

//    will print Class A Constructor  Class B Constructor  Class C Constructor

//
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class X");
//        }
//    }
//
//    class Y extends X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class Y");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            Y.staticMethod();
//        }
//    }

//    will only print Class Y since we are only calling that method

//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        public X(int i)
//        {
//            System.out.println(1);
//        }
//    }
//
//    class Y extends X
//    {
//        public Y()
//        {
//            System.out.println(2);
//        }
//    }

//    will give a compile error since we have a constructor with a parameter on class X.
//    First we should add the super class constructor on class Y and provide a number within it a the
//    parameter, or we can go back to class X and remove the int i parameter so we dont add it on class Y.

}



