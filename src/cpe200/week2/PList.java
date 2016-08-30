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
        PNode temp = new PNode(i, head, null);
        temp.data = i;
        tail.next = temp;
        temp.next = null;
        temp.prev = tail;
        tail = temp;
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
        // implement your code here
        char temp = tail.data;
        if(head == tail){
            head=tail=null;
        }else{
            tail = tail.prev;
            tail.next = null;
            size--;

        }
        return temp;
    }

    public boolean search(char i) {
        // implement your code here
        PNode temp = head;
        while (temp != null){
            if(temp.data == i){
                return true;
            }
            temp = temp.next;
        }
        return  false;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data);
            tmp = tmp.next;
            // implement your code here
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = tail;

        while (tmp != head) {
            System.out.print(tmp.data);
            tmp = tmp.prev;
            // implement your code here
        }
        if(tmp == null){
            System.out.print(tmp.data);
        }

        System.out.println();
        // implement your code here
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
