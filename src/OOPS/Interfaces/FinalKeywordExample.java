package OOPS.Interfaces;

public class FinalKeywordExample {
    final static int a = 10;
    final int b = 20;

    public static void main(String[] args) {
        System.out.println(a);

        FinalKeywordExample f = new FinalKeywordExample();
        System.out.println(f.b);

        //a = 100; -> not allowed, as 'a' is 'final'
        /*meaning of final static int a = 10:
        * int a=10 means we can assign only integer value in variable a
        * static int a means we can access a w/o creating an object
        * final :if we assign final to any variable so we cannot
          change the value of that variable.*/
    }
}
