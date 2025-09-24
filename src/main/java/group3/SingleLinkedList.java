public class SingleLinkedList implements LinkedList {
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
        if (index < 0 || index >= size || head == null) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = next(current); // prints "Go to next node"
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = next(current); // traverse to the last node
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size || head == null) {
            return;
        }

        if (index == 0) { // remove head
            head = head.next;
            size--;
            return;
        }

        Node prev = head;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = next(curr); // traverse using next()
        }
        prev.next = curr.next; // bypass the node to remove
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }
}