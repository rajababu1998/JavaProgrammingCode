package Arrays;

public class DecimalToBinaryUsingArray {
    public static void decimaltobinary(int n){
        int binNum[] = new int[1000];
        int i = 0;
        while (n>0){
            binNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            System.out.println(binNum[j] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 8;
    }
}
