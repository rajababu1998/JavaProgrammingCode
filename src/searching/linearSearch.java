package searching;

public class linearSearch {
    public static void main(String[] args) {
        int n = 5;
        int a[] = {3,6,5,1,9};
        int find = 5;
        for (int i=0;i<a.length;i++){
            if (a[i]==find){
                System.out.println("Yes at index:" +i);
            }
        }
    }
}
