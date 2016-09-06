package cpe200.week2;

//okay run pass ._.;

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

        if (head == null)
            {
            head = new PNode(i, head, null);
            tail = head;
            }
        else
        tail = new PNode(i, null, tail);

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
        char i = tail.data;
        PNode tmp = tail;

        if (head == tail)
            head = tail = null;
        else
            {
            tail = tail.prev;
            tail.next = null;
            tmp.prev = null;
            }

        size--;

        return i;
    }

    public boolean search(char i) {
        PNode tmp = head;
        while (tmp.data != i)
        {
            if (tmp.next != null)
            {
                tmp = tmp.next;
            }
            else return false;
        }
        return true;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            System.out.printf(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = tail;

        while (tmp != null){
            System.out.printf(tmp.data + " ");
            tmp = tmp.prev;
        }
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
