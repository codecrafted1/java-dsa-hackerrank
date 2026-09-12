import java.io.*;
//import java.util.*;

public class InsertNodeAtTail {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(
            SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode =
            new SinglyLinkedListNode(data);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // Find the last node
        SinglyLinkedListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Add new node at the tail
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SinglyLinkedListNode head = null;

        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(br.readLine());

            head = insertNodeAtTail(head, data);
        }

        // Print linked list
        SinglyLinkedListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
