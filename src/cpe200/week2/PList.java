package cpe200.week2;

public class PList {

    public PList() {
        head = tail = null;
    }

    public void pushToHead(char i) {
        head = new PNode(i, head, null);
        if (tail == null)
            tail = head;
        else
            head.next.prev = head;
        size++;
    }

    public void pushToTail(char i) {
        PNode newNode = new PNode(i, null, null);
        if (head == null) {
            tail = head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public char popHead() {
        char i = head.data;
        PNode tmp = head;

        if (head == tail)
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
        if (tail == null)
            throw new RuntimeException("PList is Empty");
        char ret = tail.data;
        if(tail.prev == null) {
            tail = head = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return ret;
    }

    public boolean search(char i) {
        PNode cursor = head;
        boolean ret = false;
        while (cursor != null) {
            if (cursor.data == i) {
                ret = true;
                break;
            }
            cursor = cursor.next;
        }
        return ret;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void printForward() {
        PNode tmp = head;
        StringBuilder str = new StringBuilder();
        while (tmp != null) {
            str.append(tmp.data);
            tmp = tmp.next;
        }
        System.out.println(str.toString());
    }

    public void printBackward() {
        PNode tmp = tail;
        StringBuilder str = new StringBuilder();
        while (tmp != null) {
            str.append(tmp.data);
            tmp = tmp.prev;
        }
        System.out.println(str.toString());
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size = 0;
}
