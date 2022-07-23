package primes;

public class prime1 {
    public static void main(String[] args) {
        int n=48;
        for (int i=2;i*i<=n;i++){
            if (n%i==0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
