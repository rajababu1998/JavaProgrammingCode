package Recursion.String;

public class CountNumberOfCharacter {
    public static int numberX(String input){
        if (input.isEmpty()){
            return 0;
        }
        if (input.charAt(0)=='x'){
            return numberX(input.substring(1)) + 1;
        }
        else
        return numberX(input.substring(1));
    }
    public static void main(String[] args) {
        String input = "xnxnxx";
        System.out.println(numberX(input));
    }
}
