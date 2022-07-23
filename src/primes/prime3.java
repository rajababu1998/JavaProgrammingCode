package primes;

import java.util.Scanner;

public class prime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of test cases T:");
        int T = sc.nextInt();
        System.out.println("Enter the values of a:");
        int N;
        int count=0;
        for (int i=1;i<=T;i++){
            N = sc.nextInt();
            int sqrt = (int)Math.sqrt(N);
            for(int j = 2; j <= sqrt; j++) {
                if(N % j == 0) {
                    count++;
                }
            }
            if (count==0){
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }


    }
}
