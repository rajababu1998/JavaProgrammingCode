package Hashmap.Question;

public class RotationalStrng {
    public static void main(String[] args) {
        String originalString = "ARADHYA";
        String keyString = "RADHYAA";
        String newString = originalString.concat(originalString);

        if (newString.contains(keyString)) {
            System.out.println("Rotational String");
        }
        else {
            System.out.println("Not Rotational String");
        }
    }
}
