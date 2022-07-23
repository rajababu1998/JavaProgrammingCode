package Arrays;

import java.util.HashSet;
import java.util.Set;

public class InterSection {
    public static int interSectionElements(int a[],int b[]){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x:a){
            set.add(x);
//            System.out.println(x);
        }
        for (int x:b){
            if (set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {4,5,3,4,6,5};
        int b[] = {1,2,8,4,6,5};
        interSectionElements(a,b);
    }
}
