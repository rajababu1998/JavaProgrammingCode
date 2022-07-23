package Hashmap;

import java.util.*;
public class HashmapExample1 {
    public static void main(String[] args) {
        /*
        {
        *    "anuj" ,26
        *    "ankit",28
        *    "ankush",30
        }
        */

        Map<String,Integer> hashmap = new HashMap<String,Integer>();
        /*
        * { }
        * it means we have initialize empty map initially.*/
        hashmap.put("anuj",26);
        hashmap.put("ankit",28);
        hashmap.put("ankush",30);
        System.out.println("Age of ankit " + hashmap.get("ankit"));

        // Remove
        hashmap.remove("anuj");

        // checking whether anuj is in the map or not.
        if (!hashmap.containsKey("anuj")){
            System.out.println("Anuj is not there in the map");
        }
        // Print all the values of the map.
        /*
        {
        *    "anuj(key)" ,26(value)
        *    "ankit",28
        *    "ankush",30
        }
        */
        // entry:->  <key, value> in the map.
        for (Map.Entry<String,Integer> entry: hashmap.entrySet()){
            System.out.println("Name:" + entry.getKey() + ",Age:" + entry.getValue());
        }
    }
}
