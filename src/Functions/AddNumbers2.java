package Functions;

public class AddNumbers2 {
    static int add4(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }

    static int add3(){
        int num1=45;
        int num2=55;
        int sum = num1 + num2;
        return sum;
    }

    static void add2(int n1,int n2){
        int sum2=n1+n2;
        System.out.println("Sum2 :"+sum2);
    }

    static void add1(){
        int num1=10;
        int num2=20;
        int sum1=num1+num2;
        System.out.println("sum1:" +sum1);
    }

    public static void main(String[] args) {
        add1();
        add2(5,9);
        int sum3=add3();
        System.out.println("sum3:"+sum3);


//        System.out.println(add4(100,200));
        int sum4=add4(100,200);
        System.out.println("sum4:" +sum4);
    }
}
