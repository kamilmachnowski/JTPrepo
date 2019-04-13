package pl.lab3.zadanie1;

public class MyExceptionTheThird extends Exception {
    MyExceptionTheThird(String string) {
        super(string);
        printStackTrace();
    }
}
