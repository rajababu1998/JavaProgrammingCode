package Sorting;

public class quickSort {
    public static int partition(int arr[],int low,int high){
        // int will return the index of pivot.
        int pivot = arr[high];
        int i = low-1;
        // Traversing the array.
        for (int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                /*
                i++ is tracking the vacant places where we
                can track the smaller element than
                 pivot element. */

                // Swap.
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Swap with pivot.
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index.
    }

    public static void quickSort(int arr[],int low,int high){
        if (low<high){
            int pidx = partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr,0,n-1);

        // Print
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
