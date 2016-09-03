package cpe200.week2;

public class PNode {
    public char data;
    public PNode next, prev; // next position & previous position

    public PNode() { next = prev = null; }
    public PNode(char i, PNode next, PNode prev) {
        data = i;
        this.next=next;
        this.prev=prev;
    }
}
