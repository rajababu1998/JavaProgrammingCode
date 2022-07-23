package NumbersCheck;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        int remainder;
        while (temp != 0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        if (n == reverse){
            System.out.println("THe number you have entered is palindrome");
        }
        else {
            System.out.println("The number you have enterd is not a palindrome");
        }
    }
}
