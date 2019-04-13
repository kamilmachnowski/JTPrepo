package pl.lab3.zadanie1;

public class MyExceptionTheSecond extends Exception {
    MyExceptionTheSecond(String string) {
        super(string);
        printStackTrace();
    }
}
