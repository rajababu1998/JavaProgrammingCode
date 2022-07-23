package AssignmentQuestion;

public class FindSingleDigitNumber {
    public static void digitNumber(int n){
        while (n>9) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int n = 678;
        digitNumber(n);
    }
}
