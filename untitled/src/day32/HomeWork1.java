package day32;

public class HomeWork1 {
    // write java program with method buyItem
    // that accepts argument
    // which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar
    public static void main(String[] args) {
        buyItem("milk");
        buyItem("water");
        buyItem("sugar");

    }

    public static String buyItem(String c) {

        System.out.println("I go to store and bought c " + c);
        return "I go to store and bought c \"+ c";
    }
}