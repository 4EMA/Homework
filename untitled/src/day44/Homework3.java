package day44;

//public class Homework3 {
    //1. what is polymorphism ---------> Polymorphism in Java is a concept by which we can perform a single
    //                                   action in different ways. ...
//2. what are the types of polymorphism --------------> Compile time polymorphism (static binding) and Runtime
//                          polymorphism (dynamic binding). Method overloading is an example of static polymorphism,
//                          while method overriding is an example of dynamic polymorphism.
//3. what is static binding, what is dynamic binding?-------> Static binding uses Type ( class in Java) information
//                                   for binding while dynamic binding uses object to resolve binding.

//Polymorphism in java

//1) What is the output of the following program?
//static class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//static class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//}
//
//public static class Test
//{                                          // it is runtime error after make every class static i can run
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getData();
//    }
//}
//a) Inside Poly
//b) Inside TechnoStudy
//c) Compilation error
//d) Runtime error   ------------->



//2) What is the output of the following program?

//static class Test
//{
//    void myMethod()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public static class Derived extends Test
//{
//    void myMethod()
//    {
//        System.out.println("Poly");
//    }
//
//
//    public static void main(String[] args)
//{
//    Derived object = (Derived) new Test();
//    object.myMethod();
//}
//}
//a) TechnoStudy
//b) Poly
//c) Compilation error
//d) Runtime error ---------------> correct answer

//3) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//
//protected void getValue()
//{
//    System.out.println("TechnoStudy");
//}
//}
//
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getValue();
//    }
//}
//a) Compilation error ----------> correct answer
//b) Runtime error
//c) TechnoStudy
//d) None of these


//4) What is the output of the following program?

//interface Poly
//{
//    void myMethod();
//    void getInfo();
//}
//
//abstract static class Geeks implements Poly
//{
//    void getData()
//    {
//        System.out.println("Poly");
//    }
//}
//
//public static class Test extends Geeks
//{
//    public void myMethod()
//{
//    System.out.println("TechnoStudy");
//}
//public void getInfo()
//{
//    System.out.println("Geeks");
//}
//
//public static void main(String[] args)
//{
//    Geeks obj = new Test();
//    obj.getInfo();
//}
//}
//a) Geeks
//b) Compilation error -------> CORRECT ANSWER AFTER FIX IT OUTPUT IS GEEKS
//c) Runtime error
//d) None of these


//5) What is the output of the following program?

//filter_none
//edit
//play_arrow

//brightness_4
//class Test
//{
//    public void Poly()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    public void Poly()
//{
//    System.out.println("Poly");
//}
//public static void main(String[] args)
//{
//    Derived obj = new Test();
//    obj.Poly();
//}
//}
////a) Compilation error-----------------> CORRECT ANSWER
////b) Runtime error
////c) Poly
////d) TechnoStudy
//
//}
