package AssignmentQuestion;

public class PrimeOneToN {
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    // Function to print primes
    static void printPrime(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPrime(n);
    }
}
