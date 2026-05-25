package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collextion {
    public static void main(String[] args) {
    
        Set<Integer> nums = new HashSet<Integer>();
        
        nums.add(6);
        nums.add(7);
        nums.add(8);


        System.out.println(nums);

        System.out.println("Collection-related code will go here.");
    }
}

// List - Ordered, allows duplicates
// ArrayList - Resizable array implementation of List
// LinkedList - Doubly-linked list implementation of List
// Collection - Root interface for collections, provides basic operations like add, remove, contains, etc.


// TreeSet - Sorted, no duplicates
// HashSet - Unsorted, no duplicates

// Map - Key-value pairs, no duplicates in keys
// HashMap - Unsorted, allows null keys and values
// TreeMap - Sorted by keys, no null keys, allows null values

// Hashtable - Synchronized, no null keys or values