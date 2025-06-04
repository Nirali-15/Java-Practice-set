class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class CLL {
    public static Node insertAtBeginning(Node last,
            int value) {
        Node newNode = new Node(value);

        // If the list is empty, make the new node point to
        // itself and set it as last
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }
        // Insert the new node at the beginning
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }

    // Function to print the circular linked list
    public static void printList(Node last) {
        if (last == null)
            return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data + " ");
            head = head.next;
            if (head == last.next)
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);
        Node last = first.next.next;
        last.next = first;

        System.out.println();
        printList(last);
        last = insertAtBeginning(last, 5);

        System.out.print(
                "List after inserting 5 at the beginning: ");
        printList(last);
    }
}