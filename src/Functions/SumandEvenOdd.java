package Functions;

import java.util.Scanner;

public class SumandEvenOdd {
    static void findOddorEven(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static int findSum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second numbers");
        int num2 = scanner.nextInt();

        int sum1=findSum(10,20);
        System.out.println(sum1);

        findOddorEven(sum1);
    }
}
