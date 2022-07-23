package Hashmap.Question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintMaxRepeatedCharcter {
    public static void main(String[] args) {
        String x = "SILLYSPIDERS";
        char a[] = x.toCharArray();
        int size = x.length();

        Map<Character,Integer> map = new LinkedHashMap<>();
        int i=0;
        while (i != size) {
            if (map.containsKey(a[i])==false) {
                map.put(a[i],1);
            }
            else {
                int oldValue = map.get(a[i]);
                int newValue = oldValue + 1;
                map.put(a[i],newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
        char maxKey = ' ';
        int maxVal = 0;
        for (Map.Entry<Character,Integer> data: lhmap) {
            if (data.getValue() > maxVal) {
                maxVal = data.getValue();
                maxKey = data.getKey();
            }
        }
        System.out.println(maxKey + " " +maxVal);
    }
}
