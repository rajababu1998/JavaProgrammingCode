package AssignmentQuestion;

import java.util.Scanner;

public class FibbonaciSeriesUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        // n is number of fibonacci series you want.
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 0;
        while (i<n){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
