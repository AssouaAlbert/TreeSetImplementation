package me.aassoua;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Grapes");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if a value exists
        if (treeSet.contains("Banana")) {
            System.out.println("TreeSet contains Banana");
        }

        // Removing an element
        treeSet.remove("Mango");
        System.out.println("After removing Mango: " + treeSet);

        // Iterating over the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Getting the first and last elements
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Using subset, headset, and tailset
        TreeSet<String> subset = new TreeSet<>(treeSet.subSet("Banana", "Orange"));
        System.out.println("Subset (Banana to Orange): " + subset);

        TreeSet<String> headset = new TreeSet<>(treeSet.headSet("Orange"));
        System.out.println("HeadSet (up to Orange): " + headset);

        TreeSet<String> tailset = new TreeSet<>(treeSet.tailSet("Banana"));
        System.out.println("TailSet (from Banana): " + tailset);
    }
}