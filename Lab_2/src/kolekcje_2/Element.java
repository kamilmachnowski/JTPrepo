package kolekcje_2;

public class Element {
    private int val;
    private Element next;

    public Element(int newVal) {
        val = newVal;
        next = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
