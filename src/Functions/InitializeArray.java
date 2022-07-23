package Functions;

public class InitializeArray {
    static int arr[];
    static void intializeArray(){     // '3'
        arr = new int[10];          // '4'
    }  // '5'
    public static void main(String[] args) {   // '1'
        intializeArray();     // '2'
        System.out.println(arr.length);    // '7'
    }    // '8'
} // '9'
