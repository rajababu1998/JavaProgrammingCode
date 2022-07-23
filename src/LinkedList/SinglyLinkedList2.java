package LinkedList;

public class SinglyLinkedList2 {
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

    //traversing the list
    private void traverse() {
        System.out.println("Current size: " + size);
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                /*
                System.out.println("data: " + temp.data);
                System.out.println("current node address: " + temp);
                System.out.println("next node address: " + temp.next);
                System.out.println("-------------");
                 */
                temp = temp.next;
            }
            System.out.println();
        }
    }

    //insert a node at the beginning of the linked list
    private void insertAtStart(int data) {
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

    //insert the new node at the given position
    private void insertAtPosition(int data, int position) {
        if(position < 1 || position > (size + 1)) {
            System.out.println("Invalid position");
        }
        else {
            if(position == 1) {
                insertAtStart(data);
            }
            else if(position == (size + 1)) {
                insertAtEnd(data);
            }
            else {
                Node temp = head;
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }

                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }
    }

    //insert the new node at the end of the linked list
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;

        size++;
    }

    private void delete(int position) {
        if(position < 1 || position > size) {
            System.out.println("Invalid position");
        }
        else {
            Node temp = head;
            if(position == 1) {
                head = head.next;
                temp.next = null;
            }
            else {
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }

                Node delete = temp.next;
                temp.next = delete.next;
                delete.next = null;

                if(temp.next == null) {
                    tail = temp;
                }
            }
            size--;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList2 singlyLinkedList2 = new SinglyLinkedList2();
        singlyLinkedList2.traverse();

         singlyLinkedList2.insertAtEnd(8);
//        singlyLinkedList2.insertAtEnd(-10);
//        singlyLinkedList2.insertAtEnd(20);
        singlyLinkedList2.traverse();
//        singlyLinkedList2.insertAtStart(-100);
//        singlyLinkedList2.insertAtStart(-50);
//        singlyLinkedList2.traverse();
//
//        singlyLinkedList2.insertAtPosition(1000, -2);
//        singlyLinkedList2.insertAtPosition(2000, 0);
//        singlyLinkedList2.insertAtPosition(3000, 7);
//        singlyLinkedList2.insertAtPosition(10000, 3);
//        singlyLinkedList2.traverse();
//        singlyLinkedList2.insertAtPosition(20000, 1);
//        singlyLinkedList2.traverse();
//        singlyLinkedList2.insertAtPosition(30000, 8);
//
//        singlyLinkedList2.traverse();
//
//        singlyLinkedList2.delete(1);
//        singlyLinkedList2.traverse();
//        singlyLinkedList2.delete(7);
//        singlyLinkedList2.traverse();
//        singlyLinkedList2.delete(4);
//        singlyLinkedList2.traverse();
    }
}
