package Functions;

import java.util.Scanner;

public class SumandEvenOdd2 {
    static void findOddorEven(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static void findSum(int num1,int num2){
        int sum1=num1+num2;

        findOddorEven(sum1);
    }

    static void takeinput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second numbers");
        int num2 = scanner.nextInt();

        findSum(num1,num2);
    }

    public static void main(String[] args) {
        takeinput();
    }
}
