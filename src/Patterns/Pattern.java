package Patterns;

import java.util.Scanner;

public class Pattern {
    static void Pattern1(int n){
        // outer loop is used for row.
        for (int i=1;i<=n;i++){
            // inner loop is used for colon.
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Pattern1(n);
    }
}
