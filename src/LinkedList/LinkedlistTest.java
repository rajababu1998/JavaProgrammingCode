package LinkedList;

public class LinkedlistTest {
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    private void traverse(){
        if (head == null){
            System.out.println("Empty List");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    private void AtStart(int data){
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        else {
            tail = newNode;
        }
        head = newNode;

        size++;
    }
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.traverse();
//        singlyLinkedList.AtStart(5);
        singlyLinkedList.traverse();
    }
}
