package Arrays;

import java.util.*;

public class RemoveDuplicateElement {
    public static void remove(int arr[]){
        Arrays.sort(arr);
        int len = arr.length;
        int j=0;
        // Traverse an array.
        for (int i=0;i<len-1;i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        // last element of an array.
        arr[j++] = arr[len-1];
        // Print the elements
        for (int k=0;k<j;k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    // using hashmap.
    public static void removeDuplicateUsingHashing(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        map.forEach((k,v)->System.out.print(k+ " "));
    }

    // Using Set.
    public static void removeDuplicateUsingSet(int arr[]){
        Set<Integer> set = new HashSet<>();
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            set.add(arr[i]);
        }
        // Print the elements.
        set.forEach(elem -> System.out.print(elem + " "));
    }
    public static void main(String[] args) {
        int arr[] = {4,8,6,3,7,8,3,1};
        remove(arr);
        removeDuplicateUsingHashing(arr);
        System.out.println();
        removeDuplicateUsingSet(arr);
    }
}
// Time complexity will be O(n  log n)
