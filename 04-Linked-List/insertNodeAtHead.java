import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class insertNodeAtHead {

    // Node class
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a node at the head
    static SinglyLinkedListNode insertNodeAtHead(
            SinglyLinkedListNode head, int data) {

        // Create a new node
        SinglyLinkedListNode newNode =
                new SinglyLinkedListNode(data);

        // New node points to current head
        newNode.next = head;

        // New node becomes the new head
        head = newNode;

        return head;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        // Number of elements
        int n = Integer.parseInt(br.readLine());

        // Initially list is empty
        SinglyLinkedListNode head = null;

        // Insert every element at the head
        for (int i = 0; i < n; i++) {

            int data = Integer.parseInt(br.readLine());

            head = insertNodeAtHead(head, data);
        }

        // Print the linked list
        SinglyLinkedListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}