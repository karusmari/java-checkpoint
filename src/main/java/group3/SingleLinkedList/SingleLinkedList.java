package group3.SingleLinkedList;

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
        Node current = head; // alustame esimesest nodest
        for (int i = 0; i < index; i++) { // tsükkel, mis jookseb kuni indexini
            current = next(current); // kasutame next meetodit, mis prindib "Go to next node"
        }
        return current.value; // tagastame leitud node väärtuse
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value); // loome uue node
        if (head == null) { // kui list on tyhi, siis
            head = newNode; // paneme uue node listi esimeseks
        } else {
            Node current = head; // kui list ei ole tyhi, siis alustame esimesest nodest
            while (current.next != null) { // tsükkel, mis jookseb kuni viimase nodeni
                current = next(current); // kasutame next meetodit, mis prindib "Go to next node"
            }
            current.next = newNode; // paneme viimase node järgmise node uue nodeks
        }
        size++; // suurendame suurust
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size || head == null) {
            return;
        }

        // ainult esimese vaguni eemaldamine
        if (index == 0) { // kui tahame eemaldada esimese vaguni, siis
            head = head.next; // lihtsalt liigume edasi yhe vaguni
            size--; //vähendame suurust ja
            return; // tagastame
        }

        Node prev = head; // eelnev vagun
        Node curr = head; // praegune vagun
        for (int i = 0; i < index; i++) { // tsükkel, mis jookseb kuni indexini
            prev = curr; // eelnev vagun saab praeguse vaguni
            curr = next(curr); // praegune vagun saab järgmise vaguni
        }
        prev.next = curr.next; // votame eelneva vaguni(prev) ja paneme sellesse praeguse vaguni(curr) järgmise vaguni
        // ja seega me eemaldame selle vaguni
        size--; // vähendame suurust
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.print("Go to next node\n"); // prindib kui kutsutakse
        return node.next; // tagastab järgmise vaguni
    }
}