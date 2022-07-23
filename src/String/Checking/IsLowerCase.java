package String.Checking;

public class IsLowerCase {
    public static void main(String[] args) {
        String str = "abCdFgjL";
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                System.out.print(str.charAt(i)+":"+ i + " ");
            }
        }
        System.out.println();
    }
}
