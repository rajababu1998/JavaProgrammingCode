package Functions.Recursion;

public class RecursionExample3 {
    static int sum(int a){
        int s;
        if (a==1){
            return 1;
        }
        else {
            s = a + sum(a-1);
        }
        return s;
    }
    public static void main(String[] args) {
        int k=sum(3);
        System.out.println(k);
    }
}
