package Sorting;
// Sorting in ascending order.
public class BubbleSort {
    static void printArray(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        /* Outer loop is used for number.
          of time operation will occur. */

        // Time complexity = O(n^2)
        for (int i=0;i<arr.length-1;i++){

            // inner loop checking each index.
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    // Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
