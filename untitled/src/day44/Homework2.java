package day44;

//public class Homework2 {
    //write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.


//2. Can we overload methods on return type?
//will this work???? why? why not?
//public class Main
//{
//    public int foo() { return 10; }
//
//    public char foo() { return 'a'; }
//                                                      // yes we can overload after change method name
//    public static void main(String args[])
//    {
//    }
//}

//3. Can we overload static methods? Static methods cannot be overridden because they are not dispatched on the object
                                    // instance at runtime. The compiler decides which method gets called.
//4. Can we overload methods that differ only by static keyword?
//will this work???? why? why not? Static methods can be overloaded (meaning that you can have the same method name for
// several methods as long as they have different parameter types).
//public static class Test
//{
//    public static void foo1()
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public static void foo()
//    { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Test.foo();
//    }
//}

//5. Can we overload main() in Java?Yes, you can overload main method in Java. you have to call the overloaded main
   // method from the actual main method. Yes, main method can be overloaded.
//6. What is the difference between Overloading and Overriding?Overloading occurs when two or more methods in one class
// have the same method name but different parameters. Overriding means having two methods with the same method name
// and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the
// child class.
//7. Can we Override static methods in java?Answer is, No, you can not override static method in Java, though you can
// declare method with same signature in sub class. ... As per Java coding convention, static methods should be
// accessed by class name rather than object. In short Static method can be overloaded, but can not be overridden
// in Java.
//it is related to question 7.
//what is the output of this program? why? why not?

//static class Base
//{
//    public static void display()
//    {
//        System.out.println("Static or class method from Base");
//    }
//    public void print()
//    {
//        System.out.println("Non-static or Instance method from Base");
//    }
//}
//
//static class Derived extends Base
//{
//public static void display()
//{
//    System.out.println("Static or class method from Derived");
//}
//public void print()
//{
//    System.out.println("Non-static or Instance method from Derived");
//}
//}            /// when I do static to all classes I am able to run otherwise i can't
//
//public static class Test
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();
//
//        obj1.print();
//    }
//}
//}
