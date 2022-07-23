package Arrays;

public class tes {
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    private void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        else {
            tail = newNode;
        }
        head = newNode;
    }
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    private void insertAtAnyPosition(int data,int position) {
        int cp = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            cp++;
        }
        if (position == 1) {
            insertAtStart(data);
        }
        else if (position == (size+1)) {
            insertAtEnd(data);
        }
        else {
            Node newNode = new Node(data);
        }
    }
}
