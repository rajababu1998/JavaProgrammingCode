package TCS.Questions;

import java.util.Scanner;

public class DivideNumberInEqualsPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        if (P<100 && P>200){
            System.out.println("INVALID INPUT");
        }
        else {
            if (P%2 == 0){
                System.out.println("A=" + P/4);
                System.out.println("B=" + P/4);
                System.out.println("C=" + P/4);
                System.out.println("D=" + P/4);
            }
            else {
                System.out.println("A=" + P/4);
                System.out.println("B=" + P/4);
                System.out.println("C=" + P/4);
                System.out.println("D=" + (P/4 + (P%4)));
            }
        }
    }
}
