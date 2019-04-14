public class Main
{
    public static void main(String[] args)
    {
        Anchor anchor = new Anchor();

        anchor.removeLast();
        anchor.removeFirst();

        anchor.insertAtTheEnd(4);
        System.out.println("Dodano 4");
        anchor.show();

        anchor.removeFirst();
        System.out.println("Usunieto 4");
        anchor.show();

        anchor.insertAtTheFront(1);
        System.out.println("Dodano 1");
        anchor.show();

        anchor.removeLast();
        System.out.println("Usunieto 1");
        anchor.show();

        anchor.insertAtTheFront(2);
        anchor.insertAtTheFront(3);
        anchor.insertAtTheEnd(3);
        System.out.println("Dodano 2(front), 3(front), 3(end)");
        anchor.show();

        anchor.removeFirst();
        System.out.println("Usunieto 3(first)");
        anchor.show();

        anchor.removeLast();
        System.out.println("Usunieto 3(last)");
        anchor.show();
    }
}
