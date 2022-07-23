package Arrays;

import java.util.Scanner;

public class incArrayelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i=1;i<N;i++){
            Arr[i] = sc.nextInt();
        }

        Arr[0] = 1;
        for(int i=1;i<N;i++){
            for(int j = Arr[i-1]+1; j<Arr[i]; j++){
                if(Arr[i] % j ==0){
                    Arr[i] =j;
                    break;
                }
            }
        }
        String result = "YES";
        for(int i=1; i<N; i++){
            if(Arr[i] <= Arr[i-1]){
                result = "NO";
            }
        }
        System.out.println(result);
    }
}
