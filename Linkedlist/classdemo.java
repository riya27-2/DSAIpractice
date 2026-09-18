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
    public static int size;

    public void addFirst(int data) {

        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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

    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i < idx-1){
            temp =temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {

        classdemo ll = new classdemo();


        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);

        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
    }
}