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

    public void pushToTail(char i) // Didn't use
    {
        tail  = new PNode();

        if(head == null) {
            head = tail;
        }else {
            tail.prev = tail;
            size++;
        }

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
        char Pos = tail.data;
        PNode Last = tail;

        if(tail == head) {
            tail = head = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            Last.prev = null;
        }
        size--;
        return Pos;
    }

    public boolean search(char i) {
        // implement your code here
        PNode curr = head;
        while(curr != null){
            if(curr.data == i)
                return true;
            curr = curr.next;
        }return false;

    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode First = head;

        while (First != null) {
            System.out.print(First.data);
            First = First.next ;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode Last = tail;
        while (Last != null) {
            System.out.print(Last.data);
            Last = Last.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}