package Recursion.Array;

public class NumberInArray {
    public static int array11(int arr[],int index){
        if (index == arr.length)
            return 0;
        if (arr[index]==11)
            return array11(arr,index + 1) + 1;
        else
            return array11(arr,index + 1);
    }
    public static void main(String[] args) {
        int arr[] = {11,2,11};
        System.out.println(array11(arr,0));
    }
}
