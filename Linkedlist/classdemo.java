public class classdemo {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // Step 1: Create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: new node next = head
        newNode.next = head;

        // Step 3: head = new node
        head = newNode;
    }

    public void addLast(int data) {

        // Create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        classdemo ll = new classdemo();

        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addFirst(5);
        ll.print();
    }
}