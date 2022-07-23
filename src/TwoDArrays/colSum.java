package TwoDArrays;

import java.util.Scanner;

public class colSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum = sum + a[j][i];
            }
            break;
        }
        System.out.println(sum);
    }
}
