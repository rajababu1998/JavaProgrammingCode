package Arrays;

import java.util.Scanner;

public class replaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
//        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        for (i=0;i<n-2;i++){
            if (i==0){
                a[i]=(a[i]*a[i+1]);
            }
            else if(i==n-1){
                a[i]=(a[n-1]*a[n-2]);
            }
            else {
                a[i]=(a[i]*a[i+2]);
            }
        }
        System.out.println(a[i]);
    }
}
