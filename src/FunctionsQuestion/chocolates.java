package FunctionsQuestion;

public class chocolates {
    static int chocolates(int a[]){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // N is the number of guests.
        int N = 5;
        int a[] = {1,4,6,8,3};
        int answer = chocolates(a);
        System.out.println("No. of chocolate she got:"+ " "+ answer);
    }
}
