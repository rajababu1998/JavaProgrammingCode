package Functions.miscelleneous;
class Test {
    int num;
}

public class ObjectAndReference1 {

    public static void main(String[] args) {
        // Creating an object.
        Test obj;
        obj = new Test();
        obj.num =10;
        System.out.println("obj.num:" + obj.num);

        // Creating a reference.
        Test ref;
        ref = obj;
        obj.num = 102;
        System.out.println("ref.num:" + ref.num);

    }
}
