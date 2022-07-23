package AssignmentQuestion;

public class NumberOfPrimes {
    static void prime(int n){
        int count = 0;
        //part 1 - even composite numbers
        while(n % 2 == 0) {
            count++;
            n = n / 2;
        }

        //part 2 - odd composite numbers
        for(int i = 3; i * i <= n; i += 2) {
            while(n % i == 0) {
                count++;
                n = n / i;
            }
        }

        //part 3 - prime numbers only
        if(n > 2) {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        prime(7);
    }
}
