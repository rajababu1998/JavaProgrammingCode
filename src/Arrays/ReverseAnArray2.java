package Arrays;

public class ReverseAnArray2 {
    public static void reverseArray(int arr[],int n){
        int b[] = new int[n];
        int j = n;
        for (int i = 0;i<n;i++){
            b[j - 1] = arr[i];
            j = j - 1;
        }
        for (int k=0;k<n;j++){
            System.out.print(b[k] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,7,6,8,0,9};
        int n = arr.length;
        reverseArray(arr,arr.length);
    }
}
