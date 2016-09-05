package cpe200.week2;

public class PList {

    public PList() { head = tail = null; }

    public void pushToHead(char i) {
        head = new PNode(i, head, null);
        if (tail==null)
            tail = head;
        else
            head.next.prev = head;
        size++;
    }

    public void pushToTail(char i) {
        tail = new PNode(i, tail, null);
        if (head==null)
            head = tail;
        else
            tail.prev.next = tail;
        size++;
    }

    public char popHead() {
        char i=head.data;
        PNode tmp = head;

        if (head==tail)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
            tmp.next = null;
        }

        size--;

        return i;
    }

    public char popTail() {
        char i=tail.data;
        PNode tmp = tail;

        if (tail==head)
            tail = head = null;
        else {
            tail = tail.prev;
            tail.next = null;
            tmp.prev = null;
        }

        size--;

        return i;
    }

    public boolean search(char i) {
        return true;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            // implement your code here
        }
        System.out.println();
    }

    public void printBackward() {
        // implement your code here
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
