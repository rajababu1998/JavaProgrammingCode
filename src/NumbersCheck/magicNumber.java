package NumbersCheck;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =num;

        int remainder;
        int sum = 0;
        while (n>0 || sum>9){
            if (n==0){
                n=sum;
                sum = 0;
            }
            remainder = n % 10;
            sum = sum + remainder;
            n = n/10;
        }
        if (sum == 1){
            System.out.println(num+" is a magic number");
        }
        else {
            System.out.println(num+ " is not a magic number");
        }
    }
}
