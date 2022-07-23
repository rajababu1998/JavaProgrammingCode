package Arrays;

// Time complexity = O(n*k)
public class RotateAnArrayByKStep {
    public static void BruteForce(int arr[],int k){
        int temp = arr[arr.length-1];
        int i=0;
        while (k>0){
            for (i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[i] = temp;
            k--;
        }

    }
    public static void RotateByK(int arr[],int k){
        int len = arr.length;
        k = k % len;  // it is for when k > len.
        reverse(arr,0,len-k-1);
        reverse(arr,len-k,len-1);
        reverse(arr,0,len-1);
    }
    public static void reverse(int arr[],int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
//        BruteForce(arr,k);
        RotateByK(arr,k);
//        reverse(arr,0,arr.length-1);
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}
