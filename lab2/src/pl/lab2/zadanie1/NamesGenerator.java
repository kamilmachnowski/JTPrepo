package pl.lab2.zadanie1;

public class NamesGenerator {
    private final int namesQuantity = 15;
    private String[] names = new String[namesQuantity];
    private String[] surnames = new String[namesQuantity];
    private ClientsCollection clientsCollection;

    NamesGenerator() {
        names[0] = "Adrian";
        names[1] = "Michal";
        names[2] = "Justyna";
        names[3] = "Ada";
        names[4] = "Amelia";
        names[5] = "Kamil";
        names[6] = "Jakub";
        names[7] = "Wiktor";
        names[8] = "Lisa";
        names[9] = "Magalena";
        names[10] = "Lena";
        names[11] = "Zosia";
        names[12] = "Lukasz";
        names[13] = "Szymon";
        names[14] = "Karol";

        char letter = 97;
        for (int i = 0; i < surnames.length; i++) {
            surnames[i] = letter++ + "backi";
        }
    }

    public ClientsCollection getClientsCollection() {
        clientsCollection = new ClientsCollection();
        for (int i = 0; i < namesQuantity; i++) {
            clientsCollection.addClient(names[i], surnames[i]);
        }
        return clientsCollection;
    }
}
