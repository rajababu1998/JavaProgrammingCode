package StringsQuestion;

public class Pangram {
    public static void main(String[] args) {
        String x = "He is AraDhya";
        // Remove the space between the words.
        x = x.replace(" ", "");

        // Convert all the string into capital letter or small letter.
        x = x.toUpperCase();

        // Convert string to character array format.
        char y[] = x.toCharArray();

        // To calculate the length of the character array.
        int size = y.length;

        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int i=0;
        while (i != size) {
            int index = y[i]-65;
            a[index] = 1;
            ++i;
        }
        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                ++i;
            }
            else {
                System.out.println("Non-Pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");
    }
}
