package pl.lab2.zadanie2;

public class Anchor {
    private Element first;
    private Element last;

    public void insertAtTheFront(int x) {
        first.setVal(x);
    }

    public void insertAtTheEnd(int x) {
        last.setVal(x);
    }

    public void removeFirst() {
        first.deleteVal();
    }

    public void removeLast() {
        last.deleteVal();
    }
}
