package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Exercise {

    static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("ELEMENT KPRBC");
        hashSet.add("ELEMENT YPBTM");
        hashSet.add("ELEMENT AADXU");
        hashSet.add("ELEMENT RXCGJ");
        hashSet.add("ELEMENT WYMVD");
        hashSet.add("ELEMENT WFGEJ");
        hashSet.add("ELEMENT TYGBS");
        hashSet.add("ELEMENT MAPTK");
        hashSet.add("ELEMENT GJXVE");
        hashSet.add("ELEMENT BAFGL");
        return hashSet;
    }

    static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ELEMENT KPRBC");
        treeSet.add("ELEMENT YPBTM");
        treeSet.add("ELEMENT AADXU");
        treeSet.add("ELEMENT RXCGJ");
        treeSet.add("ELEMENT WYMVD");
        treeSet.add("ELEMENT WFGEJ");
        treeSet.add("ELEMENT TYGBS");
        treeSet.add("ELEMENT MAPTK");
        treeSet.add("ELEMENT GJXVE");
        treeSet.add("ELEMENT BAFGL");
        return treeSet;
    }

    static boolean addElementToSet(Set<String> set, String element) {
        return set.add(element);
    }

    static void printSet(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        addElementToSet(hashSet, "ELEMENT AAA");
        addElementToSet(treeSet, "ELEMENT AAA");

        System.out.println("HashSet elements:");
        printSet(hashSet);

        System.out.println("\nTreeSet elements:");
        printSet(treeSet);
    }
}
