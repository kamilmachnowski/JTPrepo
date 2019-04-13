package pl.lab3.zadanie1;

public class MyException extends Exception {
    MyException(String string) {
        super(string);
        printStackTrace();
    }
}
