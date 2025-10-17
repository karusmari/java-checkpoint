package group3.CircularLinkedList;

public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || head == null) {
            return -1;
        }
        Node current = head; // start at head
        // call next() exactly 'index' times so it prints as tests expect
        for (int i = 0; i < index; i++) {
            current = next(current); //this means we are using the private next() method
        }
        return current.value; // return the value of the found node
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            // traverse to tail using next() so it prints on each step
            while (current.next != head) {
                current = next(current);
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (head == null || index < 0) {
            return;
        }

        // remove head as a special case (index == 0)
        if (index == 0) {
            if (size == 1) {
                head = null;
            } else {
                // find tail so we can re-link it to the new head
                Node tail = head;
                while (tail.next != head) {
                    tail = next(tail);
                }
                head = head.next;
                tail.next = head;
            }
            size--;
            if (size == 0) head = null;
            return;
        }

        // For index > 0: traverse exactly 'index' times using next()
        Node prev = head;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = next(curr);
        }

        // remove curr
        prev.next = curr.next;
        // if the removed node is the head (when index wraps around), update head
        if (curr == head) {
            head = curr.next;
        }

        size--;
        if (size == 0) head = null;
    }

    @Override
    public int size() {
        return size;
    }

    // private helper used for traversal; prints when called (required by tests)
    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }
}
