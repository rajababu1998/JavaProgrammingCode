package StringsQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // We are converting string to character array.
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);

        if (result == true){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not an anagram");
        }
    }
}
