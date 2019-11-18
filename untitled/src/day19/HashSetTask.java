package day19;

import java.util.*;

public class HashSetTask {
    public static void main(String[] args) {


        //    https://beginnersbook.com/2013/12/hashset-class-in-java-with-example/

//1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
//2. Write a Java program to iterate through all elements in a hash list.
        // HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
//3. Write a Java program to get the number of elements in a hash set.
        // HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        System.out.println(numbers.size());
//4. Write a Java program to empty an hash set.
        // HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

//5. Write a Java program to test a hash set is empty or not.
        // HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers.isEmpty());

        if (numbers.isEmpty()) {
            System.out.println("Its empty");
        } else {
            System.out.println(numbers);
//6. Write a Java program to clone a hash set to another hash set.
            HashSet<String> h_set = new HashSet<String>();

            h_set.add("Red");
            h_set.add("Green");
            h_set.add("Black");
            h_set.add("White");
            h_set.add("Pink");
            h_set.add("Yellow");
            System.out.println("Original Hash Set: " + h_set);
            HashSet<String> new_h_set = new HashSet<String>();
            new_h_set = (HashSet) h_set.clone();
            System.out.println("Cloned Hash Set: " + new_h_set);
//7. Write a Java program to convert a hash set to an array.
            // HashSet<Integer> numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(10);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);

            int size = numbers.size();
            Integer[] array = new Integer[size];
            numbers.toArray(array);
            System.out.println("New ARRAYS ELEMENTS ");

            for (Integer elements : array) {
                System.out.println(elements);
            }
//8. Write a Java program to convert a hash set to a tree set.
           // HashSet<String> h_set = new HashSet<String>();
            // use add() method to add values in the hash set
            h_set.add("Red");
            h_set.add("Green");
            h_set.add("Black");
            h_set.add("White");
            h_set.add("Pink");
            h_set.add("Yellow");
            System.out.println("Original Hash Set: " + h_set);
            Set<String> tree_set = new TreeSet<String>(h_set);
            System.out.println("TreeSet elements: ");
            for (String element : tree_set) {
                System.out.println(element);
//9. Write a Java program to convert a hash set to a List/ArrayList.
               // HashSet<String> h_set = new HashSet<String>();

                h_set.add("Red");
                h_set.add("Green");
                h_set.add("Black");
                h_set.add("White");
                h_set.add("Pink");
                h_set.add("Yellow");
                System.out.println("Original Hash Set: " + h_set);


                List<String> list = new ArrayList<String>(h_set);

                System.out.println("ArrayList contains: " + list);
//10. Write a Java program to compare two hash set.
                HashSet<String> h_set1 = new HashSet<String>();

                h_set1.add("Red");
                h_set1.add("Green");
                h_set1.add("Black");
                h_set1.add("White");
                System.out.println("Frist HashSet content: " + h_set1);
                HashSet<String> h_set2 = new HashSet<String>();
                h_set2.add("Red");
                h_set2.add("Pink");
                h_set2.add("Black");
                h_set2.add("Orange");
                System.out.println("Second HashSet content: " + h_set2);
                h_set1.retainAll(h_set2);
                System.out.println("HashSet content:");
                System.out.println(h_set1);
            }

//11. Write a Java program to compare two sets and retain elements which are same on both sets.
            HashSet<String> hs = new HashSet<String>();

            hs.add("first");
            hs.add("second");
            hs.add("third");
            hs.add("apple");
            hs.add("rat");
            System.out.println(hs);
            HashSet<String> subSet = new HashSet<String>();
            subSet.add("rat");
            subSet.add("second");
            subSet.add("first");
            hs.retainAll(subSet);
            System.out.println("HashSet content:");
            System.out.println(hs);
//12. Write a Java program to remove all of the elements from a hash set.
            //HashSet<String> h_set = new HashSet<String>();

            h_set.add("Red");
            h_set.add("Green");
            h_set.add("Black");
            h_set.add("White");
            System.out.println("Original hash set contains: " + h_set);
            h_set.clear();
            System.out.println("HashSet content: " + h_set);

//13. Write a Java Program to find duplications
            int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

            for (int i = 0; i < my_array.length - 1; i++) {
                for (int j = i + 1; j < my_array.length; j++) {
                    if ((my_array[i] == my_array[j]) && (i != j)) {
                        System.out.println("Duplicate Element : " + my_array[j]);


                    }
                }

            }
        }
    }
}