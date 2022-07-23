package String.Checking;

public class IsUpperCase {
    public static void main(String[] args) {
        String str = "abCdFgjL";
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }
}
