package StringsQuestion;

import java.util.Scanner;

public class tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        String s = null;
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            s = sc.next();
        }
        for (int i=0;i<n;i++){
            System.out.println(s);
        }
    }
}
