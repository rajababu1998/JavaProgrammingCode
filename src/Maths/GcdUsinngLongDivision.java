package Maths;

import java.util.Scanner;

public class GcdUsinngLongDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            int temp = a;
            a = b % a;
            b = temp;
            System.out.println(a);
        }

    }
}
