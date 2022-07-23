package primes;

import java.util.Scanner;

public class prime2 {
    // time complexity: O(root(n))
    static boolean isprime(int n) {
        if (n<=1)
        return false;
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        isprime(n);
    }
}
