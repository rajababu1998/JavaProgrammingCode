package Sorting;

public class MergeSort {
    // nlog(n)
    static void conquer(int arr[],int mid,int si,int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si;        // track first array during merging.
        int idx2 = mid+1;    // track second array during merging.
        int x = 0;           // tracking merged  array index.

        // O(n).
        while (idx1<=mid && idx2<=ei ){
            if (arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else {
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1<=mid){
            merged[x]=arr[idx1];
        }
        while (idx2<=ei){
            merged[x]=arr[idx2];
        }
        // copying merged elements into original array.
        for (int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

    static void divide(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,mid,si,ei);

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1);
        // print
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
