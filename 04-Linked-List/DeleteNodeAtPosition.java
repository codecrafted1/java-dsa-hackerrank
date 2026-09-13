import java.io.*;
import java.util.*;

public class DeleteNodeAtPosition {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static SinglyLinkedListNode deleteNode(
            SinglyLinkedListNode llist, int position) {

        // If we have to delete the head (position 0)
        if (position == 0) {
            return llist.next;
        }

        // Move to the node just before the node to delete
        SinglyLinkedListNode current = llist;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // Skip the node we want to delete
        current.next = current.next.next;

        return llist;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SinglyLinkedListNode head = null;
        SinglyLinkedListNode tail = null;

        // Create the linked list
        for (int i = 0; i < n; i++) {

            int data = Integer.parseInt(br.readLine());

            SinglyLinkedListNode newNode =
                    new SinglyLinkedListNode(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Position to delete
        int position = Integer.parseInt(br.readLine());

        // Delete node
        head = deleteNode(head, position);

        // Print the modified list
        SinglyLinkedListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

