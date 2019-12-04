package day44;

//Java Inheritance

//Output of following Java Program?
//abstract class Base
//{
//    public void show()
//    {
//        System.out.println("Base show method called");
//    }
//}
//
//class Derived extends Base
//{
//    public void show()
//{
//    System.out.println("Derived show method called");
//}
//}
//
//class Main
//{
//    public static void main(String[] args)
//    {
//        Base b = new Derived(); ;
//        b.show();
//    }
//}
//Answers:
//A
//Derived show method called ------>  correct answer

//B
//Base show method called




//Question 2
//class Base
//{
//    public void show()
//    {
//        System.out.println("Base show method called");
//    }
//}
//
//class Derived extends Base
//{
//    public void show()
//{
//    System.out.println("Derived show method called");
//}
//}
//
//class Main
//{
//    public static void main(String[] args)
//    {
//        Base b = new Derived(); ;
//        b.show();
//    }
//}
//Answers:
//A
//Base show method called
//B
//Derived show method called    after remove the final B IS correct
//C
//Compiler Error
//D
//Runtime Error -------------> given




//Question 3
//class Base
//{
//    public static void show()
//    {
//        System.out.println("Base show method called");
//    }
//}
//
//class Derived extends Base
//{
//    public static void show()
//{
//    System.out.println("Derived show method called");
//}
//}
//
//class Main
//{
//    public static void main(String[] args)
//    {
//        Base b = new Derived(); ;
//        b.show();
//    }
//}
//Answers:
//A
//Base show method called ------> CORRECT ANSWER
//B
//Derived show method called
//C
//Compiler Error




//Question 4
//Which of the following is true about inheritance in Java?

//1) Private methods are final.
//2) Protected members are accessible within a package and
//   inherited classes outside the package.
//3) Protected methods are final.
//4) We cannot override private methods.
//A
//1, 2 and 4  --------------> CORRECT ANSWER  In Java, inner Class is allowed to access private data members of
//                                         outer class.
//B
//Only 1 and 2
//C
//1, 2 and 3
//D
//2, 3 and 4




//Question 5
//Output of following Java program?
//class Base
//{
//    public void Print()
//    {
//        System.out.println("Base");
//    }
//}

//class Derived extends Base
//{
//    public void Print()
//{
//    System.out.println("Derived");
//}
//}

//class Main
//{
//    public static void DoPrint(Base o)
//    {
//        o.Print();
//    }
//    public static void main(String[] args)
//    {
//        Base x = new Base();
//        Base y = new Derived();
//        Derived z = new Derived();
//        DoPrint(x);
//        DoPrint(y);
//        DoPrint(z);
//    }
//}
//Answers:
//A
//Base
//Derived    -------------------> CORRECT ANSWER
//Derived
//B
//Base
//Base
//Derived
//C
//Base
//Derived
//Base
//D
//Compiler Error




//Question 6
//Predict the output of following program.Note that fun() is public in base and private in derived.
//class Base
//{
//    public void foo() { System.out.println("Base"); }
//}

//class Derived extends Base
//{
//    private void foo() { System.out.println("Derived"); }
//}

//public class Main
//{
//    public static void main(String args[])
//    {
//        Base b = new Derived();
//        b.foo();
//    }
//}
//Answers:
//A
//Base
//B
//Derived
//C
//Compiler Error    --------------------> CORRECT ANSWER  It is compiler error to give more restrictive access
//                                         to a derived class function which overrides a base class function.
//D
//Runtime Error




//Question 7
//Which of the following is true about inheritance in Java.
//1) In Java all classes inherit from the Object class directly or indirectly.The Object class is root of all classes.
//2) Multiple inheritance is not allowed in Java.
//3) Unlike C++, there is nothing like type of inheritance in Java where we can specify whether the inheritance is protected, public or private.

//A
//1, 2 and 3    ----------------> CORRECT ANSWER  Inheritance is used in both languages for
//                                 reusing code and/or creating is-a relationship.
//B
//1 and 2
//C
//2 and 3
//D
//1 and 3




//Question 8
//Predict the output of following Java Program
//// filename Main.java
//class Grandparent
//{
//    public void Print()
//    {
//        System.out.println("Grandparent's Print()");
//    }
//}

//class Parent extends Grandparent
//{
//    public void Print()
//{
//    System.out.println("Parent's Print()");
//}
//}

//class Child extends Parent
//{
//    public void Print()
//{
//    super.super.Print();
//    System.out.println("Child's Print()");
//}
//}

//public class Main
//{
//    public static void main(String[] args)
//    {
//        Child c = new Child();
//        c.Print();
//    }
//}
//Answers:
//A
//Compiler Error in super.super.Print()    ------------> CORRECT ANSWER
//B                              In Java, it is not allowed to do super.super. We can only access Grandparent’s members
//                                using Parent. For example, the following program works fine.
//Grandparent's Print()
//Parent's Print()
//Child's Print()
//C
//Runtime Error


//Question 9
//final class Complex
//{

//    private final double re;
//    private final double im;

//    public Complex(double re, double im)
//    {
//        this.re = re;
//        this.im = im;
//    }

//    public String toString()
//    {
//        return "(" + re + " + " + im + "i)";
//    }
//}

//class Main
//{
//    public static void main(String args[])
//    {
//        Complex c = new Complex(10, 15);
//        System.out.println("Complex number is " + c);
//    }
//}
//Answers:
//Complex number is (10.0 + 15.0i)      ------------------> CORRECT ANSWER
//B
//Compiler Error
//C
//Complex number is SOME_GARBAGE
//Complex number is Complex@8e2fb5
//Here 8e2fb5 is hash code of c