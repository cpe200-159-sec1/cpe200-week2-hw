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

        PNode tmp = head;

        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.data = i;



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
        // implement your code here

        PNode tmp = head;
        PNode Ptmp = head;

        while (tmp.next != null){
            Ptmp = tmp;
            tmp = tmp.next;
        }

        char i = tmp.data;
        Ptmp = null;                        //delete data

        return i;


    }

    public boolean search(char i) {
        // implement your code here
        PNode tmp = head;

        while (tmp.data != i && tmp.next != null){

            tmp = tmp.next;
        }

        if (tmp.data == i){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            // implement your code here
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        // implement your code here
        PNode tmp = head;

        while (tmp.next != null){
            tmp = tmp.next;
        }

        while (tmp.prev != null){
            System.out.print(tmp.data);
            tmp = tmp.prev;
        }

    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
