package StringsQuestion;

public class ToDeleteAllOccurancesOfGivenCharacter {
    public static void main(String[] args) {
        String x = "SPIDERSLIES";
        char a[] = x.toCharArray();
        int size = x.length();
        char key = 'S';
        int i = 0;
        String result = "";
        while (i != size) {
            if (a[i] != key) {
                result = result + a[i];
            }
            ++i;
        }
        System.out.println(result);
    }
}
