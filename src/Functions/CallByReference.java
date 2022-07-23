package Functions;
class Numbers {
    int num1;
    int num2;
}

public class CallByReference {
    static void swap(Numbers swapNumber) {
        int temp=swapNumber.num1;
        swapNumber.num1=swapNumber.num2;
        swapNumber.num2 =temp;
    }
    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        n1.num1 = 10;
        n1.num2 = 20;
        System.out.println("Before swaping");
        System.out.println("num1:"+n1.num1);
        System.out.println("num2:"+n1.num2);

        swap(n1);

        System.out.println("After swaping");
        System.out.println("num1:"+n1.num1);
        System.out.println("num2:"+n1.num2);
    }
}
