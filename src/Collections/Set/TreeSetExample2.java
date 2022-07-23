package Collections.Set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};

        // We are converting array to arraylist.
        List<Integer> arrList = Arrays.asList(arr);

        // We are converting arraylist to set.
        Set<Integer> set = new TreeSet<Integer>(arrList);

        // This line is directly converting array to set.
        Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5));

        // add elements:
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(25);
        set.add(-13);
        /*
        Set gives the output in the ascending order
        and no duplicate elements is allowed in set.*/

        System.out.println("Set" + set);

        set1.add(21);
        set1.add(19);
        set1.add(-12);
        System.out.println("Set1" + set1);
    }
}
