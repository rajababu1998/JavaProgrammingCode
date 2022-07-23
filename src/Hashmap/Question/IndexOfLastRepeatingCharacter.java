package Hashmap.Question;

import java.util.HashMap;
import java.util.Scanner;

/*
-> Q. Given a string you have to return the last repeating string
 */
public class IndexOfLastRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }
            else {
                map.put(ch,1);
            }
        }

        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if (map.get(ch)>1){
                System.out.println("Repeating character at index:" + i);
                break;
            }
        }
    }
}
