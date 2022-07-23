package Hashmap.Question;

import java.util.HashMap;
import java.util.Map;

public class CountMaximumRepeatingCharacter1 {
    public static void main(String[] args) {
        String x = "ARADHYA";
        char a[] = x.toCharArray();
        int size = x.length();

        Map <Character,Integer> map = new HashMap<>();
        int i=0;
        while (i != size) {
            if (map.containsKey(a[i]) == false) {
                map.put(a[i],1);
            }
            else {
                int oldValue = map.get(a[i]);
                int newValue = oldValue + 1;
                map.put(a[i],newValue);
            }
            ++i;
        }
    }
}
