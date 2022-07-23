package AssignmentQuestion;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n is the length of array.
        int n = sc.nextInt();

        int arr[] = new int[n];
        // Taking array as input.
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int currentValue = 0;
        int previousValue = 0;

        for (int i=0;i<n;i++){
            currentValue = arr[i];


            if (i != 0 && i != n-1){
                arr[i] = previousValue * arr[i+1];
            }
            if (i==0){
                arr[i] = arr[i] * arr[i+1];
            }
            if(i == n-1){
                arr[i] = previousValue * arr[i];
            }
            previousValue = currentValue;
        }
        for (int x:arr){
            System.out.print(x + " ");
        }
    }
}
