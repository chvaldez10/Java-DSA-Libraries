package myLibrary.DataStructures.LL;

public class CircularSinglyLinkedList {
    class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public Node getHead() { return this.head; }

    public Node getTail() { return this.tail; }

    public int getSize() { return this.size; }

    /**
     * If the list is empty, create a new node and
     *      make point to itself
     * @param data to add
     */
    private void addToEmpty(int data) {
        if ( isEmpty() ) {
            Node newNode = new Node(data);
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
        }
    }

    /**
     * Add data to the end of the list
     * @param data data of the new node
     */
    public void insert(int data) {
        if (isEmpty()) {
            addToEmpty(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
        size ++;
    }

    /**
     * Insert at the beginning of the list
     * @param data data of the beginning of the node
     */
    public void insertAtBeginning(int data){
        if (isEmpty()) {
            addToEmpty(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
        size++;
    }

    /**
     * Insert node at given position
     * @param data
     * @param position
     */
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 1 || isEmpty()) {
            if (isEmpty()) addToEmpty(data);
            else{
                newNode.next = head;
                tail.next = newNode;
                tail = newNode;
            }
        } else {
            Node current = head;
            int i = 2;
            while (i < position) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == head) {
                tail = newNode;
            }
        }
    }

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() { return head == null; }

    /**
     * Traverse linked list and print to terminal
     */
    public void display() {
        if(isEmpty()) {
            System.out.println(" Circular Singly Linked List is Empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head );
        System.out.println();
    }
}
