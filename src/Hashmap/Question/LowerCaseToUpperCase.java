package Hashmap.Question;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        String x = "aradhya";
        char y[] = x.toCharArray();
        int size = y.length;

        int i=0;
        while (i != size) {
            if (y[i] != ' ') {
                y[i] = (char)(y[i]-32);
            }
            ++i;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
