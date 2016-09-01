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
        if(head.next!=null) {
            tail.next = new PNode(i,null,tail);
            tail = tail.next;
            size++;
        }
        else if(head.next==null)
        {
            head.next=new PNode(i,null,head);
            tail=head.next;
            size++;
        }
        else
        {
            head=new PNode(i,null,null);
            tail=head;
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
        if(head!=null)
        {
            char temp=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return temp;
        }
        else return ' ';
    }

    public boolean search(char i) {
        PNode scan=head;
        while (scan!=null)
        {
            if(scan.data==i) return true;
            scan=scan.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = tail;

        while (tmp.prev!= null) {
            System.out.print(tmp.data+" ");
            tmp=tmp.prev;
        }
        System.out.print(tmp.data+" ");
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
