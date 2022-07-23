package Arrays;

public class FindMissingNumber {
    static int sum2(int n){
        int x = n*(n+1)/2;
        return x;
    }
    static int sum(int arr[]){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int y = sum(arr);
        int z= sum2(5);
        System.out.println((z-y));
    }
}
