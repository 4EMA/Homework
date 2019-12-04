package day41Homework;

public class Homework2 {
    //    Which two classes use the Shape class correctly?
//
//    A. public class Circle implements Shape
//    {
//        private int radius;
//    }
//    B. public abstract class Circle extends Shape
//    {
//        private int radius;
//    }
//    C. public class Circle extends Shape
//    {
//        private int radius;
//        public void draw();
//    }
//    D. public abstract class Circle implements Shape
//    {
//        private int radius;
//        public void draw();
//    }
//    E. public class Circle extends Shape
//    {
//        private int radius;
//        public void draw()
//        {
//            /* code here */
//        }
//    }
//    F. public abstract class Circle implements Shape
//    {
//        private int radius;
//        public void draw()
//        {
//            /* code here */
//        }
//    }
//    a) B,E
//    b) A,C
//    c) C,E  <---
//    d) T,H
//
//    What will be the output of the following Java program?
//
//    class A
//    {
//        int i;
//        void display()
//        {
//            System.out.println(i);
//        }
//    }
//    class B extends A
//    {
//        int j;
//        void display()
//        {
//            System.out.println(j);
//        }
//    }
//    class inheritance_demo
//    {
//        public static void main(String args[])
//        {
//            B obj = new B();
//            obj.i=1;
//            obj.j=2;
//            obj.display();
//        }
//    }
//    a) 0
//    b) 1
//    c) 2 <--- Since we are only calling the display method of class B.
//    d) Compilation Error
//
//    What will be the output of the following Java program?
//
//    class A
//    {
//        int i;
//    }
//    class B extends A
//    {
//        int j;
//        void display()
//        {
//            super.i = j + 1;
//            System.out.println(j + " " + i);
//        }
//    }
//    class inheritance
//    {
//        public static void main(String args[])
//        {
//            B obj = new B();
//            obj.i=1;
//            obj.j=2;
//            obj.display();
//        }
//    }
//    a) 2 2
//    b) 3 3
//    c) 2 3 <---
//    d) 3 2
//
//    What will be the output of the following Java program?
//
//    class A
//    {
//        public int i;
//        public int j;
//        A()
//        {
//            i = 1;
//            j = 2;
//        }
//    }
//    class B extends A
//    {
//        int a;
//        B()
//        {
//            super();
//        }
//    }
//    class super_use
//    {
//        public static void main(String args[])
//        {
//            B obj = new B();
//            System.out.println(obj.i + " " + obj.j)
//        }
//    }

//        line 134 needs a semicolon, its compile error now but will be 1 2 after semicolon is added.

//    a) 1 2 <--- 2.nd
//    b) 2 1
//    c) Runtime Error
//    d) Compilation Error <--- 1.st
//
//    Which of this keyword must be used to inherit a class?
//    a) super
//    b) this
//    c) extent
//    d) extends <---
//
//    A class member declared protected becomes a member of subclass of which type?
//    a) public member
//    b) private member
//    c) protected member <---
//    d) static member
//
//    Which of these is correct way of inheriting class A by class B?
//    a) class B + class A {}
//    b) class B inherits class A {}
//    c) class B extends A {}
//    d) class B extends class A {} <---

}



