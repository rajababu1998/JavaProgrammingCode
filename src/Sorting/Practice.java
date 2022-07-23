package Sorting;

public class Practice {
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

    private void traverse() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.traverse();
        practice.insertAtStart(4);
        practice.insertAtStart(5);
    }
}
