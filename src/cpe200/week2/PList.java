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
        // implement your code here
        PNode newnode = new PNode(i,tail.prev,null);
        tail = newnode;
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
        //
        char i = tail.data;
        tail=tail.prev;
        tail.next=null;

        size--;
        return  i;
    }

    public boolean search(char i) {
        // implement your code here
        PNode currentnode = head;
        while (currentnode!=null){
            if(i== currentnode.data){
                return true;
            }
            currentnode= currentnode.next;
        } return false;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            // implement your code here
            System.out.print(tmp.data);
            tmp=tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        // implement your code here
        PNode tmp = tail;

        while (tmp!=null){
            System.out.print(tmp.data);
            tmp=tmp.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
