package Hashmap.Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String x = "SILLYSPIDERS";
        char a[] = x.toCharArray();
        int size = x.length();

        Map<Character,Integer>map = new HashMap<>();
        int i = 0;
        while (i != size) {
            if (map.containsKey(a[i])==false) {
                map.put(a[i],1);
            }
            else {
                int oldvalue = map.get(a[i]);
                int newValue = oldvalue + 1;
                map.put(a[i],newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for (Map.Entry<Character,Integer>data:hmap) {
            if (data.getValue() > 1) {
                System.out.print(data.getKey());
                System.out.print(data.getValue());
            }
        }
    }
}
