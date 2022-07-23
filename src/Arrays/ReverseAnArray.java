package Arrays;

// Optimized way of reversing an array.
public class ReverseAnArray {
    public static void reverseArray(int arr[],int n){
        for (int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for (int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,7,6,8,0,9};
        int n = arr.length;
        reverseArray(arr,n);
    }
}
