package Sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int n = arr.length;
        for (int i=1;i<arr.length;i++){
            if (i != 0 && i != n-1){
                arr[i] = arr[i-1]*arr[i-2];
            }
            if (i==0){
                arr[i] = arr[i]*arr[i+1];
            }
            if (i==n-1){
                arr[i] = arr[n-1] * arr[n-2];
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
