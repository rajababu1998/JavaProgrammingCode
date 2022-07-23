import java.util.Arrays;

public class test {
    static int xorOfArray(int a[],int n){
        int xor_Array = 0;
        for (int i=0;i<n;i++){
            xor_Array = xor_Array ^ a[i];
        }
        return xor_Array;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int b[] = {1,2,3,4,5};
        int n = a.length;
        System.out.println(xorOfArray(a,n));
    }
}
