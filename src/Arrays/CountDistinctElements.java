package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int a[] = {4,5,3,2,3,4,5,6};
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int element:a){
            set.add(element);
            count++;
        }
        System.out.println(set.size());
    }
}
