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
        tail.next=new PNode(i,tail.prev,tail);
        tail.next=null;
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
        if(tail.prev!=head){
            tail.prev=tail.prev.prev;
        }
        return i;
    }

    public boolean search(char i) {
        PNode currentNode=head;
        while(currentNode.data!=i){
            currentNode=currentNode.next;
            if(currentNode.data==i)
                return true;
        }
        return false;

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
