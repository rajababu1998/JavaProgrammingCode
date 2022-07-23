package Arrays;

public class example {
    // linear search.
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 6;
        int si = arr[0];
        int ei = arr.length-1;
        int index = -1;
        while (ei>si) {
            int mid = si + (ei-si)/2;
            if(arr[mid] > target) {
                ei = mid - 1;
            }
            else if (arr[mid] < target) {
                si = mid + 1;
            }
            else {
                System.out.println("target is not found:" + index);
            }
        }
    }
}
