package Functions.miscelleneous;
class Test1 {
    int num;
}

public class ObjectsAndReference {

    public static void main(String[] args) {
        // Creating an object.
        Test obj = new Test();
        obj.num=10;
        System.out.println("1.obj.num:" +obj.num);

        // Creating a reference.
        Test ref = new Test();
        ref.num=102;
        System.out.println("1.obj.num:" +obj.num);
    }
}
