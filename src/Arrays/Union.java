package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Union {
    static int union(int a[],int b[]){
        Set<Integer> set = new HashSet<>();
        for (int x:a){
            set.add(x);
        }
        for (int x:b){
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int a[] = {4,5,3,4,6,5};
        int b[] = {1,2,8,4,6,5};
        union(a,b);
    }
}
