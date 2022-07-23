package AssignmentQuestion;


import java.util.Arrays;
public class tests {
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2};
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1;
        int mid = si + (ei-si)/2;
        System.out.println(arr[mid]);
    }
}
